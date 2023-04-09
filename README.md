# Projeto de Filmes

Esse projeto é uma aplicação em Java que permite criar, editar e listar filmes, notas, avaliações, atores e atrizes. Além disso, é possível buscar informações adicionais sobre os filmes através de APIs de terceiros, como dados sobre elenco, sinopse e avaliações.

## Funcionalidades

- Criar um novo filme, com título, diretor, ano de lançamento e outras informações relevantes.
- Adicionar notas e avaliações para os filmes, feitas pelos usuários da aplicação.
- Listar os filmes cadastrados, mostrando as informações básicas de cada um.
- Buscar informações adicionais sobre os filmes, como sinopse, elenco e avaliações, através de APIs de terceiros.
- Listar os atores e atrizes cadastrados na aplicação, com informações sobre seus filmes e papéis.
- Permitir a edição e exclusão de filmes, notas, avaliações, atores e atrizes.

## Tecnologias utilizadas

- Java 8
- Spring Boot
- Hibernate
- JPA
- H2 Database
- Thymeleaf
- Bootstrap

## APIs utilizadas

- The Movie Database (https://www.themoviedb.org/)
- IMDb API (https://developer.imdb.com/)

## Como executar o projeto

1. Clone o repositório em sua máquina local.
2. Abra o projeto em sua IDE favorita.
3. Execute a classe `ProjetoDeFilmesApplication.java`.
4. Acesse o endereço `http://localhost:8080` em seu navegador para utilizar a aplicação.

## Como utilizar a aplicação

Ao acessar a aplicação, você verá a página inicial, com a lista de filmes cadastrados e a opção de adicionar um novo filme. Ao clicar em "Adicionar Filme", você será direcionado para a página de criação de um novo filme, onde poderá preencher as informações necessárias e salvar o filme.

Você também pode acessar as páginas de listagem e edição de notas, avaliações, atores e atrizes, utilizando o menu de navegação no topo da página.

Para buscar informações adicionais sobre um filme, basta clicar no botão "Buscar Informações" na página de detalhes do filme. Isso fará uma requisição à API de terceiros correspondente e mostrará as informações retornadas.

## Licença

Este projeto está licenciado sob a licença MIT. Consulte o arquivo LICENSE.md para obter mais informações.
