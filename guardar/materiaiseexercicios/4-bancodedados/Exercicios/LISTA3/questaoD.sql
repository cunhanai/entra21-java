-- d) Listar os nomes dos Clientes que possuem mais de um pedido.

select c.nome
from tb_cliente c
inner join tb_pedido p
	on c.COD_Cliente = p.COD_Cliente
group by p.COD_Cliente
having count(p.COD_Cliente) > 1;