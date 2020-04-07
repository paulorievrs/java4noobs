<h1>Metodos Úteis</h1>

Em Java a String é tratado como um objeto, e como já visto, todo objeto tem alguns métodos que já vem junto com o Java. Com a String não é diferente, existem vários métodos para auxiliar o trabalho com elas.

<h2>Tamanho da String</h2>
Se uma string vem de um usuário, não tem como sabermos o tamanho dela, já que o usuário pode ter digitado qualquer coisa, então Java nos da uma ajuda com isso, veja:

```java
String s = leitor.next();
System.out.println(s.length());
```

Esse programa mostra o tamanho da String que veio do usuário. Para utilizar isso digite o nome da String e depois coloque .length() para instanciar o método, diferente do Array, esse é necessário colocar os parênteses.

<h2>CharAt</h2>
A String é composta por vários caracteres, mas há um meio de você conseguir "pegar" qualquer um deles.

```java
String s = "Paulo Rievrs";
System.out.println(s.charAt(0));
```

Assim como nos arrays as Strings tem posições que se iniciam do 0 e vai até o tamanho dela - 1. Para pegar o caractere da posição que deseja, é só utilizar o método charAt(), e dentro dos parênteses passar a posição que quer acessar.

<h2>Split</h2>

O método Split faz sua String se separar aonde tiver a ocorrência do caracter que passar como parametro.

```java
String s = "Paulo Rievrs Oliveira";
String[] split = s.split(" ");
```

O vetor split recebe em cada posição uma parte da String que foi separada em 3, no caso, a posição 0 vai conter "Paulo", a 1 vai conter "Rievrs" e a 2 vai conter "Oliveira".

<h2> toLowerCase e toUpperCase</h2>
O metodo toLowerCase transforma toda a String em letras minúsculas e o toUpperCase faz o contrário.

```java
String s = "Paulo Rievrs Oliveira";
System.out.println(s.toLowerCase());
System.out.println(s.toUpperCase());
```
Os prints, mostram respectivamente toda a String s como minusculas e toda String s em letras maiúsculas.

Alguns métodos não são da classe String mas também a manipula.

<h2>Integer.parseInt</h2>

O tipo primitivo int tem uma classe também, mas, ele é criado de outra forma. Para passar uma String só de números para um valor inteiro deve-se utilizar esse método.

```java
String s = "111";
int num = Integer.parseInt(s);
```

Para utilizar esse método não é necessário criar um objeto inteiro, é só utilizar Integer que é o nome da classe, e instanciar o metodo passando como parametro a String que quer transformar.