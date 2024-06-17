package exercicios;

public class Exercicio10 {

    public static double calcularMediaPonderada(double valor1, double peso1, 
                                                double valor2, double peso2, 
                                                double valor3, double peso3) {
        double somaPonderada = valor1 * peso1 + valor2 * peso2 + valor3 * peso3;
        double somaPesos = peso1 + peso2 + peso3;
        
        if (somaPesos != 0) {
            return somaPonderada / somaPesos;
        } else {
            throw new IllegalArgumentException("Os pesos não podem ser zero.");
        }
    }

    public static void main(String[] args) {
        double valor1 = 5.0;
        double peso1 = 2.0;
        double valor2 = 4.0;
        double peso2 = 3.0;
        double valor3 = 6.0;
        double peso3 = 1.0;

        double mediaPonderada = calcularMediaPonderada(valor1, peso1, valor2, peso2, valor3, peso3);
        System.out.println("A média ponderada é: " + mediaPonderada);
    }
}