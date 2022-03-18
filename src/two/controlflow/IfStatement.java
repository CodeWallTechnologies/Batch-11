package two.controlflow;

public class IfStatement {

    public static void main(String[] args) {
        //syntax => dataType variableName = value ;



        //if(condition){} => if true , do something


        //boolean => true or false
//        int a = 1;
//        int b = 9;
//        if(a < b){
//            System.out.println(a + " is grater than "+ b);
//        }
//
//        if(a>b){
//            System.out.println((a>b) + " com.codewall.batch11.one statement");
//        }else {
//            System.out.println((a>b)+ " second statement");
//        } //if else


        int mark = 80;
        if(mark < 40){
            System.out.println("fail");
        }else if(mark >= 40 && mark < 80){
            System.out.println("pass");
        }   else {
            System.out.println("D");
            System.out.println("E");
            System.out.println("F");
            System.out.println("G");
        }

    }

}

