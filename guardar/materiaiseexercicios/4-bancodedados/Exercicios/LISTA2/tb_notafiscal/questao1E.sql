-- e) Pesquise o valor total das NF e ordene o resultado do maior valor para o menor. 
-- As colunas presentes no resultado da consulta são: ID_NF, VALOR_TOTAL.
-- OBS: O VALOR_TOTAL é obtido pela fórmula: ∑ QUANTIDADE * VALOR_UNIT. 
-- Agrupe o resultado da consulta por ID_NF

SELECT ID_NF, SUM(QUANTIDADE * VALOR_UNIT) AS VALOR_TOTAL
FROM tb_notafiscal
GROUP BY ID_NF
ORDER BY VALOR_TOTAL DESC;