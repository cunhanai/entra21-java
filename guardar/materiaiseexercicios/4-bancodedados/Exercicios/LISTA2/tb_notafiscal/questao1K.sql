-- k) Qual o menor, maior e o valor médio dos descontos dados por produto.
-- As colunas presentes no resultado da consulta são: COD_PROD, MENOR, MAIOR, MEDIA.
-- Agrupe o resultado da consulta por COD_PROD.

SELECT COD_PROD, MIN(DESCONTO) AS MENOR, MAX(DESCONTO) AS MAIOR, ROUND(AVG(DESCONTO), 2) AS MEDIA
FROM tb_notafiscal
GROUP BY COD_PROD;

