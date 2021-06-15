<h1>Métodos Úteis</h1>

Em Java a String é tratada como um objeto, e como já visto, todo objeto tem seus métodos específicos embutidos com a linguagem. Com a String não é diferente, existem diversos métodos para auxiliar na manipulação.

<h2>Tamanho da String</h2>
Se uma String vem de um usuário, não é possível saber o tamanho dela, já que o usuário pode ter digitado qualquer coisa, então nativamente podemos utilizar métodos para extração destas informações, veja:

```java
String s = leitor.next();
System.out.println(s.length());
```

Este exemplo mostra o tamanho da String que foi passada pelo usuário. Para utilizar este método digite o nome da String e depois coloque **.length()**, diferente do array, esse é necessário colocar os parênteses.

<h2>CharAt</h2>
A String é composta por vários caracteres, mas há um meio de você conseguir "pegar" qualquer um deles.

```java
String s = "Paulo Rievrs";
System.out.println(s.charAt(0));
```

Assim como nos arrays as Strings tem posições que se iniciam do 0 e vai até o tamanho dela - 1. Para capturar o caractere da posição que deseja, é só utilizar o método **.charAt()**, e dentro dos parênteses passar a posição que deseja acessar.

<h2>Split</h2>

O método Split faz a String se separar aonde tiver a ocorrência do caractere que passar como parametro.

```java
String s = "Paulo Rievrs Oliveira";
String[] split = s.split(" ");
```

O vetor split recebe em cada posição uma parte da String que foi separada em 3, no caso, a posição 0 vai conter "Paulo", a 1 vai conter "Rievrs" e a 2 vai conter "Oliveira".

<h2> toLowerCase e toUpperCase</h2>
O método toLowerCase transforma toda a String em letras minúsculas e o toUpperCase faz o contrário.

```java
String s = "Paulo Rievrs Oliveira";
System.out.println(s.toLowerCase());
// Exibe: paulo rievrs oliveira
System.out.println(s.toUpperCase());
// Exibe: PAULO RIEVRS OLIVEIRA
```
Os prints, mostram respectivamente toda a String **s** como minusculas e toda String **s** em letras maiúsculas.

Alguns métodos não são da classe String mas também a manipula.

<h2>Integer.parseInt, Double.parseDouble e Float.parseFloat</h2>

Os tipos primitivo `int`, `double` e `float` também possuem um classes , com alguns métodos úteis. Mas, essas classes possuem características diferentes dos tipos primitivos.  
O métodos `parseInt`, `parseDouble`, `parseFloat` convertem uma `String` de números válida para o tipo requisitado.

```java
String n_1 = "111";
String n_2 = "1.7";
String n_3 = "5.1";
int num_1 = Integer.parseInt(n_1);
double num_2 = Double.parseDouble(n_2);
float num_3 = Float.parseFloat(n_3);
```

Para utilizar esse método não é necessário criar um objeto `Integer` pois são `static`. O parâmetro do método é uma `String`, e se ela não for válida é lançado a exceção `NumberFormatException`.

[Próximo](./02-LeituraDeArquivo.md) - Leitura de arquivo