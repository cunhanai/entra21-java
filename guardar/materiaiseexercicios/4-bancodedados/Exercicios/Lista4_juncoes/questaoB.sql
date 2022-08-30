-- b) Listar os nomes dos clientes, seguido do código do seu pedido, ordenados 
-- por nome e posteriormente por codigo.

select c.Nome as 'cliente', p.COD_Pedido
from tb_cliente c
left join tb_pedido p on p.COD_Cliente = c.COD_Cliente
order by c.Nome asc, p.COD_Pedido asc;