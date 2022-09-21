import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arr ={6,5,3,4,1,2};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                }
            }

        }
 System.out.println(Arrays.toString(arr));
//        for (int i = 1; i <= 100; i++) {
//            if(i%3==0&&i%5==0){
//                System.out.println("FizzBuzz");
//            } else if (i%3==0) {
//                System.out.println("Fizz");
//            } else if (i%5==0) {
//                System.out.println("Buzz");
//            }else {
//                System.out.println(i);
//        }
    //}
}
}