<h1>Leitura e Escrita de Arquivo</h1>

Em Java é possível criar e manipular arquivos, é bem simples, mas é necessário fazer o uso de algumas classes.

Exemplo:
>Exemplo modificado do site <a href="https://www.devmedia.com.br/leitura-e-escrita-de-arquivos-de-texto-em-java/25529">DevMedia</a>

```java
import java.io.*; //importa toda classe IO.
import java.util.Scanner;

public static void leitor() throws IOException {
    BufferedReader leitor = new BufferedReader(new FileReader("./nomedoarquivo.txt"));
    /*
    Cria um objeto da classe BufferedReader para ler o arquivo.
    O seu construtor recebe um objeto da classe FileReader que recebe outro parâmetro correspondente ao caminho do arquivo.
    */


    String linha = leitor.readLine(); //String para exibir o conteúdo do arquivo.

    while (linha != null) {
        //Enquanto for verdadeiro, ou seja, enquanto tiver linha para ser lida no arquivo

        System.out.println(linha); //Exibe conteúdo da linha.

        linha = leitor.readLine();
        /*
        Variável linha recebe o conteúdo da próxima linha
        Se não houver mais linhas para serem lidas, readLine() retorna null
        */
    }
    leitor.close(); //Encerra o uso do arquivo.
}

public static void escritor() throws IOException {

    BufferedWriter escritor = new BufferedWriter(new FileWriter("./nomedoarquivo.txt"));
    /*
    Cria um objeto da classe BufferedWriter para ler o arquivo.
    O seu construtor recebe um objeto da classe FileWriter que recebe outro parâmetro correspondente ao caminho do arquivo.
    */

    Scanner leitor = new Scanner(System.in); //Cria um Scanner para receber o que foi digitado e inserir no arquivo.

    System.out.print("Escreva alguma coisa: ");
    String linha = leitor.nextLine(); //Recebe o que foi digitado pelo usuário

    escritor.append(linha + '\n');
    //Insere o conteúdo da variável linha no final do arquivo e adiciona uma quebra de linha com o '\n'

    escritor.close(); //Encerra o uso do arquivo.
}
```

<h2>Try-with-resources</h2>

Se o try-with-resources for utilizado em conjunto com o BufferedReader e do BufferedWriter, não é necessário encerrar o uso do arquivo com o `close()`. Isso acontece automaticamente e garante que o arquivo será encerrado.

```java
try (BufferedReader leitor = new BufferedReader(new FileReader("./nomedoarquivo.txt"))) {
    String linha = leitor.readLine();
    while (linha != null) {
        System.out.println(linha);
        linha = leitor.readLine();
    }
}
```

<h2>Outras formas de ler/escrever arquivos</h2>

* Faz a leitura do arquivo e cada linha é inserida em uma lista
```java
Path caminho = Paths.get("./nomedoarquivo.txt");
List<String> linhas = Files.readAllLines(caminho);
System.out.println(linhas);
```

* Cria um BufferedReader de uma forma mais simplificada. É compatível com o try-with-resources
```java
Path caminho = Paths.get("./nomedoarquivo.txt");
BufferedReader leitor = Files.newBufferedReader(caminho);
String linha = leitor.readLine();
while (linha != null) {
    System.out.println(linha);
    linha = leitor.readLine();
}
leitor.close();
```

* Cria um BufferedWriter de uma forma mais simplificada. Também é compatível com o try-with-resources
```java
Path caminho = Paths.get("./nomedoarquivo.txt");
BufferedWriter escritor = Files.newBufferedWriter(caminho);
Scanner scanner = new Scanner(System.in);
System.out.print("Escreva alguma coisa: ");
String linha = scanner.nextLine();
escritor.append(linha + '\n');
escritor.close();
```

[Próximo](./03-InicioPOO.md) - Início de Programação Orientada a Objetos