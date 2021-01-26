import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class RequestJava {

    public static void fazerRequisicao(String urlPath) throws IOException {
        URL url = new URL(urlPath);
        //Instancia um objeto URL e insere a URL
        HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
        //Cria uma variável HttpURLConnection que será responsável por fazer a requisição HTTP
        conexao.setRequestMethod("GET"); //Seleciona qual o tipo do método a ser utilizado

        conexao.connect(); //Inicia a requisição
        imprimirResposta(conexao); //Função para imprimir a resposta da requisição
    }

    public static void fazerRequisicao(String urlPath, String metodo, Map<String, ?> requestBody) throws IOException {
        URL url = new URL(urlPath);
        //Instancia um objeto URL e insere a URL
        HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
        //Cria uma variável HttpURLConnection que será responsável por fazer a requisição HTTP
        conexao.setRequestMethod(metodo); //Seleciona qual o tipo do método a ser utilizado

        if (Objects.nonNull(requestBody)) { //Se a função receber algum corpo para a requisição, o mesmo é inserido
            conexao.setDoOutput(true); //Necessário para poder enviar um corpo na requisição
            try (PrintWriter escritor = new PrintWriter(conexao.getOutputStream())) {
                requestBody.forEach((chave, valor) -> escritor.print(chave + "=" + valor + "&"));
                //Escreve o conteúdo do corpo na requisição com uma expressão lambda
            }
        }
        conexao.connect(); //Inicia a requisição
        imprimirResposta(conexao); //Função para imprimir a resposta da requisição
    }

    public static void imprimirResposta(HttpURLConnection conexao) throws IOException {
        StringBuilder conteudo = new StringBuilder(); //Cria um StringBuilder para armazenar o corpo da resposta
        try (BufferedReader leitor = new BufferedReader(new InputStreamReader(conexao.getInputStream()))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                conteudo.append(linha); //Armazena cada linha da resposta no StringBuilder
            }
        }
        System.out.println("Código de resposta:");
        System.out.println(conexao.getResponseCode());
        System.out.println("Conteúdo da resposta:");
        System.out.println(conteudo.toString());
        System.out.println("Headers da resposta:");
        conexao.getHeaderFields().forEach((headerKey, headerValue) -> System.out.println(headerKey + ": " + headerValue));
        //Expressão lambda para imprimir os campos do header
    }

    public static void main(String[] args) throws IOException {
        fazerRequisicao("https://jsonplaceholder.typicode.com/todos/1"); // GET
        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("title", "titulo");
        requestBody.put("body", "corpo");
        requestBody.put("userId", 999);
        fazerRequisicao("https://jsonplaceholder.typicode.com/todos/", "POST", requestBody);
    }
}
