package easy;

import javax.swing.*;

public class execucao_exerc_easy {

   // static Exercicio_02_easy exer02Easy;

    public static void main(String[] args){

        int selecionaExercicio;
        selecionaExercicio = Integer.parseInt(JOptionPane.showInputDialog("Informe o exercicio a ser executado"));

        if(selecionaExercicio == 2){
            Exercicio_02_easy ex02_easy = new Exercicio_02_easy();
            //  String palavra = ex02_easy.retornaPalavra(("Vinicius Rodrigues")); OU
            String palavra = ex02_easy.retornaPalavra(JOptionPane.showInputDialog("Digite uma Palavra"));
            System.out.println(palavra);
        }

        if(selecionaExercicio == 3) {
            Exercicio_03_easy ex03_easy = new Exercicio_03_easy();
            String primeiroValor = "30";
            String segundoValor = "50";
            System.out.println(ex03_easy.retornaPrimeiroESegundoValor(primeiroValor,segundoValor));

        }
        if(selecionaExercicio == 4) {
            Exercicio_04_easy ex04_easy = new Exercicio_04_easy();
            int numeroDigitado = 12;   //Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
            //      int dobroCalculado = ex04_easy.retornaDobroNumero(numeroDigitado);
            // System.out.println("O dobro de" + numeroDigitado + "é: " + dobroCalculado - é a perfumaria de :ex04_easy.retornaDobroNumero(numeroDigitado));
            System.out.println("O dobro de " + numeroDigitado + " é: " + ex04_easy.retornaDobroNumero(numeroDigitado));

        }

        if(selecionaExercicio == 5 ){
            Exercicio_05_easy ex05_easy = new Exercicio_05_easy();
            int valor1 = 20;
            int valor2 = 15;
            int valor3 = 35;

            int soma = ex05_easy.somaResultado(valor1,valor2,valor3);
                    int subt = ex05_easy.subtResultado(valor1,valor2,valor3);
                            int mult = ex05_easy.multResultado(valor1,valor2,valor3);
                                    int media = ex05_easy.mediaResultado(soma);

            System.out.println("A soma dos valores é " + soma);
            System.out.println("A subtração dos valores é " + subt);
            System.out.println("A multiplicação dos valores é " + mult);
            System.out.println("A media dos valores é " + media);
        }
    }
}
