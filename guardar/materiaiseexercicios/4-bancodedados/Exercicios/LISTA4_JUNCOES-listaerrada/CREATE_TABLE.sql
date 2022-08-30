create table Ramo_Atividade (
	cd_ramo int auto_increment primary key,
    ds_ramo varchar(50) not null
);

create table Tipo_Assinante (
	cd_tipo int auto_increment primary key,
    ds_tipo varchar(50) not null
);

create table Municipio (
	cd_municipio int auto_increment primary key,
    ds_municipio varchar(50) not null
);

create table Assinante (
	cd_assinante int auto_increment primary key,
    nm_assinante varchar(50) not null,
    cd_ramo int,
    cd_tipo int not null,
    constraint fk_cd_ramo foreign key (cd_ramo) references Ramo_Atividade(cd_ramo),
    constraint fk_cd_tipo foreign key (cd_tipo) references Tipo_Assinante(cd_tipo)
);

create table Endereco (
	cd_endereco int auto_increment primary key,
    ds_endereco varchar(50) not null,
    complemento varchar(15) not null,
    bairro varchar(20) not null,
    cep int not null,
    cd_municipio int not null,
    cd_assinante int not null,
    constraint fk_cd_municipio foreign key (cd_municipio) references Municipio(cd_municipio),
    constraint fk_cod_assinante foreign key (cd_assinante) references Assinante(cd_assinante)
);


create table Telefone (
	cd_fone int auto_increment primary key,
    ddd int not null,
    n_fone int not null,
    cd_endereco int not null,
    constraint fk_cod_endereco foreign key (cd_endereco) references Endereco(cd_endereco)
);

