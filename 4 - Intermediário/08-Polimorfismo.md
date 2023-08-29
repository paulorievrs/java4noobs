# Polimorfismo

Polimorfismo é a capacidade de um objeto de tomar várias formas. Em Java, isso significa que um objeto pode se identificar com mais de uma classe. A forma mais comum de polimorfismo é quando uma superclasse é referenciada por uma subclasse.

Vamos voltar no exemplo de herança que vimos na seção anterior. Nesse exemplo, a classe `Cachorro` herda de `Animal`. Isso significa que um objeto do tipo `Cachorro` pode ser referenciado por uma variável do tipo `Animal`. Por exemplo:

```java
// Criar a super class Animal com um método fazerBarulho()
class Animal {
    public void fazerBarulho() {
        System.out.println("O animal faz barulho...");
    }
}

// Criar a sub class Cachorro que herda de Animal e sobrescreve o método fazerBarulho()
class Cachorro extends Animal {
    @Override
    public void fazerBarulho() {
        System.out.println("Au au!");
    }
}

// Criar a sub class Gato que herda de Animal e sobrescreve o método fazerBarulho()
class Gato extends Animal {
    @Override
    public void fazerBarulho() {
        System.out.println("Miau!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Criar um objeto do tipo Cachorro
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        // Criar um array de animais
        Animal[] animais = {cachorro, gato};

        // Percorrer o array e chamar o método fazerBarulho() de cada animal
        for (Animal animal : animais) {
            animal.fazerBarulho();
        }
        // Saída:
        // Au au!
        // Miau!
    }
}
```

No exemplo acima, apesar de `animais` ser um array de objetos da classe `Animal`, ele pode conter objetos de `Cachorro` e `Gato`. Isso é possível porque `Cachorro` e `Gato` herdam de `Animal`. Quando um objeto de uma subclasse é referenciado por uma variável de uma superclasse, dizemos que o objeto está sendo **polimórfico**.

A vantagem de utilizar o polimorfismo é que torna mais fácil a extensão e manutenção do código. Por exemplo, se desejarmos adicionar um novo animal de uma nova subclasse no futuro, não será necessário alterar o código que percorre o array e chama o método `fazerBarulho()`. Basta adicionar o novo animal ao array.

## Polimorfismo com interfaces

Outra forma de polimorfismo é quando uma classe implementa uma interface. Nesse caso, um objeto do tipo da classe pode ser referenciado por uma variável do tipo da interface. Por exemplo:

```java
// Criar a interface Animal com um método fazerBarulho()
interface Animal {
    public void fazerBarulho();
}

// Criar a classe Cachorro que implementa a interface Animal
class Cachorro implements Animal {
    @Override
    public void fazerBarulho() {
        System.out.println("Au au!");
    }
}

// Criar a classe Gato que implementa a interface Animal
class Gato implements Animal {
    @Override
    public void fazerBarulho() {
        System.out.println("Miau!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Criar um objeto do tipo Cachorro
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        // Criar um array de animais
        Animal[] animais = {cachorro, gato};

        // Percorrer o array e chamar o método fazerBarulho() de cada animal
        for (Animal animal : animais) {
            animal.fazerBarulho();
        }
        // Saída:
        // Au au!
        // Miau!
    }
}
```

## Polimorfismo Dinâmico

Polimorfismo dinâmico ocorre quando um método é sobrescrito por uma subclasse após a compilação, ou seja enquanto o código está sendo executado. Vamos pegar pro exemplo mais uma vez as classes `Animal`, `Cachorro` e `Gato`:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Animal animal;

        System.out.println("Qual animal você quer criar? (1 - Cachorro, 2 - Gato)");
        int opcao = leitor.nextInt();

        if (opcao == 1) {
            animal = new Cachorro();
        } else {
            animal = new Gato();
        }

        animal.fazerBarulho();
    }
}
```

No exemplo acima declaramos uma váriavel `animal` do tipo `Animal`. Dependendo da opção escolhida pelo usuário, instanciamos um objeto do tipo `Cachorro` ou `Gato` e atribuímos à variável `animal`. Em seguida, chamamos o método `fazerBarulho()` do objeto `animal`. Como o método `fazerBarulho()` foi sobrescrito pelas classes `Cachorro` e `Gato`, o método chamado será o da classe instanciada. Isso tudo ocorre em tempo de execução, por isso o nome polimorfismo dinâmico.

É relevante mencionar que a abordagem do exemplo acima se conecta com a [seção de variáveis](/3%20-%20B%C3%A1sico/04-Variaveis.md), uma vez que está utilizando o conceito de "inicialização tardia" de uma variável.

[Próximo](./09-ModificadoresDeAcesso.md) - Modificadores de Acesso