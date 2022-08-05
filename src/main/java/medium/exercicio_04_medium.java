package medium;

public class exercicio_04_medium {

    static int i = 1, multiplicacao = 1;

    public static void main(String[] args) {

        while (i <= 1000) {
            multiplicacao = multiplicacao * i;
            System.out.println(multiplicacao);

            if (multiplicacao >= 1000) {
                multiplicacao = 1;
                System.out.println(multiplicacao);
            }
            i++;
        }
    }
}
