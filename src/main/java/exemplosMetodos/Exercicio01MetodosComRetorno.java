package exemplosMetodos;

public class Exercicio01MetodosComRetorno {

    public static String primeiroMetodo(){
        String message = "Primeiro metodo";
        return message;
    }
    public static int segundoMetodo(){
        return 10;
    }
    public static boolean terceiroMetodo(){
        return false;
    }
    public static double quartoMetodo(){
        return 5.5;
    }
    public static boolean quintoMetodo(){
        return false;
    }

    public static void main (String[] args) {
        System.out.println(primeiroMetodo());
        System.out.println(segundoMetodo());
        System.out.println(terceiroMetodo());
        System.out.println(quartoMetodo());
        System.out.println(quintoMetodo());
    }
}