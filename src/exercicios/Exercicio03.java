package exercicios;

public class Exercicio03 {
    public static String ehPalindromo(String texto) {
        texto = texto.replaceAll("\\s+", "").toLowerCase();
        
        String invertido = new StringBuilder(texto).reverse().toString();
        
        return texto.equals(invertido) ? "verdadeiro" : "falso";
    }
    
    public static void main(String[] args) {
        String texto1 = "arara";
        String texto2 = "reviver";
        String texto3 = "hello";
        
        System.out.println(texto1 + " � pal�ndromo? " + ehPalindromo(texto1));
        System.out.println(texto2 + " � pal�ndromo? " + ehPalindromo(texto2));
        System.out.println(texto3 + " � pal�ndromo? " + ehPalindromo(texto3));
    }
}