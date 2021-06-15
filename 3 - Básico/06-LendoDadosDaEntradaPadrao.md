<h1>Ler dados da Entrada Padrão</h1>
Afinal, o que é entrada padrão? A entrada padrão por início é seu teclado, ela pode ser redirecionada, mas vamos utilizar só o teclado como base.

<h2>Importações</h2>
Para ler os dados é necessário que importemos uma classe, então, na primeira linha do seu código insira:

```java
import java.util.Scanner;
```

Essa classe Scanner permite que criemos um objeto que consiga receber dados digitados pelo usuário.

<h2>Lendo dados</h2>
A leitura de dados permite que você realize operações e simule um código rodando realmente com seus dados e não com pré-inserções.

O Scanner consegue fazer leituras de todos os tipos de dados, mas é necessário utilizar de formas diferentes para cada tipo de dado.

Ou ele lê uma linha inteira, ou um tipo especifíco.


```java
import java.util.Scanner;
public class Leitura {
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in); //por agora basta você entender que estamos criando um Scanner para leitura. Também chamado de instanciar objeto.

        System.out.println("Digite o nome: ");
        String nome = leitor.nextLine(); //lendo uma String que voce digitar, ou, a proxima linha completa.

        System.out.println("Digite a idade: ");
        int idade = leitor.nextInt(); //lendo um valor inteiro que for digitado.

        System.out.println("Digite o peso: ");
        double peso = leitor.nextDouble(); //lendo um double quando for digitado.

        System.out.println("O nome digitado foi: " + nome + " e a idade foi: " + idade + " e o peso foi: " + peso);
    }
}
```
**Obs**.: Após digitar um dado aperte enter para prosseguir com a continuação do programa.

[Próximo](./07-OperadoresLogicos-e-Comparacao.md) - Operadores lógicos