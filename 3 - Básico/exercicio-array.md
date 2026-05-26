# Exercício de Arrays em Java

## Enunciado

Crie um programa em Java que leia 10 números inteiros e armazene em um array.

Após isso, o programa deve exibir:
- O maior número digitado
- O menor número digitado
- A média dos valores

---

## Objetivo

Praticar o uso de arrays, estruturas de repetição e cálculos básicos em Java.

---

## Solução em Java

```java
import java.util.Scanner;

public class ExercicioArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();

            soma += numeros[i];

            if (numeros[i] > maior) {
                maior = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        double media = soma / 10.0;

        System.out.println("\nResultado:");
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Média: " + media);

        sc.close();
    }
}