-- 1.a) Pesquise os itens que foram vendidos sem desconto. As colunas presentes no 
-- resultado da consulta são: ID_NF, ID_ITEM, COD_PROD E VALOR_UNIT

SELECT ID_NF, ID_ITEM, COD_PROD, VALOR_UNIT
FROM tb_notafiscal
WHERE DESCONTO is null;
