-- c) Altere o valor do desconto (para zero) de todos os registros onde este campo é nulo.

update tb_notafiscal
set DESCONTO = 0
where DESCONTO is null;