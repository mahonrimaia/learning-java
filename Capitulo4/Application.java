package Capitulo4;

import java.sql.SQLOutput;

public class Application {

    public static void main(String[] args) {
        Account myAccount = new Account();
        myAccount.holder = "Ryan";
        myAccount.number = 123;
        myAccount.agency = "0001";
        myAccount.balance = 500;
        myAccount.openingDate.dia = 17;
        myAccount.openingDate.mes = 11;
        myAccount.openingDate.ano = 2010;

        Account otherAccount = new Account();
        otherAccount.holder = "NyanNyan";
        otherAccount.number = 123;
        otherAccount.agency = "0002";
        otherAccount.balance = 200;
        otherAccount.openingDate.dia = 15;
        otherAccount.openingDate.mes = 1;
        otherAccount.openingDate.ano = 2015;

        System.out.println("Account created!");


//        System.out.println(myAccount.retrieveDataToPrint());
//        System.out.println(otherAccount.retrieveDataToPrint());
//
//        System.out.println("My account balance before withdrawal: $ " + myAccount.balance);
//        if (myAccount.withdraw(300)) {
//            System.out.println("Success!!!");
//        } else {
//            System.out.println("FAILED");
//        }
//        System.out.println("My account balance after withdrawal: $ " + myAccount.balance);
//
//        System.out.println("Now I'm trying to take out some money that I don't have!");
//        if (myAccount.withdraw(1000)) {
//            System.out.println("Success!!!");
//        } else {
//            System.out.println("FAILED");
//        }
//        System.out.println("My account balance after withdrawal: $ " + myAccount.balance);
//
//        System.out.println("My month yielding is $ " + myAccount.calculateYield());
//
//        myAccount.deposit(1500);
//        System.out.println("My account balance after a deposit: $ " + myAccount.balance);
//
//        System.out.println("Now let's try to transfer some money from the other account to mine.");
//        System.out.println("Current balance of the other account is $ " + otherAccount.balance);
//        System.out.println("Mine balance is $ " + myAccount.balance);
//
//        if (otherAccount.transfer(myAccount, 1000)) {
//            System.out.println("Success!!!");
//        } else {
//            System.out.println("FAILED");
//        }
//        System.out.println("Balance of the other account after transfer is $ " + otherAccount.balance);
//        System.out.println("Mine balance after transfer is $ " + myAccount.balance);
    }
}
