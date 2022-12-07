package Capitulo4;

public class Account {
    String holder;
    int number;
    String agency;
    double balance;
    Data openingDate = new Data();

    boolean withdraw(double value) {
        if (balance >= value) {
            balance -= value;
            return true;
        }

        return false;
    }

    void deposit(double value) {
        if (value > 0) {
            balance += value;
        }
    }

    boolean transfer(Account destiny, double value) {
        if (balance >= value) {
            balance -= value;
            destiny.deposit(value);
            return true;
        }

        return false;
    }

    double calculateYield() {
        return balance * 0.1;
    }

    String retrieveDataToPrint() {
        return "DATA ACCOUNT\n"
                + "Holder: " + holder + "\n"
                + "Number: " + number + "\n"
                + "Agency: " + agency + "\n"
                + "Balance: " + balance + "\n"
                + "Opening Date: " + openingDate.formatada();
    }
}
