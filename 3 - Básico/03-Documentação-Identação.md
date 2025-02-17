<h1> Documentação e indentação </h1>
A documentação é uma parte importante de um código pois cada pessoa tem uma maneira diferente de se programar, e quando outro programador ler seu código, ele irá entender mais facilmente o que está acontecendo. A indentação é uma parte importante deste processo, ela é a maneira como se dispõe seu código. Nenhuma delas é necessária para o código funcionar, mas é uma boa prática realizá-las.

<h2> Documentação </h2>
Para documentar ou comentar um código é bem simples, digita-se duas barras ( <b>//</b> ) para uma linha ou ( <b>/**/</b> ) para comentar múltiplas linhas. Abaixo contém um código de exemplo.



```java
public class Documentacao {
    public static void main(String args[]) {
        System.out.println("A soma de 2+2 é igual a 4");
        //Essa linha mostra no console a soma de 2+2.
        /* O programa 
        exibirá uma
        mensagem
        */
    }
}
```
Nenhuma linha que está a frente das duas barras ( <b>//</b> ) é interpretada pelo compilador, é somente vista pelo humano que está lendo seu código.

**Obs**.: O comentário de várias linhas é mais utilizado para documentar o que o método faz.

# Documentação com Javadoc

Javadoc é uma ferramenta que gera documentação HTML a partir de comentários no código-fonte Java. Esses comentários devem estar em blocos iniciados por `/**` e terminados por `*/`. A documentação gerada é muito útil para entender APIs e bibliotecas Java.


## Exemplo de Comentário Javadoc

```java
/**
 * A classe Calculadora realiza operações matemáticas básicas.
 */
public class Calculadora {

    /**
     * Soma dois números inteiros.
     *
     * @param a o primeiro número
     * @param b o segundo número
     * @return a soma de a e b
     */
    public int somar(int a, int b) {
        return a + b;
    }
}
```

## Tags Comuns do Javadoc

- `@param` - Descreve um parâmetro do método.
- `@return` - Descreve o valor de retorno do método.
- `@throws` - Descreve as exceções que o método pode lançar.
- `@see` - Adiciona uma referência a outra classe ou método.
- `@deprecated` - Marca o método ou classe como obsoleto.

## Gerando a Documentação

Para gerar a documentação, use o comando `javadoc` no terminal:

```sh
javadoc -d docs src/com/exemplo/Calculadora.java
```

Este comando cria a documentação HTML no diretório especificado (`docs`).

Para mais detalhes, consulte a [documentação oficial do Javadoc](https://docs.oracle.com/javase/8/docs/technotes/tools/windows/javadoc.html).


<h2> Indentação </h2>
Para manter uma boa leitura do código é necessário uma indentação, que ao longo de suas práticas vai se tornando mais fácil de se utilizar. Para você perceber a diferença entre um código indentado ou não, vai abaixo os dois exemplos.

Código não indentado:
```java
public class Indentacao1{
public static void main(String args[]){
System.out.println("Olá");
System.out.println("Olá");
System.out.println("Olá");
}
}
```
A medida em que o código cresce, fica difícil de se enxergar o que está acontecendo, uma coisa fica embolada na outra.

Código indentado:
```java
public class Indentacao2 {
    public static void main(String args[]) {
        System.out.println("Olá");
        System.out.println("Olá");
        System.out.println("Olá");
    }
}
```
Aos olhos humanos fica mais fácil de se entender e enxergar. Para o compilador em alguns casos não irá fazer diferença, mas até para você que está programando fica melhor de se organizar.

[Próximo](./04-Variaveis.md) - Variáveis
