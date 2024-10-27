public class CountPrimeNumbersInRange {
    static boolean isPrime(int num) {
        if(num<=1) return false;
        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0) {
               return false;
            }
        }
        return true;
    }
    //count prime number 1 to N

    static int countPrimeNumberInRange(int n ){
        int count = 0;
        for (int i = 2; i<=n; i++) {
            if(isPrime(i)) count++;
        }
        return count;

    }
    public static void main(String[] args) {
        System.out.println(countPrimeNumberInRange(10));

    }
}
