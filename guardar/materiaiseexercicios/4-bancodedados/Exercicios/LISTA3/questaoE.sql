-- e) Listar os nomes dos Cliente seguido dos dados do pedido e os itens do pedido

select c.nome, pd.COD_Pedido, pd.dt_pedido, pc.descricao, i.qtde
from tb_cliente c, tb_pedido pd, tb_item i, tb_peca pc
where pd.COD_Cliente = c.COD_Cliente
	and i.COD_Pedido = pd.COD_Pedido
	and pc.COD_Peca = i.COD_peca;
