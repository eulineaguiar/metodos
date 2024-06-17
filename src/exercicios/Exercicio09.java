package exercicios;

public class Exercicio09 {
	public static String eTriangulo(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return "falso";
        }
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            return "verdadeiro";
        } else {
            return "falso";
        }
    }
    public static void main(String[] args) {
        System.out.println(eTriangulo(3, 4, 5));
        System.out.println(eTriangulo(1, 2, 3));
        System.out.println(eTriangulo(5, 5, 5));
        System.out.println(eTriangulo(-1, 2, 3));
    }
}