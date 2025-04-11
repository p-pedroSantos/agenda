# 🗓️ Agendal – Sistema de Agenda Pessoal (Spring MVC + MySQL)

**Agendal** é um projeto web desenvolvido com **Spring Boot**, que simula um sistema de agendamento de compromissos com interface HTML utilizando **Thymeleaf**. A aplicação segue o padrão **MVC (Model-View-Controller)** e integra com um banco de dados **MySQL** relacional, com criação automática de tabelas via JPA.

---

## ✨ Funcionalidades

- ✅ Cadastro de compromissos (com data, hora, descrição, etc.)
- 📋 Listagem de todos os eventos agendados
- 📝 Edição de eventos existentes
- ❌ Exclusão de compromissos
- 🔎 Interface web com navegação intuitiva

---

## 🛠️ Tecnologias Utilizadas

- Java 11  
- Spring Boot 2.7.5  
- Spring MVC  
- Spring Data JPA  
- Thymeleaf  
- MySQL  
- Maven  

---

## ⚙️ Configuração do banco de dados

O banco de dados é configurado via arquivo `application.properties`. Basta modificar os dados de acesso conforme sua máquina ou ambiente:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/agendal_db
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
