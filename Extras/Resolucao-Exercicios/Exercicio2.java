public class Exercicio2 {
    public static double calculaMediaDeIdades(int[] idadeAlunos) {

        int acumulador = 0;
        for(int i = 0; i < idadeAlunos.length; i++) {
            acumulador += idadeAlunos[i];
        }

        return acumulador/idadeAlunos.length;

    }

    public static int quantidadeDeAlunosComIdadeAcimaDaMedia(int[] idadeAlunos, double media) {
        int cont = 0;
        for(int i = 0; i < idadeAlunos.length; i++) {
            if(idadeAlunos[i] > media) {
                cont++;
            }
        }

        return cont;
    }


    public static void main(String args[]) {
        int[] idadeAlunos = {11, 12, 13, 15, 11, 14};
        double media = calculaMediaDeIdades(idadeAlunos);
        int quantidadeDeAlunosComIdadeAcimaDaMedia = quantidadeDeAlunosComIdadeAcimaDaMedia(idadeAlunos, media);

        System.out.println("A media de idade dos alunos é " + media + " e a turma tem " + quantidadeDeAlunosComIdadeAcimaDaMedia + " alunos acima da media");


    }
}