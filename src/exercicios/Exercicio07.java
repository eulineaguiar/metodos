package exercicios;

public class Exercicio07 {

    public static String isAnoBissexto(int ano) {
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            return "verdadeiro";
        } else {
            return "falso";
        }
    }

    public static void main(String[] args) {
        int ano = 2024;
        String bissexto = isAnoBissexto(ano);
        System.out.println("Ano: " + ano);
        System.out.println("É bissexto? " + bissexto);
    }
}