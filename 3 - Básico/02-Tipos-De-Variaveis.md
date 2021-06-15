<h1> Tipos de variáveis </h1>

>Esse arquivo é teórico, porém, é de extrema necessidade para progredir.

Em Java há tipos de variáveis, que, são como por exemplo os conjuntos matemáticos.

O seu computador e o compilador precisam entender como estão ocorrendo as trocas de dados, operações e chamadas de função. Nada melhor do que você que está redigindo um programa para "contar a ele". Em Java, C, C++ e muitas outras linguagens, são de extrema necessidade a tipagem de variáveis.
<hr>

<h2> Inteiros </h2>

Uma variável inteira é como os números dos conjuntos matemáticos. Então é representado por números negativos e postivos sem vírgula, como por exemplo: *Z = {-2,-1,0,1,2}*

Para os visualizar em um programa é só utilizar a função que demonstrei no arquivo anterior (3.1-Primeiro-Programa), também irei utilizá-la abaixo:

```java
public class TiposvariáveisInt {
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

Uma variável de número flutuante que são os números Reais do conjunto matématico. *R = {1.3, 1.2, 1.4}*

É necessário afirmar que em programação os números não são definidos por vírgulas e sim com pontos, pois usa o sistema americano de numeração.

Aqui está uma demonstração em código:
```java
public class TiposvariaveisFloatDouble {
    public static void main(String args[]) {
        System.out.println(1.3);
        System.out.println(-1.3);
        System.out.println(-2.3);
        System.out.println(2.1);
        //Números do tipo float abaixo
        System.out.println(2.3f);
        System.out.println(6.2f);
        System.out.println(3f);
        System.out.println(1.8f);
    }
}
```
**Obs:** Para utilizar um número com ponto flutuante usando o float é necessásio o uso do 'f' no final do número.
Elas são utilizadas como "float" ou "double" no código.
<hr>

<h2> Booleanos </h2>

Esse tipo de variável é destacado por não ser um valor número. Ele armazena somente dois valores, *"TRUE"* ou *"FALSE"*, e é extremamente importante para a programação.

Aqui está uma demonstração em código:
```java
public class TiposvariaveisBooleano {
    public static void main(String args[]) {
        boolean booleano = 5 < 4;
        System.out.println(true);
        System.out.println(false);
        System.out.println(booleano);
        //Exibirá false, pois 5 não é menor do que 4
        
    }
}
```
Elas são utilizadas como "boolean" no código.

Nesse em específico mostrei como são declarados variáveis, mas será melhor explicado adiante.
<hr>

<h2>Char</h2>

O tipo de variável **Char** armazena somente um caractere nele, seja letra ou caractere especial.

Aqui está uma demonstração em código:

```java
public class TiposvariaveisChar {
    public static void main(String args[]) {
        System.out.println('c');
        System.out.println('a');
        System.out.println('2');
        System.out.println('!');
        
    }
}
```
Elas são utilizadas como "char" no código.

Você deve ter achado estranho ter sido utilizado um numeral, mas é possível fazer isso, mas não tem como fazer operações matemáticas com ele.
Esse tipo de variável deve ser contida entre aspas simples.

<hr>
<h2>Strings</h2>
As strings são um conjunto das variáveis Char, ou seja, uma palavra. E ela é um objeto.

Aqui está uma demonstração em código:

```java
public class TiposvariaveisChar {
    public static void main(String args[]) {
        System.out.println("abcdefgh");
        System.out.println("paralelepipedo");
        System.out.println("Batatinha quando nasce espalha a rama pelo chão");
        System.out.println("(31) 0000-0000");
        
    }
}
```
Esse tipo de variável deve ser contida entre aspas duplas.

Elas são utilizadas como "String" no código.

[Próximo](./03-Documentação-Identação.md) - Documentação e Identação