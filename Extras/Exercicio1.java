import java.util.Scanner;

public class Exercicio1 {
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("BEM-VINDO A CALCULADORA!");

        System.out.println("Digite o primeiro valor: ");
        int num1 = leitor.nextInt();

        System.out.println("Digite o segundo valor: ");
        int num2 = leitor.nextInt();

        System.out.println("Digite soma para somar, subtracao para subtrair, divisao para dividir, multiplicacao, para multiplicar e mod para tirar o resto: ");
        String caso = leitor.next();
        int resultado = 0;


        switch (caso) {

            case "soma":
                resultado = num1 + num2;
                System.out.println("A soma é " + resultado );
            break;

            case "subtracao":
                resultado = num1 - num2;
                System.out.println("A subtracao é " + resultado );
            break;

            case "divisao":
                resultado = num1 / num2;
                System.out.println("A divisao é " + resultado );
            break;

            case "multiplicacao":
                resultado = num1 * num2;
                System.out.println("A multiplicação é " + resultado );
            break;

            case "mod":
                resultado = num1 % num2;
                System.out.println("O resto é " + resultado );
            break;

            default:
                System.out.println("Digite algo válido");

        }


    }
}