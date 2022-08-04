package medium;

import javax.swing.*;

public class exercicio_01_medium {
    static int i = 0;

    public static void main(String[] args) {

        while (i <= 100) {
            if (i % 2 == 0) {

                System.out.println("O numero " + i + " é par");

            } else {
                System.out.println("O numero " + i + " é impar");

            }
            i++;
        }
    }
}