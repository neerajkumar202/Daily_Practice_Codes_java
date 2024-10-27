import java.util.Scanner;
public class FactorialOfANumber {
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            //System.out.println("Factorial of " + i + ": " + fact);
            fact = fact * i;
           // System.out.println("After multiplying by " + i + ", fact = " + fact);

        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));

    }
}
