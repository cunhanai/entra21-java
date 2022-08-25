
-- g) Consulte o produto que mais vendeu no geral.
-- As colunas presentes no resultado da consulta são: COD_PROD, QUANTIDADE.
-- Agrupe o resultado da consulta por COD_PROD.

SELECT COD_PROD, MAX(QUANTIDADE) AS QUANTIDADE_TOTAL
FROM tb_notafiscal
GROUP BY COD_PROD;