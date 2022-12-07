package Capitulo3;

public class Exercicio3_5 {
    public static void main(String[] args) {
        long acumulador = 1;
        for (int i = 1; i <= 40; i++) {
            acumulador *= i;
            System.out.println(i + "! é: " + acumulador);
        }
    }
}
