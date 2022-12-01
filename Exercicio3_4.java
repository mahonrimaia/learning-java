public class Exercicio3_4 {
    public static void main(String[] args) {
        int acumulador = 1;
        for (int i = 1; i <= 10; i++) {
            acumulador *= i;
            System.out.println(i + "! é: " + acumulador);
        }
    }
}
