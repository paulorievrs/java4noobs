<h1> Funções ou Métodos </h1>
Para o básico, você pode levar em conta que ambos são a mesma coisa.

Um método/função realiza uma parte do código em uma área diferente da **FUNÇÃO PRINCIPAL** mas deve ser chamada dentro dela para acontecer. Esse método pode ou não retornar alguma coisa que poderá ser armazanado em uma variável.

Assim como existe a tipagem de variáveis, é da mesma maneira que ocorre com uma função. Cada função deve ter um tipo, se você não quer que retorne nada, o tipo será **void**. Ficará melhor de entender ao longo dos códigos. Também existem os parâmetros, que você pode passar para uma função utilizar algumas variáveis de sua preferência.

A sintaxe de uma função é muito parecida com a main, você vai iniciar com **public**, depois **static** e agora vem o tipo de função, que são os mesmo tipos de variáveis (int, float, double, etc...), depois disso vem obrigatóriamente os parênteses, que dentro deles você pode receber variáveis durante a chamada da função, e dentro da função, se ela nao for do tipo **void**, deve conter algum retorno do mesmo tipo dela.

Exemplo básico:

```java
public static int funcao(int a) {
    //... corpo da função ...
    return a;
}
```

Exemplo elaborado:

```java
public class InicioFuncoes {
    public static int soma(int a, int b) { //a e b são parametros passados na chamada da função.

        int c = a + b; //c vai receber a soma do que foi passado nos parametros

        return c; //return é um comando para voltar alguma variável (ou ate mesmo outra funcao) do mesmo tipo que a funcao foi criada.
    }

    public static void mostrar(int x) {
        //x é uma variável qualquer passada por parametro
        System.out.println(x); //mostra o conteudo que veio em x.
    }


    public static void main(String args[]) {
        int a = 5;
        int b = 10;

        int c = soma(a, b); //chamando a funcao e atribuindo o que retorna dela na variável c. É passado por parâmetro os valores que você quer somar e a variável que vai receber deve ser do tipo de retorno da função.

        mostrar(c); //chamando uma função sem retorno que mostra a variável passada por paramêtro.
    }
}
```

O uso de uma função deve ser tão natural quando o uso de uma variável, assim como tudo ensinado, você deve implementar, fazer seus testes, errar, aprender e crescer fazendo isso. É um salto bem grande aprender esse tipo de coisa pelo fato de que seu código agora, ao invés de ficar amontoado na Main, ele pode ser modularizado.

Além disso, é possível criar funções que podem ser reutilizadas, como a da soma, ou você pode criar uma função que lê dados digitados pelo usuário e retorna eles, fica mais fácil do que chamar o Scanner a todo momento.

<h1>Expressões Lambda</h1>

A versão 8 do Java é muito conhecida por trazer novos recursos que facilitaram bastante a vida do desenvolvedor Java no dia a dia, API Stream, LocalDateTime, e Lambda Expressions. Essas foram algumas das melhorias trazidas pela Oracle para a linguagem e o último em especial foi um grande avanço, já que muitas linguagens já contavam com esse recurso.

Podemos definir expressões lambda como uma forma de reduzir uma função em uma expressão, para tornar sua leitura mais fácil e expressão menos verbosa. Podemos observar no exemplo a seguir

```java
//usando da forma antiga.
List<String> arrayList = new ArrayList<String>();

arrayList.foreach(function(String e) {
  System.out.println(e);
})

// com as expressões lambdas.

arrayList.foreach(string -> System.out.println(string));

//ou de uma forma mais reduzida ainda.
arrayList.foreach(s -> System.out.println(s))

```

Ainda nesse tópico, há uma forma mais enxuta de escrever uma expressão lambda, porém devemos entender que quando usamos a seta "->" para declarar uma expressão lambda estamos informando que a expressão a direita da seta espera receber um ou mais parâmetros, além de poder manipulá-los antes de retornar um resultado, já quando usamos os dois pontos seguidos "::" não podemos usar mais de um parâmetro e nem manipulá-los.

```java
List<String> arrayList = new ArrayList<String>();

arrayList.foreach(s -> {
    String novaStringSemEspaco = s.trim();
    System.out.println(novaStringSemEspaco);
})

arrayList.foreach(System.out::println)
/* Repare no exemplo acima que, como declaramos o tipo de cada elemento no array ( String ), se fizemos dessa forma,
o compilador pode inferir o uso do elemento como parâmetro do método println, o qual faz parte do pacote System.out, presente no Java lib */
```

[Próximo](./13-Arrays.md) - Arrays