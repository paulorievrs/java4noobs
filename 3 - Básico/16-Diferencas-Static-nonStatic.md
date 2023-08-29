# Diferenças de Static e non-Static

Variáveis e métodos podem ser criadas com a palavra `static` ou não. Mas, qual a diferença entre elas?

## Static (estático)

Métodos e variáveis estáticos pertence à uma classe e não à uma instância de objeto dessa classe. Quando uma variável ou método é criado com `static`, ele pode ser acessado sem a necessidade de instanciar um objeto.

O exemplo abaixo mostra o uso de uma variável estática para contar o número total de instâncias de uma classe. A variável `contagem` é incrementada sempre que um novo objeto é criado. O método `getContagem()` é estático e pode ser chamado sem a necessidade de instanciar um objeto. O método retorna o número total de instâncias criadas. Caso o método não fosse estático, seria necessário instanciar um objeto para chamar o método, e como o método retorna o número total de instâncias, o valor retornado seria sempre 1.

```java
public class Contador {
    // Variável estática para contar o número total de instâncias da classe
    static int contagem = 0;

    // Construtor da classe Contador
    public Contador() {
        contagem++; // Incrementa o contador sempre que um novo objeto é criado
    }

    // Método estático para obter o número total de instâncias criadas
    public static int getContagem() {
        return contagem;
    }

    public static void main(String[] args) {
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();

        // Usando o método estático para obter o número total de instâncias criadas
        System.out.println("Número total de instâncias: " + Contador.getContagem()); // 3
    }
}
```

## Non-static (não estático)

Métodos e variáveis não estáticos pertencem à uma instância de objeto de uma classe. Quando uma variável ou método é criado sem `static`, ele só pode ser acessado através de uma instância do objeto.

O exemplo mostra o uso de métodos e variáveis não-estáticos. Como as variáveis e métodos não são estáticos, é necessário instanciar um objeto para acessá-los. O método `exibirInformacoes()` vai ter um retorno diferente dependendo do objeto que o chama.

```java
public class Pessoa {
    // Variáveis não estáticas.
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public static void main(String[] args) {
        // Criando duas instâncias da classe Pessoa
        Pessoa pessoa1 = new Pessoa("João", 25);
        Pessoa pessoa2 = new Pessoa("Maria", 30);

        // Chamando o método não estático para exibir informações de cada pessoa
        pessoa1.exibirInformacoes(); // Nome: João, Idade: 25
        pessoa2.exibirInformacoes(); // Nome: Maria, Idade: 30
    }
}
```

[Próximo](./17-Excecoes.md) - Exceções