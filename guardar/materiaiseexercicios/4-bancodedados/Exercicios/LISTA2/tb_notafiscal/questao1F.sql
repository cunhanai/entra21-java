-- f) Pesquise o valor vendido das NF e ordene o resultado do maior valor para o menor.
-- As colunas presentes no resultado da consulta são: ID_NF, VALOR_VENDIDO.
-- OBS: O VALOR_TOTAL é obtido pela fórmula: ∑ QUANTIDADE * VALOR_UNIT.
--      O VALOR_VENDIDO é igual a ∑ VALOR_UNIT - (VALOR_UNIT*(DESCONTO/100)).
-- Agrupe o resultado da consulta por ID_NF.

SELECT ID_NF,
	ROUND(SUM(VALOR_UNIT*QUANTIDADE - (VALOR_UNIT*QUANTIDADE*DESCONTO/100)), 2) AS VALOR_VENDIDO
FROM tb_notafiscal
GROUP BY ID_NF
ORDER BY VALOR_VENDIDO DESC;