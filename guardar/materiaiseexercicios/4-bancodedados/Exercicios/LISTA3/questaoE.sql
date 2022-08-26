-- e) Listar os nomes dos Cliente seguido dos dados do pedido e os itens do pedido

select c.nome, pd.*, pc.descricao, i.qtde
from tb_clientes c
