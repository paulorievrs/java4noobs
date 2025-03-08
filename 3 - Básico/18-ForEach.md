# ForEach

O forEach é uma estrutura de iteração semelhante ao for, mas com a diferença de não utilizar um índice, o que facilita sua aplicação em casos onde o índice não é necessário.

Além disso, o forEach é comumente utilizado por sua simplicidade e legibilidade, tornando o código mais enxuto e fácil de entender.

## Diferença entre For e ForEach

Vejamos dois exemplo da diferença entre os dois, iterando a mesma lista de nomes.

Utilizando For:
```java
String[] names = {"Ântonio", "Carla", "Juliana", "Miguel"};

for(int i = 0; i < names.length; i++){
    System.out.println(names[i]);
}
```

Utilizando ForEach:
```java
String[] names = {"Ântonio", "Carla", "Juliana", "Miguel"};

for(String i : names) { 
    System.out.println(i); 
}
```

## Quando utilizar For ou ForEach?

* O for permite executar um bloco de código diversas vezes e dá acesso ao índice de cada elemento do array. Isso é útil em casos onde é necessário modificar valores com base no índice ou acessar posições específicas.

* O forEach é ideal para percorrer elementos de arrays ou coleções de forma simples, sem necessidade de acessar os índices.
