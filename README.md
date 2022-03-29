# banco

API rest de banco feito nas aulas de Banco de dados

| Ação 	| Método 	| Endpoint 	| RequestBody example 	| RequestParam example 	|
|---	|---	|---	|---	|---	|
| Cadastrar usuário 	| POST 	| /usuario 	| { "cpf": "03598289503", "nome": "teste", "senha": "asdasd" } 	|  	|
| Listar usuários 	| GET 	| /usuario 	|  	|  	|
| Cadastrar conta 	| POST 	| /conta 	| { "agencia": 12, "saldo": 10000.00, "tipoConta": "PF", "idUsuario": 13, "numero": 255 } 	|  	|
| Listar contas 	| GET 	| /conta 	|  	|  	|