create table tb_alunos (
	MAT int primary key,
    nome varchar(50) not null,
    endereco varchar(50) not null,
    cidade varchar(20) not null
);

create table tb_disciplinas (
	COD_DISC varchar(3) primary key,
    nome_disc varchar(20) not null,
    carga_hor int not null
);

create table tb_professores (
	COD_PROF int primary key,
    nome varchar(50) not null,
    endereco varchar(50) not null,
    cidade varchar(20) not null
);

create table tb_turma (
	COD_DISC varchar(3) not null,
    COD_TURMA int primary key,
    COD_PROF int not null,
    ANO int not null,
    horario varchar(7) not null,
    constraint fk_turmaDisc foreign key (COD_DISC) references tb_disciplinas(COD_DISC),
    constraint fk_turmaProf foreign key (COD_PROF) references tb_professores(COD_PROF)
);

create table tb_historico (
	COD_HIST int auto_increment primary key,
	MAT int not null,
    COD_DISC varchar(3) not null,
    COD_TURMA int not null,
    COD_PROF int not null,
    frequencia float not null,
    nota float not null,
    constraint fk_histMat foreign key (MAT) references tb_alunos(MAT),
    constraint fk_histDisc foreign key (COD_DISC) references tb_disciplinas(COD_DISC),
    constraint fk_histTurma foreign key (COD_TURMA) references tb_turma(COD_TURMA),
    constraint fk_histProf foreign key (COD_PROF) references tb_professores(COD_PROF)
);
-- ANO SERA COLOCADO APENAS NO SELECT
