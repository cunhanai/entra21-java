-- i) Pesquise o valor total das NF, onde esse valor seja maior que 500,
-- e ordene o resultado do maior valor para o menor.
-- As colunas presentes no resultado da consulta são: ID_NF, VALOR_TOT.
-- OBS: O VALOR_TOTAL é obtido pela fórmula: ∑ QUANTIDADE * VALOR_UNIT.
-- Agrupe o resultado da consulta por ID_NF.

SELECT ID_NF, SUM(QUANTIDADE * VALOR_UNIT) AS VALOR_TOT
FROM tb_notafiscal
GROUP BY ID_NF
HAVING VALOR_TOT > 500
ORDER BY VALOR_TOT DESC;