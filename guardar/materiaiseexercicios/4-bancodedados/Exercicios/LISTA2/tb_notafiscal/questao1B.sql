-- b) Pesquise os itens que foram vendidos com desconto. As colunas presentes no 
-- resultado da consulta são: ID_NF, ID_ITEM, COD_PROD, VALOR_UNIT E O VALOR 
-- VENDIDO. OBS: O valor vendido é igual ao VALOR_UNIT -
-- (VALOR_UNIT*(DESCONTO/100)).

SELECT ID_NF, ID_ITEM, COD_PROD, VALOR_UNIT,
	ROUND(VALOR_UNIT-(VALOR_UNIT*(DESCONTO/100)),2) AS VALOR_VENDIDO
FROM tb_notafiscal
WHERE DESCONTO IS NOT NULL;