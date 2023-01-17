# <center>Sets</center>

Anteriormente vimos uma das Collections que implementam a interface [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html), porém List, não é a única coleção existente no Java, neste tópico iremos falar da Collection [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html), esta coleção tem uma peculiaridade em relação a listas comuns, ela não armazena valores repetidos, porém assim como List, o Set também é uma interface genérica.

Temos algumas implementações para esta `interface`, porém iremos falar das seguintes implementações:

- [HashSet](https://docs.oracle.com/javase/8/docs/api/java/util/HashSet.html)
    - Esta implementação é a mais rápida dentre elas, ela armazena os valores em uma [Hash Table](https://en.wikipedia.org/wiki/Hash_table#:~:text=In%20computing%2C%20a%20hash%20table,desired%20value%20can%20be%20found.), esta implementação não garante a ordem dos elementos adicionados nela.
- [LinkedHashSet](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashSet.html)
    - Esta implementação é parecida com a do `HashSet` porém por trás dos panos ela utiliza uma [LinkedList](./07-LinkedList-vs-ArrayList.md) em sua implementação ao invés de um [HashMap](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/HashMap.html) que sera explicado nos próximos capítulos.
- [TreeSet](https://docs.oracle.com/javase/8/docs/api/java/util/TreeSet.html)
    - Esta implementação utiliza uma [Red Black Tree](https://en.wikipedia.org/wiki/Red%E2%80%93black_tree), esta implementação garante a ordem dos elementos que forem inseridos no Set.

Cada implementação tem sua peculiaridade, mais uso de memoria porém mais rápida inserção, menos uso de memoria e mais rápida na busca, todas as implementações tem pontos fracos e fortes dependendo do tipo de algoritmo e estrutura de dados utilizada.

## <center>Trabalhando com o Set</center>

Iremos realizar as demonstrações utilizando o `HashSet`, porém o modo de trabalho das outras duas implementações mencionadas neste capitulo.

### <center> HashSet e LinkedHashSet</center>

O calculo do [Hash](https://en.wikipedia.org/wiki/Hash_function) determina a posição do elemento na HashTable, por isso não temos a ordenação garantida. Para que um HashSet do tipo escolhido funcione de maneira adequada, precisamos implementar o método `hashCode` para o Objeto, muitas classes do Java já tem essa implementação por padrão `Integer`, `Long`, `String`, `Character`... Porém também podemos fazer isso para a nossa própria classe, claro não iremos fazer isso na mão aqui, iremos utilizar alguma IDE para facilitar a nossa vida, mas não agora, iremos seguir utilizando as classes que o JDK nos fornece.

Instanciando um HashSet:

```java
public class App {
    public static void main(String[] args) {
        Set<Integer> intSet = new HashSet<>();
    }
}
```

A instanciação do HashSet é simples, basicamente temos o padrão `Set<Tipo> nome = new HashSet<>();` com isso já temos a instancia para trabalharmos.

Para adicionarmos itens no nosso Set utilizamos o método `add`, este método irá nos retornar `true` caso consiga inserir o item, e `false` quando não conseguir, pois o item já existe no Set.

```java
public class App {
    public static void main(String[] args) {
        Set<Integer> intSet = new HashSet<>();
        intSet.add(10);
        intSet.add(20);
        if(intSet.add(10)) {
            System.out.println("O numero '10' já existe");
        }
    }
}
```
Para removermos um item é muito parecido, utilizamos o método `remove` para realizar esta ação, caso consiga remover o item irá nos retornar `true`, e `false` quando não conseguir, que acontece caso o item não exista no Set.

```java
public class App {
    public static void main(String[] args) {
        Set<Integer> intSet = new HashSet<>();
        intSet.add(10)
        intSet.add(20);
        if(intSet.remove(10)) {
            System.out.println("O numero existe no Set e foi removido");
        }
    }
}
```

Podemos limpar um Set inteiro com o método `clear`, ou ter o seu tamanho com o `size`, saber se esta vázio com o `isEmpty`, métodos muito parecidos com o das listas já estudadas.

```java
public class App {
    public static void main(String[] args) {
        Set<Integer> intSet = new HashSet<>();
        intSet.add(10)
        intSet.add(20);
        if (intSet.isEmpty()) {
            System.out.println("Esta vazio!");
        } else {
            System.out.println("Não esta vazio!");
        }
        intSet.clear();
        System.out.println("O tamanho do Set é: " + intSet.size());
    }
}
```

### <center> TreeSet</center>

O modo de trabalho com o TreeSet é praticamente o mesmo dos já mostrados aqui, com a grande diferença desta implementação utilizar o método [compareTo](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Comparable.html) ou [compare](https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html) ou invés do `hashCode` para realizar as inserções, remoções e contais, não iremos discutir a implementação destes métodos, pois não é o foco deste cápitulo, a utilização destes métodos é para garantir a integridade da arvore por trás de sua implementação.

### Imutabilidade

Assim como já discutido no [capítulo anterior](./08-Listas-imutaveis.md) os Set's também tem suas versões imutáveis, sendo elas utilizando o `Collections.unmodifiableSet` ou `Set.of`, este método em especifico acima da versão 8, o comportamento é parecido com o das listas imutáveis, porém com as peculiaridades do Set.

[Próximo](./11-Map.md) - Map
