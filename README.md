# ATV-Site

# Tabela de Cadastro de Atletas
- nome da tabela: tb-cadastro-atleta

- campos:
- cd_Atleta - int (8)
- nm_Atleta - varchar(25)
- nm_Sobrenome - varchar(100)
- dt_Nascimento - date
- ds_Endereco - varchar (100)
- sg_Estado - varchar (2)
- ds_Telefone
- ds_Email

# Tabela de Cadastro de Modalidades
- nome da tabela: tb-cadastro-modalidade

-  campos:
- cd_Modalidade - int(8)
- nm_Modalidade - varchar(25)
- ds_Modalidade - varchar (100)
- cd_Atleta (FK)
					
