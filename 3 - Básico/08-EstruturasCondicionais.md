<h1>Estruturas condicionais</h1>
Esse módulo irá apresentar a vocês as famosas estruturas de Condição como: if/else e switch.

Para melhor entendimento você deve ter lido o módulo <a href="https://github.com/paulorievrs/java4noobs/blob/master/3%20-%20B%C3%A1sico/07-OperadoresLogicos-e-Comparacao.md">07 - Operadores Logicos e Comparacao</a>.

<h2>IF/ELSE</h2>

Se você ler em português **"IF" = "SE"** e **ELSE = "SENÃO"**, e na programção não é diferente, mas chamam-se estruturas de condição pois acontece desta forma: *se 5 é maior que 10 faça isso, senão, faça aquilo*.

Vamos seguir para o código que é mais simples de entender.

O **IF** é uma estrutura separada do **ELSE** mas, o **ELSE** não existe sem um IF.

<h3>IF</h3>

Na pratica o **IF** ocorre da seguinte maneira:

```java
public class If {
    public static void main(String args[]) {
        int idade1 = 50;
        int idade2 = 10;

        if (idade1 > idade2) { //leia-se "se a idade1 for maior que a idade2, ocorre o que estiver entre os blocos de chaves".
            System.out.println("A idade1 é maior que a idade2");
        }
    }
}
```

<h3>ELSE</h3>

Na prática o **ELSE** ocorre assim:

```java
public class IfElse {
    public static void main(String args[]) {
        int idade1 = 10;
        int idade2 = 50;

        if (idade1 > idade2) { //leia-se "se a idade1 for maior que a idade2, ocorre o que estiver entre os blocos de chaves".
            System.out.println("A idade1 é maior que a idade2");
        } else { //leia-se: "senão, ocorre o que estive dentro dos blocos".
            System.out.println("A idade2 é maior que a idade1");
        }
    }
}
```
Basicamente é, se o que estiver entre os parênteses do **IF** der falso, ou seja, não for verdadeiro, o **ELSE** ocorre.


<h3>ELSE IF</h3>

O ELSE IF é um pouco mais complexo de entender, ele tem várias condições **IF** e por último cai na **ELSE**, ou seja, se ele der falso na primeira condição, ele parte para a próxima, se ele der falso na próxima, ele passa para outra até que atinja uma condição else.


```java
public class ElseIf {
    public static void main(String args[]) {
        int idade1 = 50;
        int idade2 = 50;

        if (idade1 > idade2 10) { //leia-se: "se a idade1 for maior que a idade2, ocorre o que estiver entre os blocos de chaves".

            System.out.println("A idade1 é maior que a idade2");

        } else if (idade1 < idade2) { //leia-se: "se a condição do bloco anterior não foi satisfeita, E se a idade1 for menor que idade2, ocorre o que tiver dentro das chaves".

            System.out.println("A idade2 é maior que a idade1");

        } else { //senão, ocorre o que estive dentro dos blocos.

            System.out.println("A idade2 é igual que a idade1");
        }
    }
}
```

<h3>Operador ternário</h3>
Operador ternário resumidamente tem o mesmo princípio do IF/ELSE só que de maneira simplificada em somente uma linha. Utilizado quando há somente um IF e um ELSE.

```java
public class OperadorTernario {
    public static void main(String args[]) {
        int idade1 = 60;
        int idade2 = 50;
        int idadeMaior;

        idadeMaior = idade1 > idade2 ? idade1 : idade2; /*lê-se: idadeMaior vai receber o valor de idade1 se a condição for verdadeira, caso contrário idadeMaior vai receber o valor de idade2
        idadeMaior também pode receber o valor diretamente em sua declaração, exemplo:
        int idadeMaior = idade1 > idade2 ? idade1 : idade2;
        */
        System.out.println(idadeMaior); //resultado vai ser "60" porque idade1(60) é maior que idade2(50).
    }
}
```
Funciona da seguinte maneira: se a condição booleana <strong>(idade1 > idade2)</strong> for verdadeira, o que vai ser executado é o código que vem depois do <strong>"?"</strong>, e caso seja falso, o que vai ser executado vai ser o código que vem depois do <strong>":"</strong>.

<h3>Switch Case</h3>
O Switch Case é como se fosse a distribuição de um menu, no qual, dependendo do valor de uma variável pode realizar várias coisas. Na prática fica mais fácil de entender.

```java
import java.util.Scanner;
public class Switch {
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);
        int caso = 0; //inicializando variável com um valor qualquer.

        System.out.println("Digite 1 para mostrar o nome Paulo, 2 para mostrar o nome José, e 3 para mostrar o nome Joyce");
        caso = leitor.nextInt();

        switch (caso) { //inicia-se a estrutura com switch e colocando a variável que quer olhar na frente.

        //os casos são de acordo com o que você espera da variável. é testado cada caso verificando se é compativel com o que foi digitado.

            case 1: //caso for numero 1, entra:
                System.out.println("Paulo");
                break; //break é necessário para informar o fim do bloco do caso.
            
            case 2:
                System.out.println("José");
                break;

            case 3: 
                System.out.println("Joyce");
                break;

            default: //caso o que foi digitado não seja nenhum dos casos que definiu o default é acionado. Ele não é necessário.
                System.out.println("Valor não encontrado no menu");
            //nao é necessário break por ser o último caso.
        }
    }
}

```

[Próximo](./09-Exercicio1.md) - Exercício 1