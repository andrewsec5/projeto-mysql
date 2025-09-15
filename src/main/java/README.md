# 🗂️ Projeto Java + MySQL – DAO de Cadastro

Este projeto é um exemplo prático de aplicação Java conectada a um banco de dados **MySQL** usando **JDBC**.  
Ele demonstra operações simples de CRUD (Create e Read) em duas tabelas (`gafanhotos` e `cursos`) utilizando a classe `DAO`.

---

## 🚀 Objetivos

- Consolidar conhecimentos recém-adquiridos sobre **MySQL**;
- Praticar **JDBC** para conexão entre Java e MySQL;
- Estruturar consultas SQL (SELECT) e inserções (INSERT) com boas práticas.

---

## 🛠️ Tecnologias Utilizadas

- **Java 17+** (funciona em versões anteriores também);
- **MySQL 8+**;
- **JDBC** (Driver oficial MySQL Connector/J);
- **IntelliJ IDEA** como ambiente de desenvolvimento.

---

## 📑 Funcionalidades

- Listar usuários da tabela `gafanhotos`;
- Inserir um novo usuário na tabela `gafanhotos`;
- Listar cursos da tabela `cursos`;
- Exibir resultados formatados no console.

---

## 🔧 Pré-Requisitos

- MySQL instalado e rodando na porta 3306;
- Banco de dados cadastro criado no MySQL:
```-- script SQL
  CREATE DATABASE cadastro;
  USE cadastro;

  CREATE TABLE cursos (
  idcurso INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(50) NOT NULL
  );

  CREATE TABLE gafanhotos (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(30) NOT NULL,
  nascimento DATE,
  peso DECIMAL(5,2),
  altura DECIMAL(3,2),
  sexo ENUM('M','F')
  );
```

---

## 🏗️ Estrutura do Projeto

```
📦 projeto-java-mysql
 ┣ 📂 src
 ┃ ┗ 📂 DAO
 ┃   ┗ 📜 DAO.java
 ┣ 📜 README.md
```

---

## ▶️ Como Executar

1) Clonar este repositório:
```bash
  git clone https://github.com/seuusuario/seurepositorio.git
```
2) Abrir no IntelliJ IDEA.
3) Ajustar credenciais no arquivo DAO.java se necessário:
```// trecho Java
  String url = "jdbc:mysql://localhost:3306/cadastro";
  String usuario = "root";
  String senha = "";
```
4) Executar o método main da classe DAO.

---

## 📚 O que Aprendi com Este Projeto

- Como criar uma conexão com MySQL usando DriverManager;
- Uso de Statement para consultas simples (SELECT);
- Uso de PreparedStatement para inserções seguras (INSERT) evitando SQL Injection;
- Uso de try-with-resources.

---

## 📝 Créditos

- O modelo do banco de dados (cadastro com tabelas cursos e gafanhotos) e grande parte do aprendizado de MySQL utilizados aqui foram baseados no curso do Professor Gustavo Guanabara (Curso em Vídeo).
- A ele, meus créditos pelo material didático que fundamentou este projeto.

---

## 🤝 Contribuições

- Contribuições, feedbacks e sugestões são muito bem-vindos!
- Abra uma issue ou envie um pull request.

---

## 🙋 Autor
- Me chamo Andrew, estou estudando engenharia de software com foco em Java e tecnologia aplicada em resolução de problemas.
- Conecte-se comigo no Linkedin para me ajudar a evoluir e acompanhar minha trajetória profissional:
  [Meu LinkedIn](https://www.linkedin.com/in/andrew-alves-632725352/)

