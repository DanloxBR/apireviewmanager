# ⭐ APIReviewManager

Gerenciador de Avaliações via API REST, desenvolvido para criação, gestão e evolução de reviews de forma estruturada, escalável e seguindo boas práticas de desenvolvimento backend.

---

## 📝 Visão Geral

O **APIReviewManager** é uma aplicação backend construída em Java com foco na criação de APIs robustas para gerenciamento de avaliações (reviews).

O projeto foi desenvolvido com o objetivo de demonstrar domínio em construção de APIs REST, organização de código e կիրառação de boas práticas de arquitetura.

Ele pode ser facilmente adaptado para diferentes contextos, como avaliações de produtos, serviços, usuários ou qualquer outra entidade.

---

## 🎯 Objetivos do Projeto

* Criar e gerenciar avaliações de forma eficiente
* Estruturar uma API REST seguindo boas práticas
* Garantir código limpo, organizado e escalável
* Servir como base para projetos mais complexos (produção/microserviços)

---

## 🚀 Funcionalidades

* ✔️ Criação de novas avaliações (reviews)
* ✔️ Listagem de avaliações
* ✔️ Atualização de avaliações existentes
* ✔️ Exclusão de avaliações
* ✔️ Validação de dados de entrada
* ✔️ Tratamento global de exceções
* ✔️ Padronização de respostas da API

---

## 🛠️ Tecnologias Utilizadas

* Java
* Spring Boot
* Spring Web
* Spring Data JPA
* PostgreSQL
* Maven
* Lombok

---

## 🧠 Arquitetura

O projeto segue o padrão de **arquitetura em camadas**, promovendo organização, desacoplamento e facilidade de manutenção:

* **Controller** → Exposição dos endpoints REST
* **Service** → Regras de negócio
* **Repository** → Acesso e persistência de dados
* **DTOs** → Transferência de dados entre camadas
* **Exception Handler** → Tratamento centralizado de erros

---

## 📂 Estrutura do Projeto

```
src/main/java
├── controller
├── service
├── repository
├── dto
├── entity
├── exception
└── config
```

---

## 🔗 Principais Endpoints

| Método | Endpoint      | Descrição               |
| ------ | ------------- | ----------------------- |
| POST   | /reviews      | Criar nova avaliação    |
| GET    | /reviews      | Listar todas avaliações |
| PUT    | /reviews/{id} | Atualizar avaliação     |
| DELETE | /reviews/{id} | Remover avaliação       |

---

## 🔒 Melhorias Futuras

* 🔐 Autenticação e autorização com JWT
* 📄 Paginação e filtros avançados
* ⭐ Sistema de notas (rating)
* 🏢 Suporte a multi-tenancy
* 🐳 Dockerização da aplicação
* ✅ Testes automatizados (JUnit + Mockito)
* 📊 Monitoramento com Spring Actuator

---

## ▶️ Como Executar o Projeto

1. Clone o repositório:

```bash
git clone https://github.com/DanloxBR/apireviewmanager
```

2. Configure o banco de dados no `application.properties`

3. Execute a aplicação:

```bash
mvn spring-boot:run
```

4. Acesse a API:

```
http://localhost:8080
```

---

## 💡 Diferenciais

* Código limpo e bem estruturado
* Separação clara de responsabilidades
* Pronto para evolução para microsserviços
* Foco em boas práticas de mercado

---

