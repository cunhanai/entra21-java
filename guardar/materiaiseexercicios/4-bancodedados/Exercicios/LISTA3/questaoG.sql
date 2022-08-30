-- g) Cria uma view do exercício da letra f

create or replace view letraG as
select 
	c.Nome as Nome_Cliente,
    c.COD_Cliente as cpf_cliente,
    v.nome as Nome_Vendedor,
    pd.dt_pedido as Data_pedido,
    i.qtde as qtde,
    i.COD_peca as Codigo_peca,
    i.COD_Pedido as Codigo_pedido,
    pc.descricao as Nome_Peca,
    (i.qtde * pc.preco) as total,
    a.endereco as Armazem
from tb_cliente c, tb_vendedor v, tb_pedido pd, tb_item i, tb_peca pc, tb_armazem a
where c.COD_Vendedor = v.COD_Vendedor
	and pd.COD_Cliente = c.COD_Cliente
    and i.COD_Pedido = pd.COD_Pedido
    and pc.COD_Peca = i.COD_peca
    and a.COD_Armazem = pc.COD_Armazem;

select * from letraG;