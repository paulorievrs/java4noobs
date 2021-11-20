# <center> Map </center>

A última coleção que iremos falar é o [Map](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Map.html), é uma coleção baseada em `chave` e `valor`. No capítulo sobre os [Sets](./09-Sets.md) uma das implementações de Map foi mencionada, sendo ela o [HashMap](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/HashMap.html), neste capítulo iremos falar sobre três implementações de Map, assim como fizemos com os `Sets`, sendo elas:

- [HashMap](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/HashMap.html).
    -  Uma implementação baseada em [HashTable](https://en.wikibooks.org/wiki/Data_Structures/Hash_Tables).
- [LinkedHashMap](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/LinkedHashMap.html).
    - Uma implementação que se utiliza uma `HashTable` e [Linked List](07-LinkedList-vs-ArrayList.md).
- [TreeMap](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/TreeMap.html).
    - Uma implementação baseada em [Red Black Tree](https://en.wikipedia.org/wiki/Red%E2%80%93black_tree), necessario a implementação da interface [Comparator](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Comparator.html), ela mantém a ordenação de acordo com a estrutura de árvore. Temos um exemplo de implementação [aqui](../Extras/implementacoes/ClasseComparator.java).

Todas as implementações têm usos parecidos, por este motivo iremos demonstrar com apenas uma de suas implementações. Claro todas tem as suas ressalvas, tem prós e contras, vem do desenvolvedor saber o local correto de sua utilização.

## <center>Trabalhando com o Map</center>

Para criarmos as instâncias de Map seguimos o seguinte padrão: `Map<Chave, Valor> nome = new Implementacao<>()`:

```java
public class App {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        Map<String, String> treeMap = new TreeMap<>();
    }
}
```

Diferentes das listas e sets não temos o método add, para adicionarmos itens em um `Map` utilizamos o método [put](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Map.html#put(K,V)).

```java
public class App {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("chave", "valor");
    }
}
```

Caso o valor já exista no `Map` ele é substituído pelo novo valor:

```java
public class App {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("chave", "valor");
        map.put("chave", "novo valor");
    }
}
```

Para remover algum ‘item’ do `Map` temos o método [remove](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Map.html#remove(java.lang.Object)) onde temos uma sobrecarga bem interessante onde só é feita a remoção da chave caso o valor seja igual ao passado.

```java
public class App {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("chave", "valor");
        map.put("chave2", "valor2");
        map.remove("chave"); //remoção da chave com sucesso
        map.remove("chave2", "papagaio"); //não acontece a remoção da chave 2
    }
}
```

Também podemos recuperar o valor de uma chave em um `Map` utilizando o método [get](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Map.html#get(java.lang.Object)) ou se quisermos saber se a chave existe antes de buscar, utilizamos o método [containsKey](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Map.html#containsKey(java.lang.Object)), caso o valor não exista o método `get` ira retornar o valor `null`, e o método `containsKey` ira retornar false.

```java
public class App {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("chave", "valor");
        map.put("chave2", "valor2");
        String valorChave = map.get("chave"); //valor
        String chaveInexistente = map.get("aurora"); //null

        if (map.containsKey("chave2")) {
            String valorChave2 = map.get("chave2");
        } else {
            //qualquer outro tratamento
        }
    }
}
```

Podemos também iterar um `Map` através de um [Set](./09-Sets.md) de chaves utilizando o método [keySet](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Map.html#keySet()), onde nos é retornado um `Set` com todas as chaves inseridas neste `Map`.

```java
public class App {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("chave", "valor");
        map.put("chave2", "valor2");
        Set<String> chaves = map.keySet();
        for(String chave: chaves) {
            System.out.println("Chave: " + chave + ", valor: " + map.get(chave));
        }
    }
}
```

Também podemos percorrer os valores de um `Map` com o método [values](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Map.html#values()), este método nos retorna uma [Collection](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Collection.html) contendo os valores

```java
public class App {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("chave", "valor");
        map.put("chave2", "valor2");
        Collection<String> valores = map.values();
        for(String valor: valores) {
            System.out.println("Valor: " + valor);
        }
    }
}
```

Temos outros métodos como [isEmpty](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Map.html#isEmpty()), [clear](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Map.html#clear()), [size](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Map.html#size()), que tem o mesmo comportamento das outras coleções já apresentadas.

### <center>Imutabilidade</center>

Assim como já discutido no [capítulo de Listas imutáveis](./08-Listas-imutaveis.md) os Map's também tem suas versões imutáveis, sendo elas utilizando o `Collections.unmodifiableMap` onde não permite o uso do método `put` ou [replace](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Map.html#replace(K,V)) ou `Map.of`, este método em específico acima da versão 8, o comportamento é parecido com o das listas imutáveis, porém com o modo de uso um pouco diferente.

```java
public class App {
    public static void main(String[] args) {
        Map<String, String> mapImutavel = Map.of(
            "chave1", "valor1",
            "chave2", "valor2",
            "chave3", "valor3"
            //.......
        );
    }
}
```