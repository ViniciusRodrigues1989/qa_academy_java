package medium;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;

public class exercicio_05_medium {
    static double primeiroNumero, segundoNumero, terceiroNumero, quartoNumero, quintoNumero, menorNumero;

    public static void main (String[]args) {
        primeiroNumero = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
        segundoNumero = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
        terceiroNumero = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro numero"));
        quartoNumero = Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto numero"));
        quintoNumero = Double.parseDouble(JOptionPane.showInputDialog("Digite o quinto numero"));

        if (primeiroNumero < segundoNumero && primeiroNumero < terceiroNumero && primeiroNumero < quartoNumero && primeiroNumero < quintoNumero) //{
 //           primeiroNumero = menorNumero;
   //     }
            System.out.println("O menor número digitado é:"+ primeiroNumero);
        if (primeiroNumero > segundoNumero && segundoNumero < terceiroNumero && segundoNumero < quartoNumero && segundoNumero < quintoNumero)//{
          //  segundoNumero = menorNumero;
   // }
            System.out.println("O menor número digitado é:"+ segundoNumero);
        if (primeiroNumero>terceiroNumero && segundoNumero > terceiroNumero && terceiroNumero < quartoNumero&& terceiroNumero<quintoNumero)// {
        //    terceiroNumero = menorNumero;
       // }
            System.out.println("O menor número digitado é:"+ terceiroNumero);
        if (primeiroNumero > quintoNumero && segundoNumero>quintoNumero && terceiroNumero>quartoNumero &&quartoNumero<quintoNumero)
            System.out.println("O menor número digitado é:"+ quartoNumero);
        else
        {
            System.out.println("O menor número digitado é:"+ quintoNumero);
    }
}
}