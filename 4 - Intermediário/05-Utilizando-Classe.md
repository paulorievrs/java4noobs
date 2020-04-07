<h1>Utilizando a classe criada</h1>

No módulo anterior foi criada uma classe explicando tudo, irei recolocar ela aqui, e irei explicar como utilizar.

Ao criar uma classe, voce cria uma variável que é um objeto, que pode ser declarada como se estivesse criando um variável normal.


```java
class Pessoa { //nao é necessário dizer que ela é publica se ela nao armazenar a classe principal

    //criação de atributos privados pelo encapsulamento
    private String nome;
    private int idade;
    private String cpf;

    public Pessoa() {
        //esse é o construtor que quando voce instancia o objeto ele coloca esses valores nos atributos
        this.nome = "";
        this.idade = 0;
        this.cpf = "";

    }

    public Pessoa(String nome, int idade, String cpf) {
        //se voce chamar o construtor e colocar entre parenteses todos os atributos eles já são inseridos automaticamente
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    //como os atributos são privados, esses métodos abaixo são a única maneira de manipula-los.


    //criação dos get e sets.


    public void setNome(String nome) {
        //chamando esse método com o objeto pessoa, passando o nome como parametro, adiciona o nome naquele objeto.

        this.nome = nome; //o this significa que está utilizando o objeto que chamou o método.
    }

    public String getNome() {
        return this.nome; //retorna o nome do objeto que chamou o método.
    }

    public void setIdade(int idade) {
        //chamando esse método com o objeto pessoa, passando a idade como parametro, adiciona a idade naquele objeto.

        this.idade = idade; //o this significa que está utilizando o objeto que chamou o método.
    }

    public int getIdade() {
        return this.idade; //retorna a idade do objeto que chamou o método.
    }

    public void setCpf(String cpf) {
        //chamando esse método com o objeto pessoa, passando o cpf como parametro, adiciona o cpf naquele objeto.

        this.cpf = cpf; //o this significa que está utilizando o objeto que chamou o método.
    }

    public String getCpf() {
        return this.cpf; //retorna o cpf do objeto que chamou o método.
    }

    //funcoes que a classe faria.

    public void aumentarIdade() {
        //função que ao ser chamada aumenta a idade em 1 da Pessoa.
        this.idade++; 
    }

}

public class UtilizandoClasse {

    public static void main(String args[]) {

        String nome = "Paulo";
        int idade = 19;
        String cpf = "000.111.222-33";

        Pessoa nova = new Pessoa();
        //instanciando o objeto pessoa para poder utilizar dos metodos da classe. Utilizando o construtor sem parametros.
        
        //abaixo exemplos de como utilizar os métodos de get.
        nova.setNome(nome);
        nova.setIdade(idade);
        nova.setCpf(cpf);

        String nome = "Joyce";
        int idade = 23;
        String cpf = "000.111.222-33";

        Pessoa outra = new Pessoa(nome, idade, cpf);
        //criando nova Pessoa utilizando o construtor como parametros

        //Utilizando set's e get's

        System.out.println("A pessoa nova de nome: " + nova.getNome() + " e idade: " + nova.getIdade() + " tem o cpf de: " + nova.getCpf());

        System.out.println("A pessoa outra de nome: " + outra.getNome() + " e idade: " + outra.getIdade() + " tem o cpf de: " + outra.getCpf());

    }
}
```