public class EntryPoint {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.format("%d, ", arr[i]);
        }
        System.out.println();
    }



    public static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
    }

    public static int[] generateArray(int n, int min, int max) {
        int[] ret = new int[n];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (int) Math.floor(Math.random() * (max - min)) + min;
        }
        return ret;

    }

    public static boolean isAllEvent(int[] arr) {
        for (int n : arr) {
            if (n % 2 != 0) {
                return false;
            }
        }

        return true;
    }

    public static int sumElements(int[] arr) {
        int ret = 0;
        for (int ele : arr) {
            ret += ele;
        }
        return ret;
    }

    public static boolean isArrayContainPrime(int[] arr) {
        boolean result = true;
        for (int ele : arr) {
            {
                int sqr = (int) Math.floor(Math.sqrt(ele));
                for (int i = 2; i <= sqr; i++) {
                    if (ele % i == 0) {
                        return false;

                    }
                }
            }

        }
        return true;
    }

    public static boolean isIncreasingArr(int[] arr) {
        boolean result = true;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    return false;

                }

            }

        }
        return true;
    }

    public static boolean isNumberMod4 (int n){
        boolean result = true;
        if (n%4!=0){
            return false;
        }
        return true;
    }
    public static boolean isNumberMod5 (int n){
        boolean result = true;
        if (n%5!=0){
            return false;
        }
        return true;
    }

    //Có bao nhiêu số chia hết cho 4 nhưng không
    //chia hết cho 5
    public static int countNumberMode4And5(int[] arr) {
        int total = 0;
        for (int ele : arr) {
            if (isNumberMod4(ele) && (isNumberMod5(ele) == false)) {
                total += 1;
            }

        }
        return total;
    }
//Tổng các số nguyên tố có trong mảng
    public static int sumPrimeNumberInArray (int[]arr){
        int sum=0;
        for (int ele:arr) {
           if( isPrime(ele)){
               sum+=ele;
           }

        }

        return sum;
    }

    public static boolean isPrime(int n) {
        boolean result = true;
        int sqr = (int) Math.sqrt(n);
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= sqr; i++) {
            if (n % i == 0) {
                result = false;
                break;
            } else {
                result = true;
            }
        }
        return result;
    }

}
