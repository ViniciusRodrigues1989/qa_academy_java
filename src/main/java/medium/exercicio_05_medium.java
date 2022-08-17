package medium;

import javax.swing.*;

public class exercicio_05_medium {

    static int numeroDigitado,menorNumero,i=1;

    public static void main(String[] args) {

        
        while (i <=5){
            numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
            if (numeroDigitado<menorNumero || i==1){

               menorNumero=numeroDigitado;
            }
        i++;
            }
        System.out.println("O menor numero digitado é:" + menorNumero);
    }
}
