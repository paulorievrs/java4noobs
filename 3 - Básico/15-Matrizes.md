<h1>Matrizes ou Arrays Multidimensionais</h1>
De acordo com a <a href="https://www.inf.pucrs.br/~pinho/LaproI/Vetores/Vetores.htm">PUCRS</a>: Uma matriz é uma coleção de variáveis de mesmo tipo, acessíveis com um único nome e armazenados contiguamente(lado a lado) na memória. A individualização de cada variável de um vetor(array) é feita através do uso de índices. Os Vetores são matrizes de uma só dimensão. 

Logo, uma matriz é um array de várias posições, portanto, também é um objeto.

Exemplo básico:
```java
int[][] nomes = new int[2][2];
```
Para declarar uma matriz é necessário colocar o tipo dele, e na frente os 2 conjuntos de colchetes, depois o nome, como se fosse uma variável, depois ele vai receber "**new**" que é para instanciar o objeto, depois repete-se o tipo com os colchetes, só que dentro deles o tamanho que irá ser a matriz, ou seja, quantas posições elas terão, quantos dados podem ser armazenados. Nesse caso podem ser armazenados 4 dados, 2 * 2;

Um exemplo prático seria:
```java
public class Matrizes {
    public static void main(String args[]) {

        int[] A = new int[2][2];
        A[0][0] = 1;
        A[0][1] = 2;
        A[1][0] = 3;
        A[1][1] = 4;
        
    }
}

```
Essa matriz é representada matematicamente assim:

<img src="../img/matrizes.png">

A primeira parte da declaração é qual linha e a segunda parte é qual coluna voce quer colocar o dado. Também inicia-se com 0 ambas.

[Próximo](./16-Diferencas-Static-nonStatic.md) - Diferenças de Static e nonStatic