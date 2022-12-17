package Capitulo14;

public class Application {

    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }

        double pi = 3.14159;

        double[] saldoDasContas;
        saldoDasContas = new double[10];

        saldoDasContas[9] = pi;

        System.out.println(saldoDasContas[9]+";");

        double[] x = new double[0];
        System.out.println(x.length);
    }
}
