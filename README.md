# Shorter URL
![Java](https://img.shields.io/badge/Java-21-blue?logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.0-brightgreen?logo=spring&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-15-blue?logo=postgresql)

Projeto desenvolvido para encurtar URLs de forma eficiente, gerando um identificador único de 6 a 12 caracteres para cada URL original.

## ✨ Funcionalidades

- Criar um link curto a partir de uma URL base
- Redirecionamento automático ao acessar a URL curta
- Listar todos os links existentes
- Deletar links individualmente
- Contador de cliques por link curto

## 🚀 Tecnologias utilizadas

- Java 21
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Flyway (migrations)
- Docker Compose

## 🔧 Como rodar o projeto localmente

1. **Clone o repositório:**

```bash
git clone https://github.com/lucas-serafim/shorter-url-challenge.git
cd shorter-url-challenge
```
2. **Suba os containers com Docker Compose:**

```bash
docker-compose up --build
```

3. **O backend estará disponível em:**  http://localhost:8080

## 📦 Exemplo de uso da API

### Criar uma URL curta

**POST - /api/short-url**

Body:
```json
{
  "url": "https://www.google.com"
}
```
Response:
```json
{
  "id": "rZoDNfgUm17JRM1",
  "shorter_url": "http://localhost:8080/rZoDNfgUm17JRM1",
  "original_url": "https://www.google.com",
  "clicks": 0
}
```
---

### Listar todos os links

**GET - /api/links**

Response:
```json
[
  {
    "id": "rZoDNfgUm17JRM1",
    "shorter_url": "http://localhost:8080/rZoDNfgUm17JRM1",
    "original_url": "https://www.google.com",
    "clicks": 3
  }
]
```
---

### Deletar um link específico

**DELETE - /api/links/rZoDNfgUm17JRM1**

Response:
```json
{
  "message": "Link deleted successfully."
}
```
---

### Redirecionar para a URL original

**GET - /rZoDNfgUm17JRM1**

👉 Ao acessar, o navegador será redirecionado para a URL original.

## 📄 Licença

Este projeto está licenciado sob a licença [MIT](LICENSE).

