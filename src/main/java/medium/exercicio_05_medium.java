package medium;

import javax.swing.*;

public class exercicio_05_medium {
    static int numeroDigitado, menorNumero,i = 1;
    public static void main (String[]args){
while (i <= 5){
    numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digíte o" + i + "número"));

        if (numeroDigitado < menorNumero || i == 1) ;
        menorNumero = numeroDigitado;
}
i++;

   System.out.println(" O numero:" + menorNumero + "é o menor numero");

             }
}

