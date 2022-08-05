package medium;

public class exercicio_03_medium {
    static int i = 0, soma;

    public static void main(String[] args) {

        while (i <= 1000) {
            soma = soma + i;
            System.out.println(soma);
            i++;
            if (soma >= 1500) {
                break;
            }
        }
    }
}