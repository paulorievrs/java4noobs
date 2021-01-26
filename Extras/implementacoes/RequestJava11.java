import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Objects;

public class RequestJava11 {

    public static void fazerRequisicao(String url) throws URISyntaxException, IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newHttpClient();
        //Cria um HttpClient que vai ser responsável por fazer a requisição
        HttpRequest requisicao = HttpRequest.newBuilder()
                .uri(new URI(url))
                .GET()
                .build();
        /*
        - Cria um HttpRequest que vai ser responsável por formular como a requisição será feita
        - Informa a URI, que o tipo do conteúdo que será enviado é um JSON e qual método será utilizado(nesse caso, o GET)
         */

        HttpResponse<String> resposta = httpClient.send(requisicao, HttpResponse.BodyHandlers.ofString());
        /*
        Inicia a requisição com as instruções do HttpRequest e
        informa que o corpo da resposta deve ser String(há outros).
        */
        imprimirResposta(resposta);
    }

    public static void fazerRequisicao(String url, String metodo, String corpoRequisicao) throws URISyntaxException, IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newHttpClient();
        //Cria um HttpClient que vai ser responsável por fazer a requisição
        HttpRequest requisicao = HttpRequest.newBuilder()
                .uri(new URI(url))
                .header("Content-Type", "application/json")
                .method(metodo, Objects.isNull(corpoRequisicao) ? HttpRequest.BodyPublishers.noBody() : HttpRequest.BodyPublishers.ofString(corpoRequisicao))
                .build();
        /*
        - Cria um HttpRequest que vai ser responsável por formular como a requisição será feita
        - Informa a URI, que o tipo do conteúdo que será enviado é um JSON e qual método será utilizado
        - Foi aplicado uma lógica que verifica quando um corpo deve ser enviado na requisição
        - O BodyPublisher é responsável transformar o dado informado para que possa ser interpretado na requisição.
        Os dados informados podem incluir: JSON(como String), arrays de Byte, arquivo e InputStream
         */

        HttpResponse<String> resposta = httpClient.send(requisicao, HttpResponse.BodyHandlers.ofString());
        /*
        Inicia a requisição com as instruções do HttpRequest e
        informa que o corpo da resposta deve ser String(há outros).
        */
        imprimirResposta(resposta);
    }

    public static void imprimirResposta(HttpResponse<String> resposta) {
        System.out.println("Código de resposta:");
        System.out.println(resposta.statusCode());
        System.out.println("Conteúdo da resposta:");
        System.out.println(resposta.body());
        System.out.println("Headers da resposta:");
        resposta.headers().map().forEach((headerKey, headerValue) -> System.out.println(headerKey + ": " + headerValue));
        //Expressão lambda para imprimir os campos do header
    }

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        fazerRequisicao("https://jsonplaceholder.typicode.com/todos/1"); // GET
        String corpoRequisicao = String.format("{" +
                "   \"title\":\"%s\"," +
                "   \"body\":\"%s\"," +
                "   \"userId\":\"%d\"" +
                "}", "titulo", "corpo", 999);
        /*
        Diferente do método anterior, aqui é necessário enviar um JSON como String
        Existem outras formas mais simples de converter objetos em JSON mas necessitaria utilizar alguma biblioteca
         */
        fazerRequisicao("https://jsonplaceholder.typicode.com/todos/", "POST", corpoRequisicao);
    }
}
