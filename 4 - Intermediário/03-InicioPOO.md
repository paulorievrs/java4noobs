<h1>Início de Programação Orientada a Objetos</h1>

Muitos recomendam iniciar programação orientada a objetos em Java, por ser considerada uma mãe da orientação a objetos. Esse é um novo conceito, iremos aprender sobre classes, criações de atributos e de construtores. Esse vai ser um tutorial meio grande, mas não se espante, a medida do uso você vai compreendendo, assim como tudo na programação.

Para ter uma programação orientada ao objeto é necessário de uma classe para engolobar atributos, construtores e metodos.

<h2>Atributos</h2>

Os atributos são basicamente as variáveis que a classe vai ter, por exemplo, uma classe pessoa tem: nome, idade, cpf, endereço.

Dá pensar nos atributos como informações que só a classe (e os objetos criados a partir dela) possui, então a classe também tem que definir se essas informações serão acessiveis pra todos ou somente para ela. Pra isso, na declaração da variavel de atributo, dá pra definir se a variavel vai ser pública (public) ou privada (private).

<h2>Construtores</h2>

Os construtores são para quando você instanciar um objeto da classe, como por exemplo, o objeto pessoa, ele já pode definir automaticamente alguns valores que você quiser dos atributos.

Só com o construtor padrão da classe, vai ser necessário informar os valores dos atributos depois da instanciação. Com um construtor mais definido, dá pra informar os atributos na hora que se cria um objeto da classe (e economiza tempo)

<h2>Métodos</h2>
Os métodos são as funções que a classe vai ter, como por exemplo a classe pessoa pode ter uma função de aumentar a sua idade a cada ano que passa, ou um metodo que altera seu endereço.

Essas funções, assim como os atributos, podem ser públicos para serem acessados por qualquer comando fora da instância da classe ou privados para classe. As métodos de uma classe não são diferentes dos definidos na [parte 12 do Módulo Basico](https://github.com/paulorievrs/java4noobs/blob/master/3%20-%20B%C3%A1sico/12-Funcoes-Metodos.md)

<h2>Encapsulamento</h2>
Todos os atributos de uma classe devem ser usados somente dentro dela, portanto, cria-se um encapsulamento privado ao declará-los, e são criadas funções chamadas de get e set, para pegar e alterar esses atributos.

[Próximo](./04-PrimeiraClasse.md) - Primeira classe