# Retomando Lógica de programação em Java

---
### Navegação

[Tipos de variáveis](#tipos-de-variáveis)

[Condicionais](#condicionais)

[Array](#array)

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

As estruturas condicionais são comumente utilizadas para realizar verificações e validações em um sistema. 
Elas permitem executar diferentes blocos de código dependendo de uma condição, 
podendo ser utilizadas tanto em situações simples quanto complexas.

São muito importantes na lógica de programação e estão presentes na maioria das aplicações, pois permitem que o sistema tome decisões com base nas informações recebidas.

Utiliza-se `if`, `else if` e `else` 
para criar estruturas condicionais e executar diferentes blocos de código dependendo das condições.

Além disso, podemos utilizar operadores lógicos para complementar as condições:

`&&` - Operador lógico "E": retorna verdadeiro se ambas as condições forem verdadeiras. 

`||` - Operador lógico "OU": retorna verdadeiro se pelo menos uma das condições for verdadeira.

`!` - Operador lógico "NOT": inverte o valor lógico. Se a condição for verdadeira, passa a ser falsa, e vice-versa.

Pode parecer um pouco confuso no início, porém, basta ler e entender as condições para compreender a lógica utilizada.
Ex:

```java
int idade = 18;

if(idade < 12){
    System.out.println("Você é criança");
}else if (idade < 18 && idade >= 12){
    System.out.println("Você é adolescente");
}else{
    System.out.println("Você é adulto");
}
```

Esse é um exemplo simples de estrutura condicional. Ao ler o código, 
é possível entender como as condições são verificadas e como o programa decide qual mensagem exibir.

Leitura do código: tenho uma variável chamada idade, que recebe o valor 18. Se a idade for menor que 12, 
o sistema exibirá que a pessoa é uma criança. Caso contrário, se a idade for menor que 18 e maior ou igual a 12, 
o sistema exibirá que a pessoa é um adolescente. Se nenhuma dessas condições for verdadeira, 
o sistema exibirá que a pessoa é um adulto.

---

### Switch-case

O `switch-case` é uma estrutura condicional utilizada para verificar o valor de uma variável ou expressão e executar diferentes blocos de código dependendo do resultado.

Ele pode ser utilizado como uma alternativa ao `if` e `else if` quando precisamos comparar um mesmo valor com várias possibilidades diferentes.

Utiliza-se `switch` para iniciar a estrutura condicional, `case` para definir os valores que serão verificados e `break` para encerrar a execução do bloco correspondente.

Além disso, existe o `default`, que é executado quando nenhum dos casos definidos corresponde ao valor analisado.

Ex:

```java
int dia = 3;

switch (dia) {
    case 1:
        System.out.println("Domingo");
        break;
    case 2:
        System.out.println("Segunda-feira");
        break;
    case 3:
        System.out.println("Terça-feira");
        break;
    case 4:
        System.out.println("Quarta-feira");
        break;
    case 5:
        System.out.println("Quinta-feira");
        break;
    case 6:
        System.out.println("Sexta-feira");
        break;
    case 7:
        System.out.println("Sábado");
        break;
    default:
        System.out.println("Dia inválido");
}
```

Esse é um exemplo simples de `switch-case`. Ao ler o código, 
você verá que é intuitivo identificar as diferentes possibilidades e o que será executado em cada uma delas.

**Leitura:** tenho uma variável chamada `dia`, que recebe o valor `3`. 
O `switch` verifica esse valor e procura um `case` correspondente. Como existe um `case 3`, 
o sistema exibe a mensagem "Terça-feira". Em seguida, o `break` encerra a execução do `switch`, 
impedindo que os próximos casos sejam executados.

Caso o valor de `dia` não corresponda a nenhum dos casos definidos, o bloco `default` será executado, 
exibindo a mensagem "Dia inválido".

---

### Array

