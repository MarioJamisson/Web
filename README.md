
Projeto Eventos

Este projeto é uma aplicação CRUD para gerenciar eventos. Ele permite criar, ler, atualizar e excluir eventos com detalhes como nome, agência, data e local.

Pré-requisitos

Antes de começar, você precisará ter os seguintes itens instalados:

- MySQL Server
- Node.js (se a aplicação estiver usando Node para o back-end)
- Ionic CLI (se o front-end for desenvolvido em Ionic)

Configuração do Banco de Dados

Siga as etapas abaixo para configurar o banco de dados necessário para rodar a aplicação.

1. Criação do Usuário e Banco de Dados

Execute os seguintes comandos SQL no seu servidor MySQL para criar o usuário, o banco de dados e a tabela.

CREATE USER 'mario'@'localhost' IDENTIFIED BY 'mario';

CREATE DATABASE eventos;

GRANT ALL ON eventos.* TO 'mario'@'localhost'
    WITH GRANT OPTION;

FLUSH PRIVILEGES;

USE eventos;

CREATE TABLE eventos (
    id BIGINT NOT NULL AUTO_INCREMENT,
    agencia VARCHAR(150) NOT NULL,
    nome VARCHAR(150) NOT NULL,
    data VARCHAR(150) NOT NULL,
    local VARCHAR(150) NOT NULL,
    PRIMARY KEY (id)
);

2. Conectando ao Banco de Dados

Verifique se as credenciais de acesso ao banco de dados estão configuradas corretamente no arquivo de configuração da sua aplicação. As credenciais padrão são:

- Usuário: mario
- Senha: mario
- Banco de dados: eventos
- Host: localhost

3. Inicializando o Projeto

Após configurar o banco de dados, siga os passos abaixo para rodar a aplicação:

1. Clone o repositório:

git clone https://github.com/seu-usuario/nome-do-repositorio.git

2. Instale as dependências:

npm install

3. Inicie o servidor:

npm start

A aplicação estará rodando em http://localhost:3000.

Funcionalidades

- [x] Criar eventos
- [x] Ler eventos
- [x] Atualizar eventos
- [x] Deletar eventos

Contribuindo

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests.

Licença

Este projeto está licenciado sob a MIT License.
