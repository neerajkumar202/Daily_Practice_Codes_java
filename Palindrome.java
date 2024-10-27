public class Palindrome {
    static boolean isPalindrome(int N) {
        int reverse = 0;
        int original = N;
        while (N !=0 ) {
            reverse = reverse*10+N % 10;
            N = N / 10;


        }
         if (original == reverse) {
             return true;
         }
         return false;

    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));

    }
}
