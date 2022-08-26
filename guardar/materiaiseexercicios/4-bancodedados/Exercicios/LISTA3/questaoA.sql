-- a) Listar os nomes e endereco dos clientes , seguido do nome do vendedor que atendeu.

select c.Nome, c.endereco, v.nome as vendedor
from tb_cliente c
inner join tb_vendedor v on c.COD_Vendedor = v.COD_Vendedor;
