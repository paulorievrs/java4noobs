<h1>Arrays</h1>
Os Arrays são uma coleção de dados de algum tipo, qualquer tipo de variável pode conter uma coleção de itens, como por exemplo podemos criar um Array de numeros inteiros que representam o conjunto matemático Z, um Array de Strings que armazena vários nomes de uma lista de alunos.

Arrays são um objeto em Java, e por isso sua declaração se assemelha um pouco ao Scanner.

Exemplo básico:

```java
int[] contador = new int[10]; //exemplo 1
String[] nomes = {Daniel, Andre, João}; //exemplo 2
float[] numeros; //exemplo 3
numeros = new float[10]; //exemplo 3
```
Existe várias formas de declarar um array. A primeira delas é declarando o tipo com os colchetes na frente, depois o nome seguido de <strong>"="</strong> a pois isso, ele vai receber <strong>"new"</strong> que é para instanciar o objeto, depois repete-se o tipo com os colchetes, só que dentro dele o tamanho que irá ser o array, ou seja, quantas posições ele vai ter, quantos dados podem ser armazenados.<strong>(exemplo 1)</strong>

Outra forma é logo após o <strong>"new"</strong> colocar os valores que preenchem aquele vetor dentro dos colchetes.<strong>(exemplo 2)</strong>

E por fim pode-se instanciar ele depois de ser criado.<strong>(exemplo 3)</strong>

Cada dado inserido tem uma posição, que vai de 0 até o valor que você inseriu nos colchetes - 10. No nosso caso vai de 0 até 9, ou seja, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9.

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

<h2>Arrays e Funções</h2>

Passar o Array para uma função é bem útil, e também como retorná-lo. Vamos ver na pratica como acontece.

```java
public class ArraysEfuncoes {

    public static int somaDosElementosDoArray(int[] idadeAlunos) {
        //Receber um array como parâmetro é como se tivesse criando outro array, mas sem a parte da atribuição.

        int acumularSoma = 0;

        for(int i = 0; i < 5; i++) { 
        //Ele só funciona porque sabemos o tamanho do array, e se não soubessemos?
        
            acumularSoma = acumularSoma + idadeAlunos[i];
        }
        return acumularSoma;
        
        /*
        Esse for é de extrema importância pois nele é possivel
        Somar todas as posições utilizando a variável de controle
        Testá-lo e tentar fazer ele sozinho é muito importante.
        */
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

As arrays em Java tem uma propriedade chamada *length*, usando ela é possível capturar o tamanho do array.

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

Existe uma classe chamada Arrays, é uma classe com muitos métodos estáticos para facilitar a manipulação de arrays.

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
```

[Próximo](./14-Exercico2.md) - Exercícios 02