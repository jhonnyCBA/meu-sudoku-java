# 🧩 Projeto Sudoku em Java

## 📌 Descrição

Este projeto consiste na implementação de um jogo de Sudoku desenvolvido em Java, com execução via terminal e possibilidade de interface gráfica. O objetivo é praticar conceitos fundamentais como estruturas de dados, lógica de programação, organização de código e boas práticas com Git/GitHub.

---

## 🚀 Funcionalidades

* ✔️ Leitura de tabuleiro via argumentos
* ✔️ Validação das regras do Sudoku
* ✔️ Preenchimento de posições
* ✔️ Execução no terminal
* ✔️ (Opcional) Interface gráfica

---

## 🛠️ Tecnologias Utilizadas

* Java
* Git e GitHub
* (Opcional) Swing ou JavaFX para UI

---

## 📂 Estrutura do Projeto

```
meu-sudoku-java/
│
├─ src/
│  ├─ main/
│  │  ├─ java/
│  │  │  └─ sudoku/
│  │  │     ├─ Main.java
│  │  │     ├─ Board.java
│  │  │     └─ Validator.java
│  │  └─ resources/
│
├─ README.md
├─ pom.xml (Maven) ou build.gradle (Gradle)
```

---

## ▶️ Como Executar o Projeto

### 🔹 Pré-requisitos

* Java instalado (JDK 8 ou superior)
* Git instalado

### 🔹 Clonar o repositório

```bash
git clone https://github.com/seu-usuario/meu-sudoku-java.git
cd meu-sudoku-java
```

### 🔹 Compilar o projeto

Se estiver usando Maven:

```bash
mvn compile
```

Se estiver usando Gradle:

```bash
gradle build
```

---

### 🔹 Executar o projeto

```bash
java -jar sudoku.jar "0,0;4,false 1,0;7,false 2,0;9,true ..."
```

📌 Exemplo completo de entrada:

```
0,0;4,false 1,0;7,false 2,0;9,true 3,0;5,false 4,0;8,true ...
```

---

## 🧠 Regras do Sudoku

* Cada linha deve conter números de 1 a 9 sem repetição
* Cada coluna deve conter números de 1 a 9 sem repetição
* Cada subgrade 3x3 deve conter números de 1 a 9 sem repetição

---

## 🔄 Versionamento

Este projeto utiliza Git para controle de versão.

### Comandos básicos:

```bash
git add .
git commit -m "Descrição da alteração"
git push
```

---

## 🌱 Melhorias Futuras

* Interface gráfica completa
* Sistema de dicas
* Geração automática de tabuleiros
* Persistência de dados (salvar jogo)

---

## 📎 Referências

* Repositório base (DIO): https://github.com/digitalinnovationone/sudoku
* Ferramenta de diagramas: https://app.diagrams.net

---

## 👨‍💻 Autor

**Jhonny Silva**
📧 [jhonny53miranda2019@gmail.com](mailto:jhonny53miranda2019@gmail.com)
📱 (65) 98469-4924

---

## ⭐ Contribuição

Sinta-se à vontade para abrir issues ou enviar pull requests!

---

## 📄 Licença

Este projeto está sob a licença MIT.
