import javax.swing.*;

public class Exercicio_05_easy {
        public static void main(String[] args) {
                int valorDigitado1, valorDigitado2, valorDigitado3, soma, subtracao, multiplicacao, media;
                valorDigitado1 = Integer.parseInt(JOptionPane.showInputDialog("Digite primeiro valor"));
                valorDigitado2 = Integer.parseInt(JOptionPane.showInputDialog("Digite segundo valor"));
                valorDigitado3 = Integer.parseInt(JOptionPane.showInputDialog("Digite terceiro valor"));
                soma = valorDigitado1 + (valorDigitado2 + valorDigitado3);
                subtracao = valorDigitado1 - valorDigitado2 - valorDigitado3;
                multiplicacao = (valorDigitado1 * valorDigitado2) * valorDigitado3;
                media = soma / 3;
                System.out.println("O resultado da soma é:" + soma + " \n o da subtração é:" + subtracao + "\n o da multiplicação é:" + multiplicacao + "\no resultado da media é:"+ media);
        }
}


       // Declarar variável do tipo inteiro: valorInformado1, valorInformado2, valorInformado3; soma; subtracao, multiplicacao, divisaoMedia;
       // valorInformado1= Ler (5);
        //valorInformado2= Ler (3);
        //valorInformado3= Ler (8);
        //soma = valorInformado1 + (valorInformado2 + valorInformado3);
        //subtracao = (valorInformado3 – valorInformado2) – valorInformado1;
        //multiplicacao = (valorInformado1 * valorInformado2) * valorInformado3;
        //divisaoMedia = soma / 3;
        //Exibir: “Valores: ” + soma + subtração + multiplicacao + divisaoMedia;
        //˜Valores : 16, 0, 120, 5˜
