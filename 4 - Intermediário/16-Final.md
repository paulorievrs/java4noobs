# Final

Utilizar o final no Java tem funções diferentes com base no contexto em que ela é utilizada, seja em classes, métodos ou variáveis, vamos aos contextos:

Em classes estamos indicando que a mesma não pode ser herdada, como no exemplo abaixo:

```java
// Não compila
public final class Funcionario {
    
}

public class Diretor extends Funcionario {
    
}
```
Isso garante que sua classe nunca seja utilizada como subclasse.

Já o final em métodos, indica que aquele método não pode ser sobrescrito, como no exemplo abaixo:

```java
// Não compila
public class Funcionario {
    public final void baterPonto() {
        //lógica
    }
}

public class Diretor extends Funcionario {
    @Override
    public void baterPonto() {
        //lógica
    }
}
```
Com isso garantimos que o comportamento daquele método nunca será mudado em outras subclasses daquela classe.

E por fim, em variáveis garante que com que o valor dessa variável nunca mude, seja essa variável um atributo, variável declarada em um escopo como um método ou um parâmetro, vamos aos exemplos:

```java
// Não compila
public class Funcionario {
    private final double salario = 3000.00;
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
```
No exemplo, o atributo salario não pode ser alterado, então o método setSalario não compila.

```java
// Não compila
public class Funcionario {
    private final double salario = 3000.00;
    
    public double calcularBonus(final double multiplicadorBonus) {
        multiplicadorBonus = 10000.00;
        return salario * multiplicadorBonus;
    }
}
```
No exemplo vamos ter erro de compilação porque estamos tentando alterar o valor do multiplicadorBonus.

E por último vamos ver uma variável de método:
```java
// Não compila
public class Funcionario {
    private final double salario = 3000.00;
    
    public double calcularBonus(final double multiplicadorBonus) {
        final double bonus = salario * multiplicadorBonus;
        bonus = 1000.00;
        return bonus;
    }
}
```
O exemplo anterior não retornar, porque estamos tentando alterar o valor do bônus que é imutável.

A vantagem de utilizar imutabilidade em atributos/variáveis/parâmentros é garantir previsibilidade no comportamento, o estado não muda, então se torna mais previsível com isso reduzindo a possibilidade de erros.

Além disso, pensando no contexto de trabalhar com threads, não existe a necessidade de sincronização pois é implicito que um valor imutável é thread-safe.