# Projeto de Controle de Finanças Pessoais :heavy_dollar_sign:

Este projeto tem como objetivo praticar meus conhecimentos em spring boot criando uma API de finanças pessoais, onde o usuário pode gerenciar suas dívidas e controlar seus gastos mensais. O sistema permite o registro, atualização e exclusão de dívidas, além de consultar o total devido em um mês específico.

## Tecnologias Utilizadas

- **Spring Boot**: Framework Java que facilita a criação de aplicações web, permitindo uma configuração mínima e um desenvolvimento rápido.
- **PostgreSQL**: Sistema de gerenciamento de banco de dados relacional utilizado para armazenar os dados de dívidas.
- **Java**: Linguagem de programação utilizada para o desenvolvimento da API.

## Funcionalidades

- **Cadastrar Dívidas**: Permite que o usuário insira informações sobre uma dívida de um mês específico, como valor, data de vencimento e descrição.
- **Atualizar Dívidas**: O usuário pode atualizar o valor ou outras informações de uma dívida já registrada.
- **Excluir Dívidas**: Permite que o usuário remova uma dívida que foi paga antecipadamente ou que não deseja mais registrar.
- **Consultar Dívidas**: O usuário pode visualizar todas as dívidas de um mês específico, com a possibilidade de verificar o total devido.

## Como Executar o Projeto

### Requisitos

- Java 17 ou superior
- PostgreSQL
- Maven

### Passos para Rodar a Aplicação

1. Clone o repositório:

    ```bash
    git clone https://github.com/usuario/repository.git
    ```

2. Acesse o diretório do projeto:

    ```bash
    cd repository
    ```

3. Configure o banco de dados no PostgreSQL:
    - Crie um banco de dados no PostgreSQL com o nome `financas_pessoais`.
    - Configure as credenciais do banco de dados no arquivo `application.properties` (localizado em `src/main/resources`):

    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/financas_pessoais
    spring.datasource.username=seu_usuario
    spring.datasource.password=sua_senha
    ```

4. Execute a aplicação:

    ```bash
    ./mvnw spring-boot:run
    ```

### Endpoints da API

- **POST /api/dividas**: Cadastrar uma nova dívida.
- **PUT /api/dividas/{id}**: Atualizar uma dívida existente.
- **DELETE /api/dividas/{id}**: Deletar uma dívida.
- **GET /api/dividas/{mes}**: Consultar as dívidas de um mês específico.

## Contribuições

Sinta-se à vontade para contribuir com melhorias, sugestões ou correções. Para isso, basta fazer um fork do repositório, realizar as alterações e enviar um pull request.

## Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

