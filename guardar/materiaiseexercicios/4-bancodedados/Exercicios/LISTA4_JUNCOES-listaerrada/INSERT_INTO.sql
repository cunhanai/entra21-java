-- ramo

insert into Ramo_Atividade (ds_ramo)
values ("ramo 1");

insert into Ramo_Atividade (ds_ramo)
values ("ramo 2");

insert into Ramo_Atividade (ds_ramo)
values ("ramo 3");

-- tipo assinante

insert into Tipo_Assinante (ds_tipo)
values ("tipo 1");

insert into Tipo_Assinante (ds_tipo)
values ("tipo 2");

-- municipio

insert into municipio (ds_municipio)
values ("Blumenau");

insert into municipio (ds_municipio)
values ("Natal");

insert into municipio (ds_municipio)
values ("João Câmara");

-- assinante

insert into Assinante
values (1, 'Ana', 1, 1);

insert into Assinante
values (2, 'Julio', 2, 1);

insert into Assinante
values (3, 'Breno', 1, 2);

insert into Assinante
values (4, 'Maria', 3, 1);

insert into Assinante
values (5, 'Paulo', 3, 1);

insert into Assinante
values (6, 'Clara', 3, 2);

-- endereco

insert into Endereco
values (1, "Rua 1", 'casa', 'bairro 1', 11111111, 1, 1);

insert into Endereco
values (2, "Rua 2", 'apto 12', 'bairro 2', 22222222, 2, 2);

insert into Endereco
values (3, "Rua 3", 'casa3', 'bairro 1', 33333333, 1, 3);

insert into Endereco
values (4, "Rua 4", 'casa', 'bairro 3', 44444444, 2, 2);

insert into Endereco
values (5, "Rua 5", 'casa', 'bairro 4', 55555555, 3, 4);

insert into Endereco
values (6, "Rua 6", 'casa', 'bairro 4', 66666666, 3, 5);

insert into Endereco
values (7, "Rua 7", 'casa', 'bairro 4', 77777777, 3, 6);

insert into Endereco
values (8, "Rua 7", 'casa', 'bairro 4', 88888888, 3, 5);

-- telefone

insert into telefone
values (1, 11, 111111111, 1);

insert into telefone
values (2, 11, 122222222, 2);

insert into telefone
values (3, 11, 133333333, 3);

insert into telefone
values (4, 11, 144444444, 4);

insert into telefone
values (5, 22, 222222222, 5);

insert into telefone
values (6, 22, 233333333, 6);

insert into telefone
values (7, 22, 244444444, 7);

insert into telefone
values (8, 22, 255555555, 8);

insert into telefone
values (9, 22, 266666666, 8);

insert into telefone
values (10, 11, 11222222, 1);
