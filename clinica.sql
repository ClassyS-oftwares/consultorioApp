#drop database clinica;
create database clinica;
use clinica;

create table pessoa(
id_pessoa int primary key auto_increment,
nome varchar(20) not null,
sobrenome varchar(50) not null,
rg varchar(9) not null,
cpf bigint not null,
data_nascimento date not null
)engine=innodb;

create table doutor(
id_doutor int not null primary key auto_increment,
id_pessoa int not null,
crm int not null unique,
especialidade varchar(50) not null
)engine=innodb;

#Criando chave estrangeira para doutor herdar colunas de pessoa
alter table doutor add constraint fk_pessoa_doutor foreign key (id_pessoa) references pessoa(id_pessoa);

create table paciente(
id_paciente int not null primary key auto_increment,
id_pessoa int not null,
presenca tinyint unsigned not null default 0
)engine=innodb;

#Reaproveitando uma coluna para uma outra função
alter table paciente change presenca pendencia tinyint unsigned not null default 0;
#Criando chaves estrangeiras para paciente herdar colunas de pessoa
alter table paciente add constraint fk_pessoa_paciente foreign key (id_pessoa) references pessoa(id_pessoa);

create table endereco(
id_endereco int not null primary key auto_increment,
id_pessoa int not null,
cep int(8) not null,
logradouro varchar(50) not null,
numero int (5) not null,
bairro varchar(50) not null,
cidade varchar (50) not null,
estado varchar (50) not null
);

#Criando chaves estrangeiras para relacionar uma pesso e seu endereço
alter table endereco add constraint fk_pessoa_endereco foreign key (id_pessoa) references pessoa(id_pessoa);

create table consulta(
id_consulta int not null primary key auto_increment,
id_paciente int not null,
id_doutor int not null,
data_consulta date not null,
horario_consulta time not null
)engine=innodb;

#Criando chaves estrangeiras de consulta
alter table consulta add constraint fk_paciente_consulta foreign key (id_paciente) references pessoa(id_pessoa);
alter table consulta add constraint fk_doutor_consulta foreign key (id_doutor) references doutor(id_doutor);

create table Pagamento(
id_pagamento int not null primary key auto_increment,
status_pgto tinyint unsigned not null default 0,
valor_pgto decimal (5,2) not null default 000.00,
data_pgto date not null,
forma enum('Dinheiro','Debito') not null default 'Dinheiro'
)engine=innodb;

#dicionando chave estrangeira
alter table pagamento add column id_consulta int not null;
alter table pagamento add constraint  fk_consulta_pagamento foreign key (id_consulta) references consulta(id_consulta);

create table agenda(
id_agenda int not null primary key auto_increment,
id_doutor int not null,
dia date not null,
horario time not null,
cancelamento tinyint unsigned not null default 0
)engine=innodb;

alter table agenda add constraint fk_doutor_agenda foreign key (id_doutor) references doutor(id_doutor);

create table conta_login(
id_conta int not null primary key auto_increment,
id_doutor int not null,
email varchar(100) not null,
cpf char(11) not null,
senha varchar(128) not null,
lembrete_senha varchar(50) not null
)engine=innodb;

alter table conta_login add constraint fk_doutor_contalogin foreign key (id_doutor) references doutor(id_doutor);

create table telefone(
id_telefone int not null primary key auto_increment,
telefone_residencial char(10),
telefone_comercial char(11),
celular char(13) not null
)engine=innodb;

create table pessoa_has_telefone(
id_pessoa int not null,
id_telefone int not null,
foreign key (id_pessoa) references pessoa(id_pessoa),
foreign key (id_telefone) references telefone(id_telefone)
)engine=innodb;