-- c) Listar os Clientes do vendedor que começa com a letra b que fizeram pedidos

select c.nome as cliente, v.nome as vendedor
from tb_cliente c
inner join tb_vendedor v
	on v.COD_Vendedor = c.COD_Vendedor
    and v.nome like 'B%'
inner join tb_pedido p
    on p.COD_Cliente = c.COD_Cliente;

-- com where

select c.nome as cliente, v.nome as vendedor
from tb_cliente c, tb_vendedor v, tb_pedido p
where v.COD_Vendedor = c.COD_Vendedor
    and v.nome like 'B%'
    and p.COD_Cliente = c.COD_Cliente;