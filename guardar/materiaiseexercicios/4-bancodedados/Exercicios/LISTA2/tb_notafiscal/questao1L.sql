-- l) Quais as NF que possuem mais de 3 itens vendidos. As colunas presentes no resultado 
-- da consulta são: ID_NF, QTD_ITENS. OBS:: NÃO ESTÁ RELACIONADO A QUANTIDADE 
-- VENDIDA DO ITEM E SIM A QUANTIDADE DE ITENS POR NOTA FISCAL. Agrupe o 
-- resultado da consulta por ID_NF.

SELECT ID_NF, SUM(QUANTIDADE) AS QTD_ITENS
FROM tb_notafiscal
GROUP BY ID_NF
HAVING QTD_ITENS > 3;

-- OUTRA INTERPRETACAO

SELECT ID_NF, COUNT(ID_NF) AS QTD_ITENS
FROM tb_notafiscal
GROUP BY ID_NF
HAVING QTD_ITENS > 3;

-- OU

SELECT ID_NF, MAX(ID_ITEM) AS QTD_ITENS
FROM tb_notafiscal
GROUP BY ID_NF
HAVING QTD_ITENS > 3;