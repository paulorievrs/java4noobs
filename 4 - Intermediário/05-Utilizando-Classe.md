<h1>Utilizando a classe criada</h1>

No módulo anterior foi criada uma classe explicando tudo, ela será referenciada novamente aqui, e será explicado como utilizá-la.

Ao instanciar uma classe, você cria uma variável que é um objeto, que pode ser declarada como se estivesse criando um variável normal.


```java
class Pessoa { //não é necessário dizer que ela é publica se ela não armazenar a classe principal

    //criação de atributos privados pelo encapsulamento
    private String nome;
    private int idade;
    private String cpf;

    public Pessoa() {
        //esse é o construtor, a primeira função  que é executada quando instancia a classe sem passar nenhum parâmetro.
        this.nome = "";
        this.idade = 0;
        this.cpf = "";

    }

    public Pessoa(String nome, int idade, String cpf) {
        //Esse construtor permite você instanciar a classe e passar parâmetros.
        //se voce chamar o construtor e colocar entre parenteses todos os atributos eles já são inseridos automaticamente.
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    //como os atributos são privados, esses métodos abaixo são a única maneira de manipula-los.


    //criação dos getters e setters.


    public void setNome(String nome) {
        //chamando esse método com o objeto Pessoa, passando o nome como parâmetro, atribui o nome no objeto.

        this.nome = nome; //o this significa que está utilizando o objeto que chamou o método.
    }

    public String getNome() {
        return this.nome; //retorna o atributo nome do objeto que chamou o método.
    }

    public void setIdade(int idade) {
        //chamando esse método com o objeto Pessoa, passando a idade como parâmetro, atribui a idade no objeto.

        this.idade = idade; //o this significa que está utilizando o objeto que chamou o método.
    }

    public int getIdade() {
        return this.idade; //retorna o atributo idade do objeto que chamou o método.
    }

    public void setCpf(String cpf) {
        //chamando esse método com o objeto Pessoa, passando o cpf como parâmetro, atribui o cpf no objeto.

        this.cpf = cpf; //o this significa que está utilizando o objeto que chamou o método.
    }

    public String getCpf() {
        return this.cpf; //retorna o atributo cpf do objeto que chamou o método.
    }

    //funções que a classe faria.

    public void aumentarIdade() {
        //função que ao ser chamada aumenta a idade em 1 da Pessoa.
        this.idade++; 
    }

}

public class UtilizandoClasse {

    public static void main(String args[]) {

        String nome = "mario";
        int idade = 19;
        String cpf = "000.111.222-33";

        Pessoa nova = new Pessoa();
        //instanciando o objeto pessoa para poder utilizar dos metodos da classe. Utilizando o construtor sem parametros.
        
        //abaixo exemplos de como utilizar os getters.
        nova.setNome(nome);
        nova.setIdade(idade);
        nova.setCpf(cpf);

        String nome2 = "Joyce";
        int idade2 = 23;
        String cpf2 = "000.111.222-33";

        Pessoa outra = new Pessoa(nome2, idade2, cpf2);
        //Criando nova Pessoa utilizando o construtor como parâmetros

        //Utilizando getters e setters.

        System.out.println("A pessoa nova de nome: " + nova.getNome() + " e idade: " + nova.getIdade() + " tem o cpf de: " + nova.getCpf());

        System.out.println("A pessoa outra de nome: " + outra.getNome() + " e idade: " + outra.getIdade() + " tem o cpf de: " + outra.getCpf());

    }
}
```

[Próximo](./07-Collections-e-Stream.md) - Collections e Stream API
