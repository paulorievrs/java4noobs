# Introdução

Os Text Blocks foram introduzidos no Java 15 após terem a sua preview no Java 13 e 14, porém essa feature só foi consolidada mesmo no Java 17\. Os Text Blocks trazem uma forma mais legível e prática de escrever Strings de múltiplas linhas, permitindo criar literais de texto sem precisar escapar caracteres especiais ou concatenar linhas com “+”.

Para criar um Text Block basta utilizar aspas triplas como no exemplo a seguir:

```java
String textBlock = “”Isso é um Text Block.  
Nele você consegue escrever múltiplas linhas.  
“””;
```

O Text Block elimina a necessidade de utilizar caracteres explícitos para a quebra de linha (\\n), ajudando a manter o código mais limpo e fácil de manter.

# Exemplos de códigos com e sem Text Block

Usando uma string tradicional

```java
String stringTradicional = “Isso é uma string tradicional\\n” +  
“ela possui múltiplas linhas\\n” +  
“e precisa de concatenação.”.
```

Usando Text Block

```java
String textBlock = “””  
Isso é um Text Block  
ele também possui múltiplas linhas,  
mas não é preciso usar concatenação.  
“””;
```

# Conclusão

Como pudemos ver, o Text Block torna o uso de Strings de múltiplas linhas muito mais simples, facilitando tanto a escrita quanto a leitura do código. 

# Recursos adicionais

Documentação oficial da Oracle
https://docs.oracle.com/en/java/javase/17/language/text-blocks.html

JEP 378: Text Blocks
https://openjdk.org/jeps/378
