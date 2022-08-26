-- INSERT INTO ALUNOS

insert into tb_alunos
values (2015010101, 'JOSE DE ALENCAR', 'RUA DAS ALMAS', 'NATAL');

insert into tb_alunos
values (2015010102, 'JOÃO JOSÉ', 'AVENIDA RUY CARNEIRO', 'JOÃO PESSOA');

insert into tb_alunos
values (2015010103, 'MARIA JOAQUINA', 'RUA CARROSSEL', 'RECIFE');

insert into tb_alunos
values (2015010104, 'MARIA DAS DORES', 'RUA DAS LADEIRAS', 'FORTALEZA');

insert into tb_alunos
values (2015010105, 'JOSUÉ CLAUDINO DOS SANTOS', 'CENTRO', 'NATAL');
 
insert into tb_alunos
values (2015010106, 'JOSUÉLISSON CLAUDINO DOS SANTOS', 'CENTRO', 'NATAL');

-- INSERT INTO DISCIPLINAS

insert into tb_disciplinas
values ('BD', 'BANCO DE DADOS', 100);

insert into tb_disciolinas
values ('POO', 'PROGRAMAÇÃO COM ACESSO A BANCO DE DADOS', 100);

insert into tb_disciplinas
values ('WEB', 'AUTORIA WEB', 50);

insert into tb_disciplinas
values ('ENG', 'ENGENHARIA DE SOFTWARE', 80);

-- INSERT INTO PROFESSORES

insert into tb_professores
values (212131, 'NICKERSON FERREIRA', 'RUA MANAÍRA', 'JOÃO PESSOA');

insert into tb_professores
values (122135, 'ADORILSON BEZERRA', 'AVENIDA SALGADO FILHO', 'NATAL');

insert into tb_professores
values (192011, 'DIEGO OLIVEIRA', 'AVENIDA ROBERTO FREIRE', 'NATAL');

-- INSERT INTO TURMA 

insert into tb_turma
values ('BD', 1, 212131, 2015, '11H-12H');

insert into tb_turma
values ('BD', 2, 212131, 2015, '13H-14H');

insert into tb_turma
values ('POO', 1, 192011, 2015, '08H-09H');

insert into tb_turma
values ('WEB', 1, 192011, 2015,'07H-08H');

insert into tb_turma
values ('ENG', 1, 122135, 2015, '10H-11H');
