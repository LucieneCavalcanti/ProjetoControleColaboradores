create database bdColaboradores

create table tbstatus(
    id int not null primary key identity,
    descricao varchar(30) not null
)
create table tbcargos(
    id int not null primary key identity,
    descricao varchar(100) not null
)
create table tbusuarios(
    id int not null primary key identity,
    nome varchar(100) not null,
    email varchar(100) not null,
    senha varchar(100) not null,
    idStatus int not null,
    foreign key (idStatus) references tbstatus(id)
)