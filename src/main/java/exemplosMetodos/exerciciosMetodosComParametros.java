package exemplosMetodos;

import javax.swing.*;
import java.sql.SQLOutput;

public class exerciciosMetodosComParametros {

        public static void main(String[] args) {
            //5 Metodos com retorno
            System.out.println(exibirNomeEIdade(29, "Emerson"));
            System.out.println(retornarPalavra("Palmeiras", 90));
            System.out.println(exibirDobroNumero());
            System.out.println(retornarSalario(1500.50));

            //5 Metodos sem retorno
            exibirNomeEIdadeSemRetorno(29, "Emerson");
            exibirSalarioSemRetorno(5000.36);
            exibirNomeESobrenomeSemRetorno("Vinicius","Rodrigues");
        }

        //5 metodos com retorno
        public static String exibirNomeEIdade(int idade, String nome){
            return "Nome: " + nome + " Idade: " + idade;
        }

        public static String retornarPalavra(String palavra, int peso){
            return palavra + peso;

        }
        public static int exibirDobroNumero(){
          int numero= Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
            return numero*2;

        }

        public static double retornarSalario(double salario){
            return salario;
        }


        //5 metodos sem retorno
        public static void exibirNomeEIdadeSemRetorno(int idade, String nome){
            System.out.println("Nome: " + nome + " Idade: " + idade);

        }

        public static void exibirSalarioSemRetorno(double salario){
            System.out.println(salario);
        }

        public static void exibirNomeESobrenomeSemRetorno(String nome,String sobrenome){
            System.out.println("Nome " + nome + " Sobrenome " + sobrenome);
        }
    }

