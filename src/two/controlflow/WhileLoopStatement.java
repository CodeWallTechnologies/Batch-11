package two.controlflow;

public class WhileLoopStatement {
    public static void main(String[] args) {
        //while

        int a = 7;
        while (a<10){//9//10
            System.out.println(a);
            a++; //10
        }

//        do{
//            System.out.print(a +"\t");
//            a+=2;
//        }while (a<20);


        int number = 10;
        do {
            System.out.println(number);
            number++;
        }while (number<7);

    }
}
