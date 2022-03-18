package two.array;

public class JavaArray {
    public static void main(String[] args) {
        String names[] = new String[]{"Mg Mg","Thura Linn","CodeWall","Kyaw","Technoloiges",null };
        //Collection Framework

        String cars[] = new String[4];
        cars[0]= "marcedes";
        cars[2]= "toyota";
        cars[3]= "lamborghini";



        for(int i = 3; i<= names.length;i++ ){
            System.out.print(names[i]+"\t");
        }
        System.out.println();

        for(String n:names){
            System.out.print(n+"\t");
        }
        System.out.println();

        for (int i = names.length - 1; i >= 0; i--) {
            System.out.print(names[i]+"\t");
        }

    }
}


//Array

//one dimensional array
//two or multidimensional array
//jagged array