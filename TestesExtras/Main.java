package TestesExtras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("a ou b?");
        String x = sc.next();

        while (!x.equals("a") && !x.equals("b")) {
            System.out.println("WROOONG!");
            System.out.print("a ou b?: ");
            x = sc.next();
        }

        System.out.println("RIIIIIIIIIGHT!!!");

        sc.close();
    }
}
