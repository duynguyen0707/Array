import java.security.PublicKey;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n=");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.format("a[%d]=", i);
            arr[i] = sc.nextInt();
        }
//        printArray(arr);
//        int e = sumElements(arr);
//        System.out.print(e);

//        int[] arr1 = EntryPoint.generateArray(3, 2, 20);
//        //   System.out.print(arr1);
//        EntryPoint.printArray(arr1);
//        boolean bl = EntryPoint.isPrime(arr1);
////        System.out.print("Is array contains all prime number? " + bl);
//        boolean bl1 = EntryPoint.isIncreasingArr(arr);
//        System.out.print("Is array contains all prime number? " + bl1);
//        int sum=EntryPoint.countNumberMode4And5(arr);
        int sum =EntryPoint.sumPrimeNumberInArray(arr);
        System.out.print(sum);
    }


}
