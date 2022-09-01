package exemplosMetodos;

public class Exercicio01MetodosComRetorno {

    public static String primeiroMetodo(){
        String message = "Primeiro metodo";
        return message;
    }
    public static int segundoMetodo(){
        return 10;
    }

    public static boolean terceiroMetodo() {
        return true;
    }
    public static double quartoMetodo(){
        return 10.8;
    }
    public static String quintoMetodo(){
        String message = "Mais um exercicio aprendido!";
        return message;
    }


    public static void main (String[] args) {
        System.out.println(primeiroMetodo());
        System.out.println(segundoMetodo());
        System.out.println(terceiroMetodo());
        System.out.println(quartoMetodo());
        System.out.println(quintoMetodo());
    }
}
