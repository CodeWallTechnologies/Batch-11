package three.oop;

import java.util.Scanner;

public class AtmProject {
    int id;
    String name;
    double amount;


    public AtmProject(int id, String name, double amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    void add(double amt){
        amount = amount+amt;
    }

    void withdraw(double wAmount){
        if(amount>wAmount){
            amount = amount-wAmount;
            System.out.println("Your balance is "+ amount);
        }else {
            System.out.println("Your balance is lower than your need");
        }
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("Write \"Stop\" if you want to stop");
            String stopProgram = new Scanner(System.in).nextLine();
            AtmProject user1 = new AtmProject(1, "Thura Linn", 10000);
            System.out.print("Choice a number: between 1 and 4\n" +
                    "1 for account create\n" +
                    "2 for add amount\n" +
                    "3 for withdraw\n" +
                    "4 for show data ");
            int userChoice = new Scanner(System.in).nextInt();

            if (userChoice == 1) {
                System.out.println("\n");
                System.out.println("Enter amount");
                double amount = new Scanner(System.in).nextDouble();
                user1.add(amount);
                System.out.println("Your current value is " + user1.amount);

            } else if (userChoice == 2) {
                System.out.println("Enter amount you want to draw: ");
                double amount = new Scanner(System.in).nextDouble();
                user1.withdraw(amount);
            } else {
                System.out.println("Please enter a number correctly");
            }

        }






    }
}


//amount>userInput => yes

//amount - userInput => left amount<10000

//amount<userInput => NO