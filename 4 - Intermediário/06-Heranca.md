# Herança

Quando você cria uma classe, você pode fazer com que ela herde os atributos e métodos de outra classe. Esse processo é chamado de herança. A classe que herda é chamada de subclasse e a classe de onde ela herda é chamada de superclasse. Para herdar de uma classe, use a palavra-chave `extends` depois do nome da subclasse e o nome da superclasse.

No exemplo abaixo temos uma classe `Animal` que possue um método `comer()` e uma classe `Cachorro` que herda de `Animal` e possue um método `latir()`. Quando criamos um objeto do tipo `Cachorro` podemos acessar os métodos tanto de `Animal` e `Cachorro`, afinal o `Cachorro` herda de `Animal`.

```java
class Animal {
    public void comer() {
        System.out.println("Comendo...");
    }
}

class Cachorro extends Animal {
    public void latir() {
        System.out.println("Au au!");
    }
}

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.comer();
        cachorro.latir();
    }
}
```

A utilização da herança é importante para reutilizar código e evitar repetição. Por exemplo, se todos os animais comem, não faria sentido implementar o método `comer()` em cada classe de animal. Além disso, isso facilita a manutenção e expansão do código. Se no futuro precisarmos adicionar um novo método à classe `Animal`, por exemplo, o método `dormir()`, podemos adicioná-lo à classe Animal e todos os animais herdarão esse método.

## Sobrescrever métodos

Em alguns casos, você pode querer que a subclasse tenha um método com o mesmo nome da superclasse, porém com uma funcionalidade diferente. Para isso, você pode sobrescrever o método da superclasse. Para sobrescrever um método basta criar um método com o mesmo nome e parâmetros na subclasse. É também recomendado, mas não obrigatório, utilizar a anotação `@Override` para indicar que o método está sendo sobrescrito.

```java
class Animal {
    public void fazerBarulho() {
        System.out.println("O animal faz barulho...");
    }
}

class Cachorro extends Animal {
    @Override
    public void fazerBarulho() {
        System.out.println("Au au!");
    }
}
```

[Próximo](./07-Interfaces.md) - Interfaces