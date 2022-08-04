package easy;

import javax.swing.*;

public class Exercicio_10_easy_incremento {
    static double valorJuros, taxaJuros=(0.05), valorInvestimento, valorTotal;
    static int ano = 1;

    public static void main(String[] args) {

       valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor para investimento:"));

    while (ano <= 10) {
        valorJuros = (valorInvestimento *ano++ * taxaJuros );

        valorTotal = valorJuros + valorInvestimento;

        System.out.println("O valor investido é de R$:" + valorInvestimento + " \n o valor dos juros em 10 anos é "+ano+" de R$:" + valorJuros + "\n o valor total com juros será de R$:" + valorTotal);
    }
}
}
