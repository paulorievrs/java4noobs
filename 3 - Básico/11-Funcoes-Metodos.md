<h1> Funções ou métodos </h1>
Para o básico, você pode levar em conta que ambos são a mesma coisa.

Um método/função realiza uma parte do código em uma área diferente da **FUNÇÃO PRINCIPAL** mas deve ser chamada dentro dela para acontecer. Esse método pode ou não retornar alguma coisa que poderá ser armazanado em uma variável.

Assim como existe a tipagem de variáveis é da mesma maneira de uma função. Cada um função deve ter um tipo, se você não quer que retorne nada o tipo será **void**. Ficará melhor de entender ao longo dos códigos. Também existem os parâmetros, que você pode passar para uma função utilizar algumas variáveis de sua preferência.

A sintaxe de uma função é muito parecida com a main, você vai iniciar com **public**, depois **static** e agora vem o tipo de função, que são os mesmo tipos de variáveis (int, float, double, etc...), depois isso vem obrigatoriamente parenteses que dentro você pode receber variaveis durante a chamada da função, e dentro da função, se ela nao for do tipo void, deve conter algum retorno do mesmo tipo dela.

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

        return c; //return é um comando para voltar alguma variavel (ou ate mesmo outra funcao) do mesmo tipo que a funcao foi criada.
    }

    public static void mostrar(int x) {
        //x é uma variavel qualquer passada por parametro
        System.out.println(x); //mostra o conteudo que veio em x.
    }


    public static void main(String args[]) {
        int a = 5;
        int b = 10;

        int c = soma(a, b); //chamando a funcao e atribuindo o que retorna dela na variável c. É passado por parametro os valores que você quer somar e a variável que vai receber deve ser do tipo de retorno da função.

        mostrar(c); //chamando uma função sem retorno que mostra a variavel passada por paramentro
    }
}
```

O uso de uma função deve ser tão natural quando o uso de uma variável, assim como tudo ensinado, você deve implementar, fazer seus testes, errar, aprender e crescer fazendo isso. É um salto bem grande aprender esse tipo de coisa pelo fato de que seu código agora, ao invés de ficar amotoado na Main, ele pode ser modularizado, além disso, é possível criar funções que podem ser reutilizadas, como a da soma, ou você pode criar uma função que lê dados digitados pelo usuário e retorna eles, fica mais fácil que ficar chamando o scanner toda hora.
