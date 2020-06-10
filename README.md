# API-REST-TESTE
Uma API simple para aprendizado

GET, POST, DELETE e PUT

JPA Hibernate - Banco de dados: MySQL 
create databases produtos_apirest;
IDE: IntelliJ IDE Community

GET -Pegar todos:
endpoint: /api/produtos

GET -Pegar por ID:
endpoint: /api/produtos/1

POST cadastrar produto
endpoint: /api/produto
{
    "nome": "Iphone 10",
    "quantidade": 1,
    "valor": 6000
}
DELETE deletar produto
endpoint: /api/produto
{
    "id": 1,
    "nome": "Iphone 10",
    "quantidade": 1,
    "valor": 6000
}

PUT atualizar produto
endpoint: /api/produto
{
    "id": 1,
    "nome": "Iphone 10",
    "quantidade": 1,
    "valor": 6000
}




