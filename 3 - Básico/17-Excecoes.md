<h1>Exceções</h1>
Geralmente ao construir um programa são gerados alguns erros, mas é possível fazer com que sejam ignorados esses erros caso seja o propósito do seu programa.

Normalmente não se utiliza exceções no código todo pois isso não nós mostra os erros devidos, mas há alguns casos que há a necessidade delas.

As execções tem três blocos, sendo dois deles obrigatórios. O **try**, **catch** e o **finally**. Os dois primeiros são obrigratórios.

<h2>Construção das Execeções</h2>

>Exemplo modificado do site <a href="https://www.devmedia.com.br/tratando-excecoes-em-java/25514">DevMedia</a>
```java
public class Excecoes {
    public static void main(String args[]) {
        String frase = null;
        String novaFrase = null;

        try {
            novaFrase = frase.toUpperCase();

        } catch(Exception e) { //CAPTURA DA POSSÍVEL exceção. 
            //TRATAMENTO DA exceção
            System.out.println("O frase inicial está nula, 
            para solucional tal o problema, foi lhe atribuito um valor default.");
            frase = "Frase vazia";
            novaFrase = frase.toUpperCase();
        } finally {
            System.out.println("Frase antiga: "+frase);
            System.out.println("Frase nova: "+novaFrase);

        }

        
    }
}
```
O bloco try se inicia para tentar fazer o que está dentro dele, se der errado, terá um catch que pegará uma exceção, nesse caso eu generalizei mas você pode especificar elas. Quando cai dentro do catch, ele realiza o que ta lá dentro. Podem existis vários blocos de catch, assim como os elseif, vão sendo procuradas exceções para serem pegas, ao fim de tudo se realiza o bloco finally.