-- b) Listar os nomes dos assinantes, seguido do seu ramo, ordenados por ramo e 
-- posteriormente por nome. 

select a.nm_assinante, r.ds_ramo
from assinante a
right join ramo_atividade r on r.cd_ramo = a.cd_ramo
order by r.ds_ramo asc, a.nm_assinante asc;