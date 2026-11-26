# Recursividade--Java
Projeto acadêmico de Estruturas de Dados 2 — Gerenciamento de memória e recursividade em Java, com aplicações matemáticas e musicais.





# 🎸 Recursividade em Java — Da Matemática à Música

![Java](https://img.shields.io/badge/Java-21-orange?logo=openjdk)
![Status](https://img.shields.io/badge/Status-Concluído-green)
![Unipê](https://img.shields.io/badge/Instituição-Unipê-blue)

## 📚 Sobre o projeto

Projeto acadêmico desenvolvido para a disciplina de Estruturas de Dados II, com o objetivo de demonstrar o funcionamento da recursividade e do gerenciamento de memória utilizando a linguagem Java.

O projeto apresenta exemplos matemáticos e musicais, relacionando conceitos teóricos de programação com aplicações práticas do cotidiano.

## 🎓 Informações acadêmicas

- **Instituição:** Centro Universitário de João Pessoa — UNIPÊ
- **Disciplina:** Estruturas de Dados II
- **Professor:** Edkallenn
- **Tema:** Gerenciamento de Memória e Recursividade

### Integrantes

- Nome completo do integrante 1
- Nome completo do integrante 2

## 🎯 Objetivos

- Compreender o funcionamento da recursividade.
- Identificar casos base e casos recursivos.
- Demonstrar o funcionamento da pilha de chamadas.
- Compreender as diferenças entre Stack e Heap.
- Aplicar a recursividade em problemas matemáticos.
- Relacionar progressões geométricas com frequências musicais.

## ⚙️ Funcionalidades

| Funcionalidade | Descrição |
|---|---|
| Fibonacci | Calcula termos da sequência de Fibonacci. |
| PA | Calcula termos de uma progressão aritmética. |
| PG | Calcula termos de uma progressão geométrica. |
| Frequências musicais | Calcula frequências de diferentes oitavas da nota Lá. |
| Call Stack | Demonstra a ordem das chamadas e retornos recursivos. |
| Heap | Demonstra a utilização de um array na memória. |

## 🔁 Recursividade

A recursividade é uma técnica de programação na qual um método chama a si mesmo para resolver versões menores de um problema.

Uma função recursiva possui dois elementos fundamentais:

- **Caso base:** condição que encerra as chamadas recursivas.
- **Caso recursivo:** chamada que aproxima o problema do caso base.

Exemplo implementado no projeto:

```java
public static int fibonacci(int n) {
    if (n <= 1) return n;
    return fibonacci(n - 1) + fibonacci(n - 2);
}
```

## 🎵 Recursividade aplicada à música

Na música, a frequência de uma nota dobra a cada oitava acima, formando uma progressão geométrica de razão 2.

Utilizando como referência a quinta corda solta de uma guitarra em afinação padrão, temos a nota Lá com frequência aproximada de 110 Hz.

| Nota | Frequência |
|---|---:|
| Lá 2 | 110 Hz |
| Lá 3 | 220 Hz |
| Lá 4 | 440 Hz |
| Lá 5 | 880 Hz |
| Lá 6 | 1760 Hz |

O cálculo é realizado recursivamente:

```java
public static double frequencia(int n) {
    if (n == 0) return 110;
    return frequencia(n - 1) * 2;
}
```

Essa implementação demonstra como a recursividade pode ser utilizada para calcular frequências musicais.

## 🧠 Gerenciamento de memória

### Stack

A Stack armazena os quadros de execução dos métodos, incluindo parâmetros e variáveis locais.

### Call Stack

A Call Stack organiza as chamadas dos métodos seguindo o princípio LIFO (Last In, First Out), no qual a última chamada a entrar é a primeira a sair.

Exemplo de execução:

```text
Entrando: 3
Entrando: 2
Entrando: 1
Entrando: 0
Saindo: 0
Saindo: 1
Saindo: 2
Saindo: 3
```

### Heap

A Heap é a região de memória utilizada para armazenar objetos e arrays.

No projeto, utilizamos um array para demonstrar esse conceito:

```java
int[] numeros = {pa(1), pa(2), pa(3)};
```

O array é armazenado na Heap, enquanto sua referência local está associada ao quadro de execução do método na Stack.

As demonstrações representam conceitualmente o gerenciamento de memória da JVM.

## 🛠️ Tecnologias utilizadas

- Java 21
- Visual Studio Code
- Git
- GitHub

## 📂 Estrutura do projeto

```text
Recursividade--Java/
├── Main.java
├── README.md
└── .gitignore
```

## 🚀 Como executar

### Pré-requisitos

- Java JDK 21
- Git (para clonar o repositório)

### Clonar o repositório

```bash
git clone https://github.com/Pedro2678/Recursividade--Java.git
```

### Acessar o projeto

```bash
cd Recursividade--Java
```

### Compilar

```bash
javac -encoding UTF-8 Main.java
```

### Executar

```bash
java Main
```

## 🧪 Resultados da execução

```text
Fibonacci: 8
PA: 14
PG: 32
Frequência: 880.0 Hz

Call Stack:
Entrando: 3
Entrando: 2
Entrando: 1
Entrando: 0
Saindo: 0
Saindo: 1
Saindo: 2
Saindo: 3

Heap:
2
5
8
```

O programa foi desenvolvido para fins didáticos, utilizando entradas válidas e pequenas.

## 🎥 Vídeo de apresentação

O link do vídeo será disponibilizado após a publicação.

## 📌 Conclusão

O projeto demonstra que a recursividade pode ser aplicada tanto na resolução de problemas matemáticos quanto em situações práticas, como o cálculo de frequências musicais.

Além disso, permite compreender a relação entre chamadas recursivas, pilha de execução e gerenciamento de memória.

---

Desenvolvido para a disciplina de Estruturas de Dados II — UNIPÊ!
