# Tipos de dados

> Esse arquivo é teórico, porém, é de extrema necessidade para progredir.

Em Java há tipos de dados, que são como conjuntos matemáticos.

O seu computador e o compilador precisam entender como estão ocorrendo as trocas de dados, operações e chamadas de método. Nada melhor do que você que está redigindo um programa para "contar a ele". Em Java, C, C++ e muitas outras linguagens, são de extrema necessidade a tipagem de variáveis.

---

## Inteiros

Um tipo de dado inteiro é como os números dos conjuntos matemáticos. Então é representado por números negativos e postivos sem vírgula, como por exemplo: _Z = {-2, -1, 0, 1, 2}_

Para visualizá-los em um programa é só utilizar o método que demonstrei no [arquivo anterior](./01-Primeiro-Programa.md), também irei utilizá-la abaixo:

```java
public class TiposDeDadosInt {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(-1);
        System.out.println(-2);
        System.out.println(2);
        System.out.println(0);
    }
}
```

Elas são utilizadas como `int` no código.

---

## Números de Ponto Flutuante

Número de ponto flutuante são os números Reais do conjunto matématico. _R = {1.3, 1.2, 1.4}_

É necessário afirmar que em programação os números não são definidos por vírgulas e sim com pontos, pois usa o sistema americano de numeração.

Aqui está uma demonstração em código:

```java
public class TiposDeDadosFloatDouble {
    public static void main(String[] args) {
        // Números do tipo double
        System.out.println(1.3);
        System.out.println(-1.3);
        System.out.println(-2.3);
        System.out.println(2.1);

        // Números do tipo float
        System.out.println(2.3f);
        System.out.println(6.2f);
        System.out.println(3f);
        System.out.println(1.8f);
    }
}
```

**Obs:** Para utilizar um número com ponto flutuante usando o `float` é necessário o uso do `f` no final do número.
Elas são utilizadas como `float` ou `double` no código.

---

## Booleanos

Esse tipo de dado é destacado por não ser um valor numérico. Ele armazena somente dois valores, `true` ou `false`, e é extremamente importante para a programação.

Aqui está uma demonstração em código:

```java
public class TiposDeDadosBoolean {
    public static void main(String[] args) {
        System.out.println(true);
        System.out.println(false);

        // Exibirá false, pois 5 não é menor do que 4
        System.out.println(5 < 4);
    }
}
```

Elas são utilizadas como `boolean` no código.

---

## Char

O tipo de variável `char` armazena somente um caractere, seja letra ou caractere especial.

Aqui está uma demonstração em código:

```java
public class TiposDeDadosChar {
    public static void main(String[] args) {
        System.out.println('c');
        System.out.println('a');
        System.out.println('2');
        System.out.println('!');
    }
}
```

Elas são utilizadas como `char` no código.

Você deve ter achado estranho ter sido utilizado um numeral, mas é possível fazer isso, mas não tem como fazer operações matemáticas com ele.
Esse tipo de variável deve ser contida entre aspas simples.

---

## Strings

As strings são um conjunto de caracteres, ou seja, uma palavra. E ela é um objeto.

Aqui está uma demonstração em código:

```java
public class TiposDeDadosString {
    public static void main(String[] args) {
        System.out.println("abcdefgh");
        System.out.println("paralelepipedo");
        System.out.println("Batatinha quando nasce espalha a rama pelo chão");
        System.out.println("(31) 0000-0000");
    }
}
```

Esse tipo de dado deve ser contida entre aspas duplas.

Elas são utilizadas como `String` no código.

[Próximo](./03-Documentação-Identação.md) - Documentação e Identação
