package two.array;

public class ArrayCopy {
    public static void main(String[] args) {
     int numbers[] = {1,2,3,9,8,7,5,4,3};
        System.out.println(numbers.getClass().getName());

        int other[] = new int[6];

       System.arraycopy(numbers,3,other,0,6);


        for (int i = 0; i < other.length; i++) {
            System.out.println(other[i]);
        }



//        for (int i = 0; i < other.length; i++) {
//            System.out.print(other[i]+"\t");
//        }
//
//        System.out.println();
//
        int another[] = other.clone();
        for (int i = 0; i < another.length; i++) {
            System.out.print(another[i]+"\t");
        }

    }
}


//array => object