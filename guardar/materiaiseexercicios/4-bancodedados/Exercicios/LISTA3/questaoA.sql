-- a) Listar os nomes e endereco dos clientes , seguido do nome do vendedor que atendeu.

select c.Nome as cliente, c.COD_Cliente as codigo, v.nome as vendedor
from tb_cliente c
left join tb_vendedor v on v.COD_Vendedor = c.COD_Vendedor;
