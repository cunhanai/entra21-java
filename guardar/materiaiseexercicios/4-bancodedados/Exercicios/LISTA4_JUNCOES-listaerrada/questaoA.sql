-- a) Listar os nomes dos assinantes, seguido dos dados do endereço e os telefones correspondentes. 

select a.nm_assinante, e.*, f.*
from Assinante a
left join endereco e on e.cd_assinante = a.cd_assinante
left join telefone f on f.cd_endereco = e.cd_endereco;