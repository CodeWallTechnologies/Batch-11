package two.array;

public class TwoDimensionalArray {
    public static void main(String[] args) {


        int numbers[][]=new int [3][];
        numbers[0] = new int[5];
        numbers[1] = new int[2];


        int dNumbers[][] = {
                {1,2,3,4,5,6,7,8},
                {5,4,3,2,1},
                {1,1,1,1,1000},
                {5,5,3,3,4}
        };

        dNumbers[3][2]=7;


        for (int[] number:dNumbers) {
            for(int n :number){
                System.out.print(n+"\t");
            }
            System.out.println();
        }




    }
}

//Jagged