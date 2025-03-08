# Lambda

As expressões lambda são uma maneira concisa de expressar funções que recebem parâmetros e retornam um valor. Elas são amplamente utilizadas para tornar o código mais enxuto e legível, eliminando a necessidade de classes anônimas em muitos casos.

A expressão é reconhecida principalmente pelo operador "->",  que pode ser utilizado de diversas formas:

```
parâmetro -> expressão

parâmetro -> { bloco de código }

(parâmetro1, parâmetro2) -> expressão
```

Existem diversas formas de utilizar lambda, desde projetos simples a arquiteturas mais complexas. A seguir, veremos alguns exemplos.

## Lambda com Interface

Uma interface em Java é um contrato que define métodos que uma classe deve implementar, sem fornecer a implementação deles. Vamos comparar a implementação tradicional com o uso de lambda em uma operação matemática.

```java
interface Operacao{
    int calcular(int a, int b);
}

public class LambdaApplication {
    public static void main(String[] args){

        // Sem utilizar Lambda
        Operacao soma = new Operacao() {

            @Override
            public int calcular(int a, int b) {
                return a + b;
            }
        };

        System.out.print(soma.calcular(5, 2));

        // Utilizando Lambda
        Operacao somaLambda = (a, b) -> a + b;
        System.out.print(soma.calcular(5, 2));
    }
}
```

## Lambda com Filter

O método filter, como o nome sugere, é utilizado para filtrar elementos dentro de uma coleção baseada em uma condição.

Abaixo, um exemplo onde filtramos palavras com mais de 7 caracteres em uma lista

```java
List<String> palavras = Arrays.asList("Paralelepipedo", "Sonho", "Casamento", "Gato", "Teclado");

// Sem Lambda
List<String> palavrasFiltradas = new ArrayList<>();

for(String palavra: palavras){
    if(palavra.length() > 7){
        palavrasFiltradas.add(palavra);
    }
}

System.out.println(palavrasFiltradas);

// Com Lambda
List<String> palavrasFiltradasLD =  palavras.stream()
                                            .filter(palavra -> palavra.length() > 5)
                                            .toList();
System.out.println(palavrasFiltradasLD);
```
