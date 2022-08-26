-- b) Listar os nomes dos clientes, seguido do código do seu pedido, ordenados por nome e posteriormente por codigo.

select c.Nome, p.COD_Pedido
from tb_cliente c
left join tb_pedido p on c.COD_Cliente = p.COD_Cliente
order by c.Nome asc, p.COD_Pedido asc;