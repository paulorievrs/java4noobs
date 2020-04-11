## Primeiro Programa
 
Para iniciar esse módulo é necessário que você tenha lido os anteriores. Para melhor expriência peço para que ao ler este módulo você realize tudo que eu fizer em seu próprio editor de texto.

## Criar arquivo

Em Java existem peculiaridades para seu programa funcionar direito, o arquivo pode ter qualquer nome, mas, a primeira letra dele deve ser maiúscula e ele deve conter a extensão '.java'. Irei apresentar um exemplo que irei seguir o resto desse tutorial, fique à vontade para copiar.

O nome do meu primeiro arquivo será:
> Hello.java

Ao criar esse arquivo, você deverá inicializar seu programa com uma Classe.

De acordo com Fábrica de Software do Senac, essa é a definição de classe.
>As classes de programação são receitas de um objeto, aonde têm características e comportamentos, permitindo assim armazenar propriedades e métodos dentro dela.

Então vamos começar construindo o código. Digite isso em seu arquivo:

```java
public class Hello {

}
```
O nome da classe deve ser exatamente do nome do seu arquivo. O *public* define que a classe é pública, portanto, qualquer um no código pode acessar ela, *class* siginifica que estamos criando uma classe e *Hello* é nome do seu arquivo.

Agora complete em seu arquivo:

>

```java
public class Hello {
    public static void main(String args[]) {

    }
}
```

O *public* também é para dizer que qualquer um pode acessar, o *static* são métodos da propria classe, *void* quer dizer que não retorna nada (explicarei melhor futuramente) e *main* quer dizer que é a classe principal, ela é a única função necessária para que o compilador identifique aonde irá iniciar o arquivo.

Continuando:

```java
public class Hello {
    public static void main(String args[]) {
        System.out.println("Hello World");
    }
}
```

O que foi adicionado se demonina função, em que exibe uma ou mais Strings. O *System.out* é um objeto para saída padrão, no nosso caso o monitor, mas, pode ser arquivos ou outros tipos de redirecionamento. o *println* é para falar que você quer "printar", ou seja, mostrar algo na tela que será passado como **parâmetro dentro dos parênteses** no nosso caso é ums *string* que escolhemos como "Hello World", que, é o que irá aparecer na tela.

#### Execução do arquivo

Para executar o arquivo é necessário que você abra o seu terminal (como ensinei na instalação do Java), siga até o diretório do seu arquivo e digite

> javac Hello.java

> java Hello

com isso irá aparecer em seu terminal:

<img src="https://i.imgur.com/X2hVyRa.png">


Obs: tooda linha em seu programa, ao seu fim, se não for uma estrutura de repetição ou outras exceções deve conter um ';' ao seu fim.