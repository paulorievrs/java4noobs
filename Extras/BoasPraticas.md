# Boas práticas de programação

Aqui está um mini compilado sobre como ter boas práticas de programação.  
Se você iniciou no curso por aqui, peço por gentileza que siga a ordem das pastas, pois não irá fazer muito sentido. Isso é para o fim do curso.

Durante o curso, são ensinadas aos poucos as boas práticas básicas de programação.  
Abaixo está um compilado como referência para você se lembrar.

## Indentação e documentação
Utilize indentação consistente (2 ou 4 espaços) para facilitar a leitura do código.  
Comente apenas quando necessário, explicando o motivo da implementação e não o óbvio.  
Evite comentários desatualizados ou redundantes.

## Nomes de classes
Classes devem representar substantivos e possuir responsabilidade única.  
Use nomes claros e objetivos que representem o papel da classe no sistema.

**Padrão**
- PascalCase
- Primeira letra maiúscula
- Sem verbos

```java
public class ClienteService { }
public class Produto { }
public class PedidoController { }
```
## Nomes de métodos
Métodos devem representar ações executadas pela classe.
Use verbos no início do nome para indicar claramente o comportamento.

**Padrão**

- camelCase
- Começa com verbo
  
```java
public void calcularTotal();
public Cliente buscarClientePorId(int id);
public boolean validarSenha(String senha);
```
## Nomes de variáveis
Variáveis devem indicar claramente o valor que armazenam.
Evite abreviações genéricas ou sem significado.

**Padrão**

- camelCase
- Substantivos
- Contexto claro

```java
int quantidadeProdutos;
String nomeCliente;
boolean usuarioAtivo;
```
## Nomes de constantes
Constantes representam valores fixos que não devem ser alterados.
Devem ser declaradas como static final.

**Padrão**

- UPPER_SNAKE_CASE
- Palavras separadas por "_"

```java
public static final int TAMANHO_MAXIMO = 100;
public static final String URL_API = "https://api.exemplo.com";
```

## Estruturas de repetição

Utilize i, j e k apenas em laços simples.
Em estruturas mais complexas, utilize nomes descritivos para melhorar a legibilidade.

```java
for (int i = 0; i < 10; i++) { }
for (int indiceProduto = 0; indiceProduto < produtos.lenght(); indiceProduto++) { }
```

## Responsabilidade única

Cada classe, método ou função deve ter apenas uma responsabilidade.
Isso facilita manutenção, testes e reutilização do código.

## Evite código duplicado

Código repetido deve ser extraído para métodos ou funções reutilizáveis.
Princípio DRY: Don't Repeat Yourself.

## Tratamento de erros

Nunca ignore erros ou exceções.
Utilize try/catch corretamente e forneça mensagens claras para facilitar a identificação de problemas.

## Evite valores mágicos

Não utilize números ou strings sem significado direto no código.
Prefira constantes com nomes claros.

```java
if (status == 3) //evitar

if (status == STATUS_APROVADO) //boa prática
``` 

## Código legível é mais importante que código curto

Priorize clareza e legibilidade ao invés de reduzir linhas de código.
Código é lido muito mais vezes do que escrito.