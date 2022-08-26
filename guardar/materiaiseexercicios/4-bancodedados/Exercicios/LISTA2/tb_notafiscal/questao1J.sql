-- j) Qual o valor médio dos descontos dados por produto.
-- As colunas presentes no resultado da consulta são: COD_PROD, MEDIA.
-- Agrupe o resultado da consulta por COD_PROD.

SELECT COD_PROD, ROUND(AVG(DESCONTO), 2) AS MEDIA
FROM tb_notafiscal
GROUP BY COD_PROD;