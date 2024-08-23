# Records

Os Records são uma nova forma de declarar classes no Java. Eles são imutáveis por padrão, o que significa que não podemos alterar seus valores após a criação do objeto. Além disso, eles são bastante úteis para representar dados, como, por exemplo, uma entidade de banco de dados. Esse tipo de classe foi introduzida oficialmente ao Java na versão 17, portanto, podemos utilizar em nossos programas.


## Exemplo de utilização

```java
// Essa classe não é um Record.
import java.util.Objects;

public class User {

    private String name;

    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return name.equals(user.name) && password.equals(user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

```

Observe que a classe possui Getters e Setters para acessá-la, construtor e métodos implementados, como o `toString`. No entanto, dependendo da utilização essas informações podem ser redundantes e gerar replicação de código desnecessária. Assim, surgiram os records.

## Mesma classe utilizando Records.

Observe como o código foi simplificado em apenas uma linha. Esse é o poder dessa classe, agora os métodos de acesso a classe não precisam ser criados manualmente, logo, serão instanciados de acordo com a necessidade do código.

```java
public record User(String name, String password){}
```

Vamos instanciar um objeto User.

```java
User user = new User("admin", "45454*aa");
```

Agora vamos acessar esses dados.

```java
String name = user.name();

String password = user.password();

```
## Conclusão

O recurso de Records no Java nos dá algumas vantagens, como, por exemplo:

- Sintaxe mais concisa: Records permitem definir classes de dados imutáveis de forma mais concisa, eliminando a necessidade de escrever o código repetitivo que normalmente é necessário para definir uma classe Java.

- Redução de código boilerplate: Como os Records fornecem métodos padrão, como `equals()`, `hashCode()` e `toString()`, eles reduzem a quantidade de código boilerplate necessário para definir uma classe Java.

- Imutabilidade: Como os Records são imutáveis por padrão, eles fornecem uma maneira mais segura e fácil de trabalhar com dados imutáveis.

- Mais fácil de ler e manter: A sintaxe simplificada do Records torna mais fácil de ler e manter o código, pois é mais fácil de entender a intenção do código.

- Melhor compatibilidade com APIs existentes: Os Records foram projetados para serem compatíveis com as APIs existentes, permitindo que os desenvolvedores usem
Records em conjunto com outras classes Java sem problemas.


Por outro lado, eles também possuem algumas desvantagens, como, por exemplo:

- Restrições na personalização de métodos: Por padrão, os Records fornecem métodos padrão, como `equals()`, `hashCode()` e `toString()`, que não podem ser personalizados. Embora seja possível fornecer uma implementação personalizada desses métodos, isso pode ser menos conveniente do que simplesmente estendê-los ou anulá-los em uma classe normal.

- Limitações na herança: Os Records não suportam herança de classe, o que significa que não é possível estender um Record em outra classe. Isso pode ser um problema se você precisar adicionar funcionalidade a uma classe Record existente.

- Maior complexidade em casos complexos: Em casos complexos, os Records podem se tornar mais difíceis de entender e manter do que as classes Java normais, devido a uma sintaxe mais compacta e a recursos específicos que podem ser difíceis de entender.

- Restrições de visibilidade: a visibilidade dos campos e métodos em um record é limitada. Todos os campos são automaticamente finais e privados, e os métodos são todos públicos.