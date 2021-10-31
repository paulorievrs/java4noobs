# Listas imutaveis

Nem sempre queremos expor uma lista mutavel a quem utiliza a nossa classe, por exemplo:

```java

import java.util.List;
import java.util.LinkedList;

public class MinhaClasse {
	private final List<Integer> numeros = new LinkedList<>();

	public List<Integer> getNumeros() {
		return numeros;
	}
}
```

No código acima, temos um problema no encapsulamento dos atributos da nossa classe - "mas como assim? O atributo esta privado e temos um método acessor - nem sempre o atributo estar privado e ter um método acessor significa que o encapsulamento esta sendo aplicado de maneira correta, se realizarmos a seguinte ação:

```java

public class App {
	public static void main(String[] args) {
		MinhaClasse minhaClasse = new MinhaClasse();
		minhaClasse.getNumeros().add(1);
	}

}
``` 

Espera, alteramos a lista de maneira direta, e esta lista esta sendo acessada pelo método acessor.

# Como se proteger disto?

O java por padrão possui alguns métodos auxiliares, o modo mais facil de fazermos isso é utilizar o método [unmodifiableList](https://docs.oracle.com/javase/8/docs/api/?java/util/Collections.html) para nos protegermos deste tipo de ação, nossa classe ficaria desta maneira


```java

import java.util.Collections;
//snipet

public class MinhaClasse {
	private final List<Integer> numeros = new LinkedList<>();

	public List<Integer> getNumeros() {
		return Collections.unmodifiableList(numeros);
	}
}
```

E quando realizarmos a mesma operação que fizermos anteriormente

```java

public class App {
	public static void main(String[] args) {
		MinhaClasse minhaClasse = new MinhaClasse();
		minhaClasse.getNumeros().add(1); // aqui será lançado uma exceção do tipo UnsupportedOperationException
	}

}
``` 

### E agora se eu quiser adicionar um item nesta lista?

Simples, adiocionamos um método para isso


```java

//snipet
import java.util.Collections;

public class MinhaClasse {
	private final List<Integer> numeros = new LinkedList<>();

	public List<Integer> getNumeros() {
		return Collections.unmodifiableList(numeros);
	}

	public void adicionarNumero(int numero) {
		//regras para adição do numero
		numeros.add(numero);
	}
}
```
Agora temos o encapsulamento respeitado, ninguém consegue realizar operações nesta lista sem passar por nossas regras.

# Lista imutaveis por padrão

É possivel criar uma lista imutavel utilizando os métodos da ```Collections.unmodifiableList(lista)```, porém é meio verboso este tipo de método, precisamos da instancia da lista e depois passa-la como argumento, muito trabalho, então a partir de versões mais recentes do Java - acima da 8 - temos os métodos que facilitam este trabalho para nós, na interface ```List```, temos o método defaul ```of``` e também no Java 8 temos o método ```Arrays.asList(valores)```, que tem o funcionamento parecido, porém não tão intuitivo e ela também pode ser modificada - com algumas ressalvas - segue alguns exemplos:


### Arrays

```java
import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1, 2, 3);

		/*
			Esta lista é de tamanho fixo (3), ou seja, quando utilizarmos método para adicionar ou remover itens teremos a exceção UnsupportedOperationException.
			Porém esta lista pode ser modificada da seguinte maneira.

		*/
		lista.set(0, 30);

		/*
			Deste modo conseguimos realizar modificações na lista, porém sem alterar o seu tamanho de algum modo, este tipo de operações também aceita argumentos nulos como no exemplo a baixo
		*/

		List<String> outraLista = Arrays.asList("Java", "4", null);
		//["Java", "4", null]

	}
}
```

### List

```java
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Integer> lista = List.of(1, 2, 3);

		/*
			Mesmo caso do Arrays.asList, porém não conseguimos realizar nenhum tipo de alteração

		*/
		lista.set(0, 30); //UnsupportedOperationException


		/*
			List.of não aceita argumentos nulos, caso façamos isso temos uma NullPointerException
		*/
		List<String> outraLista = List.of("Java", "4", null); //NullPointerException

	}
}
```

[Próximo](./08-Listas-imutaveis.md) - Listas imutaveis