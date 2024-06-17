package exercicios;

public class Exercicio04 {

    public static double calcularMedia(double[] numeros) {
        if (numeros == null || numeros.length == 0) {
            throw new IllegalArgumentException("A lista de números não pode estar vazia ou nula.");
        }

        double soma = 0;
        for (double numero : numeros) {
            soma += numero;
        }

        double media = soma / numeros.length;
        return media;
    }

    public static void main(String[] args) {
        double[] lista1 = { 3.4, 5.1, 9.2, 1.5, 6.7 };
        double media1 = calcularMedia(lista1);
        System.out.println("Média da lista 1: " + media1);

        double[] lista2 = { 10.5, 8.0, 6.3 };
        double media2 = calcularMedia(lista2);
        System.out.println("Média da lista 2: " + media2);
    }
}