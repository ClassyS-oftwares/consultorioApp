drop database clinica;
create database clinica;
use clinica;

create table cliente(
cod_cliente int primary key auto_increment,
nome_cliente varchar(20) not null,
sobrenome varchar(50) not null,
rg varchar(9) not null,
cpf bigint not null,
data_nascimento date not null
);

#drop table cliente;

create table endereco(
cod_cliente int,
cep int(8) not null,
rua_avenida varchar(50) not null,
bairro varchar(50) not null,
cidade varchar (50) not null,
estado varchar (50) not null,
foreign key (cod_cliente) references cliente(cod_cliente)
);

#drop table endereco;

create table doutor(
cod_doutor int primary key auto_increment,
nome_doutor varchar(20) not null,
sobrenome_doutor varchar(50) not null,

);