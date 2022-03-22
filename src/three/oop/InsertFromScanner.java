package three.oop;

import java.util.Scanner;

public class InsertFromScanner {

   static void  add(int num1, int num2){
        System.out.println(num1+num2);
    }
   static void  subtract(){
        System.out.println("subtract method is working");
    }
   static void  multiply(){
        System.out.println("multiply method is working");
    }
   static void  division(){
        System.out.println("division method is working");
    }


    public static void main(String[] args) {

        System.out.print("Choice a number: between 1 and 4\n" +
                "1 for add\n" +
                "2 for subtract\n" +
                "3 for multiply\n" +
                "4 for division : ");
        int userChoice = new Scanner(System.in).nextInt();

        if (userChoice == 1) {
            System.out.println("Enter a number");
            int num1 = new Scanner(System.in).nextInt();
            System.out.println("Enter other number");
            int num2 = new Scanner(System.in).nextInt();
            add(num1,num2);
        } else if (userChoice == 20) {
           subtract();
        }else if (userChoice == 3){
           multiply();
        }else if (userChoice == 4){
            division();
        }else {
            System.out.println("Please enter a number correctly");
        }
    }
}
