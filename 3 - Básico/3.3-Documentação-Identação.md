<h1>Documentação e Identação</h1>
A documentação é uma parte importante de um código pois cada pessoa tem uma maneira diferente de se programar, e quando outro programador for ler seu código ele irá entender mais facilmente o que tá acontecendo. A identação é uma parte importante desse processo, ela é a maneira como se dispõe seu código. Nenhuma delas é necessária para o código funcionar, mas é extreamente uma boa prática realiza-las.

<h2>Documentação</h2>
Para documentar um código é bem simples, digita-se duas barras ( **//** ) e a documentação em frente. Abaixo contém um código de exemplo.

```java
public class Documentacao {
    public static void main(String args[]) {
        System.out.println("A soma de 2+2 é igual a 5"); //Essa linha mostra no console a soma de 2+2.
    }
}
```
Nenhuma linha que está a frente das duas barras ( **//** ) é interpretada pelo compilador, é somente vista pelo humano que está lendo seu código.

<h2>Identação</h2>
Para manter-se uma boa leitura do código é necessário uma identação que ao longo de suas práticas vai se tornando mais fácil de se utilizar. Para você perceber a diferença entre um código identado ou não vai abaixo os dois exemplos.

Código não identado:
```java
public class Identacao1{
public static void main(String args[]){
System.out.println("Olá");
System.out.println("Olá");
System.out.println("Olá");
}
}
```
A medida em que o código cresce fica difícil de se enxergar o que está acontecendo, uma coisa fica embolada na outra.

Código identado:
```java
public class Identacao2 {
    public static void main(String args[]) {
        System.out.println("Olá");
        System.out.println("Olá");
        System.out.println("Olá");
    }
}
```
Aos olhos humanos fica mais fácil de se entender e enxergar. Para o compilador em alguns casos não irá fazer diferença, mas até para você que está programando fica melhor de se organizar.