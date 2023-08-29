# Genéricos

Genéricos é um recurso do Java que permite criar classes, interfaces e métodos que possam receber diferentes tipos de objetos como parâmetros. Isso permite que você reutilize o mesmo código com diferentes tipos de dados, sem ter que criar uma versão específica para cada tipo. Você provavelmente viu genéricos. Classes como por exemplo `ArrayList`, `LinkedList`, `HashMap` que são genéricas.

```java
// Exemplo ArrayList recebendo diferentes tipos de dados
ArrayList<String> arrayListString = new ArrayList<String>();
arrayListString.add("Olá Mundo");
ArrayList<Integer> arrayListInteger = new ArrayList<Integer>();
arrayListInteger.add(1);
```

Vamos ver um exemplo de como utilizar Genéricos.

## Métodos Genéricos

```java
public class Valor {
    // Método genérico que recebe um valor e imprime ele
    public static <T> void mostrarValor(T valor) {
        System.out.println("O valor é: " + valor);
    }
}

public class Main {
    public static void main(String[] args) {
        // Chamando o método mostrarValor com diferentes tipos de dados
        Valor.mostrarValor("string"); // O valor é: string
        Valor.mostrarValor(1); // O valor é: 1
        Valor.mostrarValor(2.0f); // O valor é: 2.0
    }
}
```

Primeiro vamos criar uma classe chamada `Valor` que possui um método estático chamado `mostrarValor` que imprime esse valor independente do tipo. Para isso falamos que o valor recebido pelo método é do tipo `T` e imprime o valor recebido. Esse `T` indica que esse método é genérico, ou seja, ele pode receber qualquer tipo de objeto. Também colocamos o `<T>` na assinatura do método para indicar que esse método é genérico. Não precisa ser necessariamente um `T`, você pode colocar qualquer letra ou palavra, mas por convenção é utilizado `T` para indicar que é um tipo genérico.

Também podemos criar um método genérico que retorna um valor. Para isso basta colocar o `T` como tipo de retorno do método.

```java
public class Valor {
    // Método genérico que retorna um valor
    public static <T> T maiorValor(T valor) {
        return valor;
    }
}
```

E em alguns casos, podemos limitar o tipo de objeto que o método pode receber. Imagine por exemplo que você quer criar um método que recebe um número e imprime ele elevado ao quadrado. Existem diversos tipos de dados de representam números, como por exemplo `Integer`, `Float`, `Double`. Porém, existe uma superclass `Number` que é a superclasse de todos os tipos de dados numéricos. Então podemos limitar o tipo de objeto que o método pode receber para que seja um `Number` ou uma subclasse de `Number`.

```java
public class Valor {
    // Método genérico que recebe um valor que seja um Number
    public static <T extends Number> void valorAoQuarado(T valor) {
        System.out.println(valor * valor);
    }
}
```

## Classes Genéricas

Para criar uma classe genérica basta colocar o `<T>` após o nome da classe. Assim, a classe pode receber qualquer tipo de objeto no seu construtor.

```java
public class Valor<T> {
    // Declaração de variável genérica
    private T valor;

    // Construtor que recebe um valor genérico
    Valor(T valor) {
        this.valor = valor;
    }

    // Método que retorna o valor genérico
    public T getValor() {
        return valor;
    }

    // Método que recebe um valor genérico
    public void setValor(T valor) {
        this.valor = valor;
    }
}

public class Main {
    public static void main (String[] args) {
        // Criando um objeto Valor que recebe um valor String
        Valor<String> valorString = new Valor<String>("string");
        System.out.println(valorString.getValor());
        valorString.setValor("outra string");
        System.out.println(valorString.getValor());

        // Criando um objeto Valor que recebe um valor Integer
        Valor<Integer> valorInteiro = new Valor<Integer>(1);
        System.out.println(valorInteiro.getValor());
        valorInteiro.setValor(2);
        System.out.println(valorInteiro.getValor());
    }
}
```

## Interfaces Genéricas

Interfaces também podem ser genéricas. Para isso basta colocar o `<T>` após o nome da interface.

```java
public interface Valor<T> {
    public T getValor();
    public void setValor(T valor);
}
```