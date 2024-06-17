package exercicios;

public class Exercicio05 {
    public static String inverterString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        char[] array = str.toCharArray();
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        return new String(array);
    }
    public static void main(String[] args) {
        String str = "Hello, world!";
        String inverted = inverterString(str);
        System.out.println("String original: " + str);
        System.out.println("String invertida: " + inverted);
    }
}