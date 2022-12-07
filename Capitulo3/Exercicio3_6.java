package Capitulo3;

public class Exercicio3_6 {
    public static void main(String[] args) {
        // Escrever 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, etc.
        int a = 0;
        int b = 1;

        for (int i = 0; i < 10; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            if (i % 2 == 0) {
                System.out.print(a);
                a += b;
            } else {
                System.out.print(b);
                b += a;
            }
        }
    }
}
