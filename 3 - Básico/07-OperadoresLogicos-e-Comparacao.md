<h1> Operadores Lógicos e de Comparação </h1>
Ambos os operadores são utilizados na maioria em estruturas de condição, que vamos ver agora. Os exemplos de código estarão nesse módulo para fazer mais sentido.

<h2> Operadores Lógicos </h2>

>Imagem retirada do <a href="https://github.com/hellowluan/java-basico" target="_blank"> repositório do hellowluan.

<img src="../img/OperadoresLogicos.png"> </a>

Se você conhece algum tipo de lógica de programação, já entendeu como eles funcionam, mas para esclarecer entraremos em mais detalhes.

```java
public class OperadoresLogicos {
    public static void main(String args[]) {

        // Exemplo da funcionalidade do operador lógico "&&" (AND)
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && false); // false

        // Exemplo da funcionalidade do operador lógico "||" (OR)
        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || false); // false

        // Exemplo da funcionalidade do operador lógico "!" (NOT)
        System.out.println(!true); // false
        System.out.println(!false); // true
    }
}
```

<h2> Operadores de Comparação </h2>

>Imagem retirada do <a href="https://github.com/hellowluan/
java-basico" target="_blank"> repositório do hellowluan.

<img src="../img/OperadoresComparacao.png"> </a>

Esses Operadores são como na matemática, e na programação é possível comparar valores também, e é onde os operadores lógicos entram nessa brincadeira.

[Próximo](./08-EstruturasCondicionais.md) Estrutuas condicionais