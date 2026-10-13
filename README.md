# Retomando Lógica de programação em Java

---
### Navegação

[Tipos de variáveis](#tipos-de-variáveis)

[Condicionais](#condicionais)

---

### Declarar uma variavel

É bem simples declarar uma variável basta escrever `O Tipo da variável --> depois o nome --> depois valor da variável`

Ex: 

```java
String nome = "Igor Victor da Silva";
```

Ou pode utilizar o tipo `var` que no Intellij o sistema seta o tipo da variável sozinho

Ex:

```java
var nome = "Igor Victor da Silva";
```

---

### Tipos de variáveis

Existem vários tipos de dados em Java, e cada tipo de variável pode armazenar determinados valores,
ocupando espaço na memória. Por isso, escolher o tipo de dado adequado pode ajudar a otimizar o uso da memória
e contribuir para o desempenho do sistema.

### Tipos inteiros 

Tipos inteiro são basicamente números que contém vírgula, e existem 4 Tipos de números inteiros no Java.

| Tipo    | Espaço ocupado na memória | Armazena                         | Faixa de Representação                                   |
|---------|---------------------------|----------------------------------|----------------------------------------------------------|
| `byte`  | 8 bits                    | Números inteiros pequenos        | -128 até 127                                             |
| `short` | 16 bits                   | Números inteiros grandes         | -32.768 até 32.767                                       |
| `int`   | 32 bits                   | Números inteiros mais utilizados | -2.147.483.648 até 2.147.483.647                         |
| `long`  | 64 bits                   | Números inteiros enormes         | -9.223.372.036.854.775.808 até 9.223.372.036.854.775.807 |

**Observação:** O espaço indicado na tabela representa o tamanho definido para cada tipo primitivo. Porém, 
o consumo real de memória pode ser maior dependendo de como os dados são armazenados. 
Por exemplo, um `Integer` pode ocupar mais memória que um `int`, 
pois é um objeto e possui informações adicionais além do valor armazenado.

---

### Tipos decimais

| Tipo | Espaço ocupado na memória | Armazena | Precisão aproximada |
|---|---|---|---|
| `float` | 32 bits | Números decimais | 6 a 7 dígitos significativos |
| `double` | 64 bits | Números decimais com maior precisão | 15 a 16 dígitos significativos |

**Observações:**

- `float` utiliza menos memória, mas possui menor precisão.
- `double` utiliza mais memória e oferece maior precisão, sendo o tipo mais utilizado para representar números decimais em Java.
- Ambos possuem limites de representação e podem apresentar pequenas imprecisões em cálculos decimais.

**Aviso:** O espaço indicado na tabela representa o tamanho definido para cada tipo primitivo. 
Porém, o consumo real de memória pode ser maior dependendo de como os dados são armazenados. 
Por exemplo, um `Double` pode ocupar mais memória que um `double`, 
pois é um objeto e possui informações adicionais além do valor armazenado.


---

### Tipo Strings

`O tipo (String) é utilizado para representar palavras e frases `

`O tipo (char) é utilizado para representar um único caractere`

E como se declara cada um deles?

String:
```java
String nome = "Igor Victor da Silva";
```
Para String você utiliza-se de Aspas duplas

---

char:
```java
char letra = 'A';
```

Para char você utiliza-se de Aspas simples

---

### Tipo booleano

Basicamente são tipos de variáveis, verdadeiro ou falso,
pode utilizar esse tipo de variável de diferentes formas possíveis depende muito da sua lógica.

Como se declara?

```java
boolean maiorDeIdade = true;
```
Da para utilizar de diversas formas, como em condicionais, looping de repetição, botões liga ou desliga,
entre outras coisas, depende muito da sua lógica de programação e como irá usar esse tipo de variável em seus projetos.

---

### Condicionais
