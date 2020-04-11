<h1>Leitura e Criação de Arquivo</h1>

Em Java é possível criar e manipular arquivos, é bem simples, mas é preciso de algumas classes.

Exemplo:
>Exemplo modificado do site <a href="https://www.devmedia.com.br/leitura-e-escrita-de-arquivos-de-texto-em-java/25529">DevMedia</a>

```java
import java.io.*; //importa toda classe IO.
import java.util.Scanner;

public static void leitor() throws IOException {
        BufferedReader leitor = new BufferedReader(new FileReader("./nomedoarquivo.txt"));
        //criando objeto da classe BufferedReader para ler o arquivo, passando como parametro um 
        //objeto da classe FileReader que recebe como parâmetro a localização do arquivo.


        String linha = ""; //String para mostrar o conteúdo do arquivo.

        while (true) { //enquanto for verdadeiro, ou seja, para sempre

            if (linha != null) { //testando se o arquivo acabou
            
                System.out.println(linha); //mostrar conteúdo.
 
            } else {
                break; //encerrar o loop se encontrar null
            }

            linha = leitor.readLine(); //variável linha recebe o conteúdo do arquivo.
        }
        leitor.close(); //encerra o uso do leitor do arquivo.
    }
 
    public static void escritor() throws IOException {

        BufferedWriter escritor = new BufferedWriter(new FileWriter("./nomedoarquivo.txt"));
        //criando objeto da classe BufferedWriter para escrever no arquivo, passando como parametro um 
        //objeto da classe FileWriter que recebe como parametro a localização do arquivo.

        String linha = "";//string para mostrar o contúdo do arquivo.


        Scanner leitor = new Scanner(System.in); //criação do scanner para receber o que foi digitado e inserir no arquivo.

        System.out.println("Escreva algo: "); 
        linha = leitor.nextLine(); //recebe o que foi digitado pelo usuário

        escritor.append(linha + "\n"); //coloca dentro do arquivo o foi digitado e o \n coloca um enter na frente para colocar quebra de linha

        escritor.close(); //encerra o uso do arquivo.
    }