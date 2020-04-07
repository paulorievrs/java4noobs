<h1> Tipos de variáveis </h1>

>Esse arquivo é teórico, porém, é de extrema necessidade para progredir

Em Java há tipos de váriaveis, que, são como por exemplo os cojuntos matemáticos.

O seu computador e o compilador precisam entender como estão ocorrendo as trocas de dados, operações e chamadas de função. Nada melhor do que você que está redigindo um programa para "contar a ele". Em Java, C, C++ e muitas outras são de extrema necessidade a tipagem de váriaveis.
<hr>

<h2> Inteiros </h2>

Uma váriavel inteira é como os números dos conjuntos matemáticos. Então é representado por números negativos e postivos sem vírgula, como por exemplo: *Z = {-2,-1,0,1,2}*

Para os visualizar em um programa é só utilizar a função que demonstrei no arquivo anterior (3.1-Primeiro-Programa), também irei utiliza-la abaixo:

```java
public class TiposVariaveisInt {
    public static void main(String args[]) {
        System.out.println(1);
        System.out.println(-1);
        System.out.println(-2);
        System.out.println(2);
        System.out.println(0);
    }
}
```
Elas são utilizadas como "int" no código.
<hr>

<h2> Números flutuantes </h2>

Uma váriavel de número flutante que são os números Reais do conjunto matématico. *R = {1.3, 1.2, 1.4}*

É necessário afirmar que em programação os números não são definidos por vírgulas e sim com pontos.

Aqui está uma demonstração em código:
```java
public class TiposVariaveisFloat {
    public static void main(String args[]) {
        System.out.println(1.3);
        System.out.println(-1.3);
        System.out.println(-2.3);
        System.out.println(2.1);
        System.out.println(0.3);
    }
}
```
Elas são utilizadas como "float" ou "double" no código.
<hr>

<h2> Booleanos </h2>

Esse tipo de váriavel é destacado por não ser um valor número. Ele armazena somente dois valores, *"TRUE"* ou *"FALSE"*, e é de extremamente importante para a programação.

Aqui está uma demonstração em código:
```java
public class TiposVariaveisBooleano {
    public static void main(String args[]) {
        boolean booleano = 5 < 4;
        System.out.println(true);
        System.out.println(false);
        System.out.println(booleano);
        
    }
}
```
Elas são utilizadas como "boolean" no código.

Nesse em específico mostrei como são declarados variavéis, mas será melhor explicado a diante.
<hr>

<h2>Char</h2>

O tipo de váriavel **Char** armazena somente um caractere nele, seja letra ou caracter especial.

Aqui está uma demonstração em código:

```java
public class TiposVariaveisChar {
    public static void main(String args[]) {
        System.out.println('c');
        System.out.println('a');
        System.out.println('2');
        System.out.println('!');
        
    }
}
```
Elas são utilizadas como "char" no código.

Você deve ter achado estranho eu utilizar um numeral, mas é possível fazer isso, mas não tem como fazer operações matemáticas com ele.
Esse tipo de váriavel deve ser contida entre aspas simples.

<hr>
<h2>Strings</h2>
As string são um conjunto das váriaveis Char, ou seja, uma palavra. E ela é um objeto.

Aqui está uma demonstração em código:

```java
public class TiposVariaveisChar {
    public static void main(String args[]) {
        System.out.println("azsassa");
        System.out.println("paralelepipedo");
        System.out.println("Batatinha quando nasce espalha a rama pelo chão");
        System.out.println("(31) 0000-0000");
        
    }
}
```
Esse tipo de váriavel deve ser contida entre aspas duplas.

Elas são utilizadas como "String" no código.