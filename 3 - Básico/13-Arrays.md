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
        
        //esse for é de extrema importância pois nele é possivel
        //somar todas as posições utilizando a variável de controle
        //testá-lo e tentar fazer ele sozinho é muito importante.
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
<br>

As arrays em Java tem uma propriedade chamada length, usando ela você consegue pegar o tamanho do array.
```java
public class TamanhoArray{
    public static void main(String[] args){
        String[] alunos = new String[4];
        alunos[0] = "Alberto";
        alunos[1] = "Gustavo";
        alunos[2] = "Lucas";
        alunos[3] = "Bruno";

        System.out.println(alunos.length);
        //Exibe 4, que é o tamanho do array
    }
}
```

Existe uma classe chamada Arrays, ela é uma classe com muitos métodos estáticos para facilitar a manipulação de arrays.

Alguns métodos dos mais importantes são:


<li>Arrays.toString(array) - Esse método recebe uma array como parâmetro e retorna a array em forma de String.</li> 

<li>Arrays.sort(array) - Esse método recebe uma array e ordena ela.</li>

<li>Arrays.copyOf(array, novoTamanho) - Esse método recebe uma array e um novo tamanho e como retorno tem a mesma array com o tamanho novo passado.</li>
<br>



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
        
        System.out.println(Arrays.toString(idadeAlunos));
        //Retorna [10, 11, 13 , 12, 11]

        int[] idadeAlunos2 = Arrays.copyOf(idadeAlunos, 10);
        //IdadeAlunos2 vai ter os mesmos valores mas invés de 5 irá ter 10 de tamanho.
        
        Arrays.sort(idadeAlunos);
        //idadeAlunos agora estão em ordem crescente
    }
}