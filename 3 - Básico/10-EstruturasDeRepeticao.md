<h1>Estruturas de Repetição</h1>
As estruturas de repetição são estruturas que fazem o código repetidas vezes até que uma condição seja atingida. Se não houver condição, o programa roda infinitamente até ele parar sozinho, isso claramente é um bug. As estruturas que irei apresentar são: do/while, while e for.

<h2>Do/While</h2>
O do/while é uma estrutura que inicia sem olhar nenuma condição de parada, roda o que tem dentro das chaves e depois verifica a condição. A variável que vai gerar a condição de parada precisa ser criada fora da estrutura.

```java
public class EstruturaDoWhile {
    public static void main(String args[]) {
        int contador = 0; //iniciando a váriavel com 0 para certificar esse valor para ela

        do {

            System.out.println(contador); //mostra o contador até atingir a condição de parada.

            cont++; //icrementando para ir chegando perto da condição de parada.

        } while (contador < 10); //lê-se: faça enquanto o contador seja menor do que 10, quando ele chegar a 10 ele pare. 
        
        //A condição de parada no caso é quando o contador se iguala a 10 ou passa de 10.


    }
}
```

<h2>While</h2>
O While é uma estrutura que inicia olhando a condição de parada condição de parada, se a condição de parada já tiver sido atingida não entra no bloco de repetição, se não tiver atingido a condição de parada roda o que tem dentro das chaves e depois verifica a condição novamente. A variável que vai gerar a condição de parada precisa ser criada fora da estrutura.

```java
public class EstruturaWhile {
    public static void main(String args[]) {
        int contador = 0; //iniciando a váriavel com 0 para certificar esse valor para ela

        while (contador < 10) {

            System.out.println(contador); //mostra o contador até atingir a condição de parada.

            cont++; //icrementando para ir chegando perto da condição de parada.


        } //lê-se: Enquanto o contador seja menor do que 10, quando ele chegar a 10 ele pare. 
        
        //A condição de parada no caso é quando o contador se iguala a 10 ou passa de 10.


    }
}
```
<h2>For</h2>

O For é uma estrutura de repetição mais compacta, na qual, o bloco já determina aonde começa, a condição de parada e o passo dela (que é como essa variável se comportará para atingir a condição de parada), não é necessário declarar a váriavel antes, ela pode ser criada ao criar o for.

```java
public class EstruturaFor {
    public static void main(String args[]) {
        for(int contador = 0; contador < 10; contador++) { //declara a variável inicializando ela, coloca a condição de parada, e o passo.

            System.out.println(contador); //mostra o contador até o fim da condição de parada
        }
    }
}

```

Todas as suas saídas tem que ser essa:
<img src="../img/estruturasDeRepeticao.jpeg">