package medium;

import javax.swing.*;
import java.sql.SQLOutput;
import java.text.DecimalFormat;

public class exercicio_02_medium {

    static double valorInvestimento, taxaJuros = 0.05, totalAtualizadaJuros;

    static int i = 1, tempoInvestimento = 10;

    static DecimalFormat df = new DecimalFormat("##,###.##");

    public static void main (String[]args){

        valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser investido em R$"));

        totalAtualizadaJuros = valorInvestimento;

        while (i <= tempoInvestimento){
            totalAtualizadaJuros = (totalAtualizadaJuros*taxaJuros) + totalAtualizadaJuros;

            i++;
        }
        System.out.println("O valor investido é de R$"+ df.format(valorInvestimento));
        System.out.println("O valor do juros em 10 anos será de R$" + df.format(totalAtualizadaJuros-valorInvestimento));
        System.out.println("O valor total do investimento atualizado com taxa de juros após 10 anos será de R$"+ df.format(totalAtualizadaJuros));
                  }
    }
