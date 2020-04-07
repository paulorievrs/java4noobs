<h1>Continue e Break</h1>

O Continue e o Break é um complemento as estruturas de repetição, eles causam algumas peculiaridades nessas estruturas.

<h2> Break </h2>
O Break, como a tradução sugere, ele quebra e estrutura, se você incluir um break em qualquer parte da estrutura ele se encerra naquele momento e não executa o que está abaixo dela, independente da condição de parada. Por exemplo:

```java
public class UsandoBreak {
    public static void main(String args[]) {
        for(int i = 0; i < 10; i++) {

            System.out.println(i);

            if (i == 5) { //se o i chegar em 5, ele entra no if
                break; //quebra e sai da estrutura de repetição continuando o código.
            }
        }
    }
}
```

Teria que ficar assim:
<img src="../img/break.jpeg">

<h2>Continue</h2>

O comando continue é usado somente em laços de repetição. Quando ele é executado, o laço volta imediatamente para o teste de condição do laço de repetição.

```java
public class Continue {
        public static void main(String args[]) {
                for(int i = 0; i < 10; i ++) {

                    if(i == 5) {
                        continue;
                    }

                    System.out.println(i);
                }
        }
}
```

Teria que ficar assim:
<img src="../img/Continue.jpeg">
