# 🎮 API de Jogos

API REST desenvolvida em Spring Boot para catalogar jogos.

## 🚀 Como executar

### Requisitos

- Java 21
- Maven
- Spring Boot

### Executando o projeto

Execute a classe `JogosApplication` pelo IntelliJ IDEA.

A aplicação será iniciada na porta:

```text
http://localhost:8081
```

## 📌 Rotas

### 1. Boas-vindas

```text
GET /boas-vindas
```

Apresenta uma mensagem informando que a API está funcionando.

URL:

```text
http://localhost:8081/boas-vindas
```

### 2. Jogo em destaque

```text
GET /destaque
```

Retorna um jogo em formato JSON.

URL:

```text
http://localhost:8081/destaque
```

Exemplo de resposta:

```json
{
  "nome": "Minecraft",
  "genero": "Sandbox",
  "ano": 2011,
  "multiplayer": true
}
```

### 3. Lista de jogos

```text
GET /jogos
```

Retorna uma lista de jogos em formato JSON.

URL:

```text
http://localhost:8081/jogos
```

A lista possui quatro jogos cadastrados diretamente no código.

## 📸 Prints das rotas

### `/boas-vindas`

Coloque aqui o print da rota `/boas-vindas`.

### `/destaque`

Coloque aqui o print da rota `/destaque`.

### `/jogos`

Coloque aqui o print da rota `/jogos`.

## 🧠 Perguntas do desafio

### 1. Em nenhum lugar do projeto existe `new JogoController()`. Então quem criou esse objeto, e quando?

O Spring Boot criou e gerenciou o objeto `JogoController` automaticamente. A anotação `@RestController` faz com que o Spring reconheça a classe como um componente da aplicação. Durante a inicialização da aplicação, o Spring cria essa instância e a disponibiliza para atender às requisições.

### 2. Eu não escrevi uma linha convertendo objeto em JSON. Como o Spring soube fazer isso sozinho?

O Spring Boot utiliza o Jackson para fazer a conversão automática dos objetos Java para JSON. Quando um método do `@RestController` retorna um objeto ou uma lista de objetos, o Spring serializa esses dados e envia a resposta no formato JSON.

## 🛠️ Tecnologias utilizadas

- Java 21
- Spring Boot
- Spring Web
- Spring Boot DevTools
- Maven

## 📚 Projeto

Desafio 01 — Introdução ao Spring Boot.