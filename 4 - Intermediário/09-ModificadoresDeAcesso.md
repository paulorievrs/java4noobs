# Modificadores de Acesso

Até o momento, você ja viu a utilização da palavra `public` em alguns lugares e deve estar se perguntando o que é isso. Essa palavra é um **modificador de acesso**. Modificadores de acesso são importantes pois eles garantem mais segurança para seu código, pois determinam a visiblidade e acessibilidade de membros de uma classe. Existem 3 modificadores de acesso no Java além do padrão:

- `public`: A classe, método ou atributo pode ser acessado em qualquer lugar.
- `private`: A classe, método ou atributo só pode ser acessado pela própria classe.
- `protected`: A classe, método ou atributo só pode ser acessado pela própria classe ou por classes que herdam dela.

Caso nenhum modificador de acesso seja utilizado, por padrão, a classe, método ou atributo só pode ser acessado por classes do mesmo pacote.

```java
public class ModificadoresAcesso {
    public String publico = "publico";
    private String privado = "privado";
    protected String protegido = "protegido";
    String padrao = "padrao";
}
```

[Próximo](./10-Collections-e-Stream.md) - Collections e Stream API