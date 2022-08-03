import javax.swing.*;

public class Exercicio_06_easy {
    public static void main(String[] args) {

     double primeiraNota, segundaNota, mediaNotas;
        primeiraNota = Double.parseDouble(JOptionPane.showInputDialog("Digite Primeira Nota:"));
        segundaNota = Double.parseDouble(JOptionPane.showInputDialog("Digite Segunda Nota"));
        mediaNotas = (primeiraNota + segundaNota) / 2;

      if(mediaNotas > 5) {
          System.out.println("O aluno está APROVADO");
        }

        if(mediaNotas < 5) {
            System.out.println("O aluno está REPROVADO");
        }

        if (mediaNotas == 5){
            System.out.println("O aluno está de EXAME");
        }
    }
}


//Inicio do algoritmo

  //      Declarar variável do tipo inteiro: primeiraNota, segundaNota, mediaNotas;
    //    primeiraNota = Ler(4);
      //  segundaNota = Ler(5);
        //mediaNotas = (primeiraNota+segundaNota) / 2;
        //SE (mediaNotas > 5)
        //Ler: "Aprovado!";
        //FIM SE
        //SE (mediaNotas < 5)
        //Ler: "Reprovado!";
        //FIM SE
        //SE NÃO (mediaNotas = 5)
        //Ler: "Ficou para exame!";

        //Fim do algoritmo
