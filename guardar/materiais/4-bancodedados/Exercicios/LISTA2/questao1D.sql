-- d) Pesquise os itens que foram vendidos. As colunas presentes no resultado da consulta 
-- são: ID_NF, ID_ITEM, COD_PROD, VALOR_UNIT, VALOR_TOTAL, DESCONTO, 
-- VALOR_VENDIDO. OBS: O VALOR_TOTAL é obtido pela fórmula: QUANTIDADE * 
-- VALOR_UNIT. O VALOR_VENDIDO é igual a VALOR_UNIT -
-- (VALOR_UNIT*(DESCONTO/100))

SELECT ID_NF, ID_ITEM, COD_PROD, VALOR_UNIT, (QUANTIDADE * VALOR_UNIT) AS VALOR_TOTAL, DESCONTO, 
	ROUND(VALOR_UNIT*QUANTIDADE - (VALOR_UNIT*QUANTIDADE*DESCONTO/100), 2) AS VALOR_VENDIDO
FROM tb_notafiscal;