package exercicios;

public class Exercicio02 {

    public static int calcularFatorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("O número deve ser não negativo.");
        }
        
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        
        return fatorial;
    }
    
    public static void main(String[] args) {
        int numero = 5;
        int fatorial = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}