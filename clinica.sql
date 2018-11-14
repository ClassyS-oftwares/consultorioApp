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

create table paciente(
id_paciente int not null primary key auto_increment,
id_pessoa int not null,
#presenca boolean
)engine=innodb;

alter table doutor add constraint fk_pessoa_doutor foreign key (id_pessoa) references pessoa(id_pessoa);

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

alter table endereco add constraint fk_pessoa_endereco foreign key (id_pessoa) references pessoa(id_pessoa);

create table consulta(
id_consulta int not null primary key auto_increment,
id_paciente int not null,
id_doutor int not null,
data_consulta date not null,
horario_consulta time not null
)engine=innodb;

create table Pagamento(
id_pagamento int not null primary key auto_increment,
#status_pgto boolean
valor_pgto decimal (5,2) not null default 000.00,
data_pgto date not null,
forma enum('Dinheiro','Debito') not null default 'Dinheiro'
)engine=innodb;

create table agenda(
id_agenda int not null primary key auto_increment,
id_doutor int not null,
dia date not null,
horario time not null,
#cancelamento boolean
)engine=innodb;

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