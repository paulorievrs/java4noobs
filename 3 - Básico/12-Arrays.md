<h1>Arrays</h1>
Os Arrays são uma coleção de dados de algum tipo, qualquer tipo de variável pode conter uma coleção de itens, como por exemplo podemos criar um Array de numeros inteiros que representa o conjunto matemático Z, um Array de Strings que armazena vários nomes de uma lista de alunos.

Arrays são um objeto em Java, e por isso sua declaração se asemelha um pouco ao Scanner.

Exemplo básico:

```java
int[] nomes = new int[10];
```
Para declarar um array é necessário colocar o tipo dele, e na frente os colchetes, depois o nome, como se fosse uma variável, depois ele vai receber "new" que é para instaciar o objeto, depois repete-se o tipo com os colchetes, só que dentro dele o tamanho que irá ser o array, ou seja, quantas posições ele vai ter, quantos dados podem ser armazenados.

Cada dado inserido tem uma posição, que vai de 0 até o valor que você insiriu nos colchetes - 1. No nosso caso vai de 0 até 9, ou seja, 0, 1, 2, 3, 4..., 8, 9.

Um exemplo prático seria:
```java
public class Arrays {
    public static void main(String args[]) {

        int[] idadeAlunos = new int[5];
        idadeAlunos[0] = 10; //o array, no caso, idadeAlunos, na posição 0 (primeira), recebe o valor de 10. 

        idadeAlunos[1] = 11;
        idadeAlunos[2] = 13;
        idadeAlunos[3] = 12;
        idadeAlunos[4] = 11;
        
    }
}
```

<h2>Arrays e funções</h2>

Passar o Array para uma função é bem útil, e também como retorna-lo. Vamos ver na pratica como acontece.

```java
public class ArraysEfuncoes {

    public static int somaDosElementosDoArray(int[] idadeAlunos) {
        //receber um array como parametro é como se tivesse criando outro array, mas sem a parta da atribuição.

        int acumularSoma = 0;

        for(int i = 0; i < 5; i++) { //ele so funciona porque sabemos o tamanho do array, e se não soubessemos?
            acumularSoma = acumularSoma + idadeAlunos[i];
        }
        return acumularSoma;
        
        //esse for é de estrema importância pois nele é possivel
        //somar todas as posições utilizando a variavel de controle
        //testa-lo e tentar fazer ele sozinho é de estrema importancia.

    }

    public static void main(String args[]) {

        int[] idadeAlunos = new int[5];
        idadeAlunos[0] = 10; //o array, no caso, idadeAlunos, na posição 0 (primeira), recebe o valor de 10. 

        idadeAlunos[1] = 11;
        idadeAlunos[2] = 13;
        idadeAlunos[3] = 12;
        idadeAlunos[4] = 11;

        int somaDasIdades = somaDosElementosDoArray(idadeAlunos);
        //passar um array como parametro é so passar o seu nome sem colchetes nem nada.

    }
}
```

Uma pergunta foi feita na função de somar as idades. O tamanho do array pode ser algo não definido na hora da criação do programa. Como foi dito, o array é um objeto, e objetos tem seus próprios métodos como o Scanner que possui metodos de leitura.

Todo Array em Java tem alguns métodos para auxiliar o programador. Vou destacar dois importantes.

<li>nomeDoArray.length - Seu uso é simples, coloque o nome do array e depois um ponto final e a instancia do metodo, no caso o length, pense que ele se torna uma variável que nela aparece o valor do tamanho do Array. Os parenteses sao necessáros assim como a chamada de uma função</li>

<li>nomeDoArray.sort() - é metodo do array que ordena ele de ordem crescente. Você pode fazer um outro array receber o ordenado.


```java
public class MetodosArray {
    public static void main(String args[]) {
        
        int[] idadeAlunos = new int[5];

        idadeAlunos[0] = 10;
        idadeAlunos[1] = 11;
        idadeAlunos[2] = 13;
        idadeAlunos[3] = 12;
        idadeAlunos[4] = 11;

        System.out.println(idadeAlunos.length);
        //mostra o tamanho do array.
        
        int[] ordenado = idadeAlunos.sort();
        //ordena em ordem crescente o array

    }
}