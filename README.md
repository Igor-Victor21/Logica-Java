# Retomando Lógica de programação em Java

---
### Navegação

[Tipos de variáveis](#tipos-de-variáveis)

[Condicionais](#condicionais)

[Array](#array)

[ArrayList](#arraylist)

[Looping-de-repetição](#looping-de-repetição)

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

Um array basicamente é um lugar onde você pode armazenar um conjunto de valores do mesmo tipo em um único lugar.

Com isso, você pode utilizar um array de diferentes formas, 
desde armazenar notas de alunos até guardar dados de usuários de uma plataforma.

Como declarar um array:

### Array com tamanho definido, mas sem valores definidos manualmente

```java
double[] notas = new double[10];
```

---

### Array inicializado com valores

```java
double[] notas = {7.0, 8.5, 2.5};
```

Ok, mas qual a diferença entre um e outro?

Ambos os arrays precisam ter um tamanho definido para funcionar. A diferença é que, no primeiro exemplo, 
você define o tamanho do array, mas não informa os valores manualmente. Nesse caso, como o tipo é `double`, 
todas as posições começam com o valor `0.0`.

Já no segundo exemplo, você cria o array e define os valores ao mesmo tempo.

Geralmente, utilizo o array inicializado em exercícios de lógica, 
porque é mais rápido de escrever quando já sei quais valores quero utilizar.

Já o array com tamanho definido, mas sem valores informados manualmente, 
pode ser útil quando sei quantos espaços preciso criar, mas ainda vou preencher os valores depois.

**Importante:** o tamanho de um array é fixo. Isso significa que, 
depois de criado, você não consegue aumentar ou diminuir sua quantidade de posições. 
Por isso, em sistemas nos quais a quantidade de cadastros pode variar, 
geralmente é mais interessante utilizar um `ArrayList`, que permite adicionar e remover elementos com mais facilidade.

---

### Índice de um Array

Os dados são armazenados em posições dentro do array, e cada posição possui um índice. O índice começa no `0` e vai até uma posição a menos do que o tamanho total do array.

Exemplo: caso você tenha um array com 10 posições, os índices vão de `0` até `9`, totalizando 10 posições. Isso é padrão para os arrays em Java.

Então, caso queira armazenar um valor ou exibir um dado específico, lembre-se de que o índice começa no `0` e vai até o tamanho do array menos um. Isso também vale para os arrays que já são inicializados com valores.

```java
// Criando um array de notas
double[] notas = new double[3];

// Definindo um valor no índice 0 do array
notas[0] = 7.0;

// Exibindo o valor armazenado no índice 0
System.out.println(notas[0]);
```

Nesse exemplo, criamos um array com 3 posições. Depois, armazenamos o valor `7.0` no índice `0` e exibimos esse valor no console.

Então, é importante entender como funcionam os índices de um array para conseguir armazenar, alterar e exibir valores corretamente.

### ArrayList

Um `ArrayList` é uma classe do Java que funciona de forma parecida com um array, 
pois permite armazenar um conjunto de informações.

Porém, existe uma diferença importante: você pode adicionar e remover elementos de forma dinâmica, 
sem precisar definir uma quantidade fixa de posições no momento da criação.

Então, caso você tenha um sistema em que não sabe quantos usuários ou quantas informações precisará armazenar, 
o `ArrayList` pode ser uma boa opção.

Para utilizar essa classe, primeiro você precisa importá-la da biblioteca `java.util`.

```java
import java.util.ArrayList;
```

Como utilizar:

```java
// Importando a classe ArrayList
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Criando a lista
        ArrayList<String> nomes = new ArrayList<>();

        // Adicionando nomes à lista
        nomes.add("Igor Victor da Silva");
        nomes.add("Felipe");
        nomes.add("Vinicius");

        // Removendo um dos nomes
        nomes.remove(2);

        // Exibindo o nome no índice 0
        System.out.println(nomes.get(0));
    }
}
```

Nesse exemplo, criamos uma lista de nomes utilizando `ArrayList<String>`. 
O `String` indica que essa lista vai armazenar textos.

Para adicionar elementos, utilizamos o método `add()`. 
Já para remover um elemento pelo índice, utilizamos o método `remove()`.

Por último, para acessar um elemento específico da lista, 
utilizamos o método `get()`, informando o índice que queremos acessar.

**Importante:** assim como nos arrays, os índices do `ArrayList` começam no `0`. 
Além disso, ele não é literalmente ilimitado, pois existem limites de memória e capacidade, 
mas seu tamanho pode aumentar ou diminuir conforme você adiciona ou remove elementos.

---

### Looping de repetição

O looping de repetição geralmente é utilizado para executar processos repetitivos. Em Java, 
podemos utilizar `while`, `for`, `for-each` e `do-while` para realizar esse tipo de processo.

Eles são muito utilizados em sistemas para percorrer listas e arrays, 
exibir informações ou manter um processo funcionando até que o usuário decida sair.

Seu uso é bem vasto e depende da sua lógica e de como você pretende utilizar um looping de repetição.

### Looping while

O looping de repetição `while` continua executando um bloco de código enquanto a condição for verdadeira. 
Caso a condição seja `false`, o bloco de código se encerra e o sistema continua executando as próximas instruções.

Também é possível encerrar um looping utilizando o comando `break`, que interrompe a repetição imediatamente.

Como fazer um looping `while`:

```java
public class Main {
    public static void main(String[] args) {
        // Declarando uma variável para o contador
        int contador = 0;

        // Fazendo um looping while para contar de 0 até 10
        while (contador <= 10) {
            System.out.println(contador);
            contador++;
        }
    }
}
```

É um sisteminha bem simples, apenas para contar de 0 até 10. Porém, 
você pode colocar uma condição específica no `while` e, enquanto essa condição for verdadeira, ele continuará executando.

Você pode fazer cálculos, verificar informações, organizar listas, exibir arrays e muitas outras coisas.

---

### Looping de repetição for

O looping de repetição `for` funciona de uma forma um pouco diferente. Nele, você pode definir uma variável de controle, 
uma condição para continuar repetindo e uma forma de atualizar essa variável a cada repetição.

Por isso, ele costuma ser mais prático quando você já sabe quantas vezes deseja executar um bloco de código ou quando precisa percorrer um conjunto de informações.

Por exemplo, você pode utilizar o `for` para percorrer um array com 100 informações ou executar uma tarefa 10 vezes.

Lógico que também dá para fazer isso com o `while`, mas, em algumas situações,
o `for` deixa o código mais organizado e fácil de entender.

Como fazer um looping `for`:

```java
public class Main {
    public static void main(String[] args) {
        // Fazendo um contador de 0 até 10 com for
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
```

É um exemplo bem simples de entender. Vamos separar cada parte do `for`:

```java
for (int i = 0; i <= 10; i++)
```

- `int i = 0;` - declaramos uma variável chamada `i`, que começa com o valor `0`.
- `i <= 10;` - essa é a condição. Enquanto `i` for menor ou igual a `10`, o looping continuará executando.
- `i++` - incrementa o valor de `i` em 1 a cada repetição. É equivalente a fazer `i = i + 1`.

Dessa forma, o código exibe os números de 0 até 10. Quando `i` chega a `11`, 
a condição se torna falsa e o looping termina.

---

### for-each

O `for-each` é utilizado para percorrer os elementos de um array ou de uma coleção, 
como um `ArrayList`, de forma mais simples, sem precisar controlar manualmente os índices.

Como fazer um looping `for-each`:

```java
public class Main {
    public static void main(String[] args) {
        String[] nomes = {"Igor", "Fernando", "Luiz"};

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
```

Para entender mais facilmente, leia a linha do `for-each` traduzindo o símbolo `:` como "em" ou "dentro de".

```java
for (String nome : nomes)
```

Fica assim: "Para cada `String` chamada `nome` dentro de `nomes`".

O que o sistema está fazendo é pegar cada elemento do array `nomes` e armazená-lo temporariamente na variável `nome`. 
A cada repetição, essa variável recebe o próximo elemento, que é exibido na tela.

O looping continua até percorrer todos os elementos do array.

Uma vantagem do `for-each` é que você não precisa acessar cada posição utilizando índices, 
como faria com `nomes[0]`, `nomes[1]` e assim por diante.

---

### do-while

Já o `do-while` funciona de uma forma um pouco diferente. 
Ele executa o bloco de código pelo menos uma vez e só depois verifica a condição do `while`.

Com isso, você pode fazer coisas interessantes, 
como um menu de caixa eletrônico ou um menu de jogo que precisa ser exibido pelo menos uma vez antes de o usuário decidir se deseja continuar ou sair.

Veja um exemplo:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // A classe Scanner serve para ler o que o usuário vai digitar
        Scanner leitor = new Scanner(System.in);

        String senhaDigitada;
        String senhaCorreta = "java123";

        // O bloco "do" garante que o código rode pelo menos uma vez
        do {
            System.out.print("Digite a senha para entrar no sistema: ");
            // Lendo o que o usuário está digitando
            senhaDigitada = leitor.nextLine();

            // Verifica se a senha digitada é diferente da senha correta
            if (!senhaDigitada.equals(senhaCorreta)) {
                // Caso seja diferente, exibe uma mensagem de erro
                System.out.println("Senha incorreta! Tente novamente.\n");
            }

            // Enquanto a senha estiver errada, o looping se repete
        } while (!senhaDigitada.equals(senhaCorreta));

        System.out.println("Acesso liberado! Bem-vindo ao sistema.");

        leitor.close();
    }
}
```

Nesse exemplo, o sistema solicita uma senha ao usuário. 
Caso ele digite a senha incorretamente, o looping continua e solicita a senha novamente.

Quando o usuário digitar a senha correta, a condição do `while` se tornará falsa e o looping terminará, 
liberando o acesso.

Observe que utilizamos `!senhaDigitada.equals(senhaCorreta)` para verificar se a senha digitada é diferente da senha correta. 
O símbolo `!` significa negação, ou seja, inverte o resultado de uma condição.

Também utilizamos `Scanner(System.in)` para permitir que o programa leia o que o usuário digita pelo teclado.

A principal diferença entre `while` e `do-while` é que o `while` verifica a condição antes de executar o bloco, 
enquanto o `do-while` verifica a condição depois de executar o bloco pelo menos uma vez.

---

### Mudanças de tipo