package exercicios;

public class Exercicio06 {

    public static int contarVogais(String str) {
        int count = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "Hello, world!";
        int vogais = contarVogais(str);
        System.out.println("String: " + str);
        System.out.println("Número de vogais: " + vogais);
    }
}