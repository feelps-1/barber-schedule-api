# Crab Barber API - Sistema de Agendamento de Barbearia 🧰✂️

Este projeto consiste em uma **API RESTful** desenvolvida em **Java** com **Spring Boot** para gerenciar agendamentos e clientes de uma barbearia fictícia chamada **Crab Barber**. A API fornece os dados necessários para integração com o frontend e possibilita o gerenciamento completo das operações da barbearia.

---

## 🚀 Funcionalidades Principais

- **CRUD de Clientes**: Cadastro, edição, listagem e remoção de clientes.
- **CRUD de Agendamentos**: Registro, edição, listagem e exclusão de agendamentos.
- **Filtragem de Agendamentos**: Filtragem por cliente, data, mês e ano.
- **Versionamento do banco de dados**: Uso do Flyway para controle das migrações do banco.

---

## 🚀 Como Rodar o Projeto

Este projeto foi configurado para rodar utilizando **Docker** e **Docker Compose**, garantindo fácil setup em qualquer ambiente.

### Pré-requisitos

- Docker instalado
- Docker Compose instalado
- PostgreSQL rodando ou configurado no Docker

### 📦 Build e Run

Na raiz do projeto, execute:

```bash
docker compose up --build
```

A API estará disponível em:

```
http://localhost:8080
```

A base de dados estará configurada automaticamente com **PostgreSQL**, utilizando as migrações definidas via **Flyway**.

---

## 🛠️ Tecnologias Utilizadas

- **Java 17** – Linguagem principal.
- **Spring Boot** – Framework para construção da API.
- **Spring Data JPA + Hibernate** – Comunicação com o banco de dados.
- **PostgreSQL** – Banco de dados relacional.
- **Flyway** – Versionamento e migração de banco.
- **Docker & Docker Compose** – Containerização da aplicação e banco.
- **SQL** – Consultas e estruturação de dados.

---

## 📚 Habilidades Desenvolvidas no Projeto

### 🔗 Backend & API RESTful
- Implementação de endpoints seguindo corretamente os verbos HTTP (**GET**, **POST**, **PUT**, **DELETE**).
- Design limpo e intuitivo de URLs (ex: `/clients`, `/schedules`).

### 🗄️ Comunicação com Banco de Dados
- Uso de **Spring Data JPA** para facilitar operações CRUD.
- Configuração e uso do **Hibernate** como provedor ORM.
- Criação de entidades relacionais adequadas para clientes e agendamentos.

### 📜 Versionamento de Banco
- Aplicação de migrações com **Flyway** garantindo controle do estado do banco de dados e facilidade de manutenção.

### 🔄 Integração com Frontend
- Estruturação da API para integração eficiente com o frontend Angular, consumindo dados no formato JSON.

---

## 📈 Possíveis Melhorias Futuras

- Implementação de autenticação JWT para segurança dos endpoints.
- Paginação e ordenação avançada nas listagens.
- Logs estruturados com integração a ferramentas como ELK ou Prometheus + Grafana.
- Testes automatizados com **JUnit** e **MockMVC**.
- Monitoramento da aplicação com Spring Actuator.

---



