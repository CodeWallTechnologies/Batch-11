package two.array;

public class CustomArrayCopy {
    public static void main(String[] args) {

   int numbers[] = {3,5,9,7,6,2,4,4,8};
   int valueNow = 0;


        for (int i = 0; i < numbers.length; i++) {
            for(int j = i+1;j <numbers.length;j++){
                if(numbers[i]>numbers[j]){
                    valueNow=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=valueNow;
                }
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+"\t");
        }


        System.out.println();
        System.out.println(numbers[numbers.length-3]);
    }
}
