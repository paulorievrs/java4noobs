<h1>Requisições HTTP</h1>

HTTP é um protocolo utilizado para realizar a troca de informações entre cliente e servidor, essas informações podem ser um JSON, página web, arquivos, etc. É como se você enviasse uma mensagem para alguém e ela respondesse de volta.

Um exemplo simples seria a forma que você acessou esse repositório:
- Utilizou o navegador para acessar a página que se encontra no repositório;
- O navegador(cliente) fez a **requisição** para o servidor do GitHub;
- O servidor **responde** a requisição com .html, imagens, .css e outras informações necessárias para exibir a página.

Com isso, diversas linguagens de programação possuem métodos para fazer essas requisições. Em Java não seria diferente, podemos fazer essas requisições usando as classes nativas **HttpURLConnection** e **HttpClient**(11+).

<h2>Exemplos</h2>

Link da [documentação](https://docs.oracle.com/javase/8/docs/api/java/net/HttpURLConnection.html)

>[RequestJava.java]((/Extras/implementacoes/RequestJava.java))
```java
public static void fazerRequisicao(String urlPath) throws IOException {
    URL url = new URL(urlPath);
    //Instancia um objeto URL e insere a URL
    HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
    //Cria uma variável HttpURLConnection que será responsável por fazer a requisição HTTP
    conexao.setRequestMethod("GET"); //Seleciona qual o tipo do método a ser utilizado
    
    conexao.connect(); //Inicia a requisição
    imprimirResposta(conexao); //Função para imprimir a resposta da requisição
}
```

<h2>Java 11+</h2>

Embora as implementações sejam semelhantes, a API do HttpClient é moderna e muito mais completa que o exemplo apresenta.
Link da [documentação](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpClient.html) e exemplos e usos do OpenJDK ([1](https://openjdk.java.net/groups/net/httpclient/intro.html), [2](https://openjdk.java.net/groups/net/httpclient/recipes.html)) 

>[RequestJava11.java](/Extras/implementacoes/RequestJava11.java)
```java
public static void fazerRequisicao(String url) throws URISyntaxException, IOException, InterruptedException {
    HttpClient httpClient = HttpClient.newHttpClient();
    //Cria um HttpClient que vai ser responsável por fazer a requisição
    HttpRequest requisicao = HttpRequest.newBuilder()
            .uri(new URI(url))
            .GET()
            .build();
    /*
    - Cria um HttpRequest que vai ser responsável por formular como a requisição será feita
    - Informa a URI e qual método será utilizado(nesse caso, o GET)
    */

    HttpResponse<String> resposta = httpClient.send(requisicao, HttpResponse.BodyHandlers.ofString());
    /*
    Inicia a requisição com as instruções do HttpRequest e
    informa que o corpo da resposta deve ser String(há outros).
    */
    imprimirResposta(resposta);
}
```

<h2>Observações</h2>

Os códigos completos das implementações podem ser encontrados [aqui](/Extras/implementacoes/).