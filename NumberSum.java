import java.util.Scanner;
public class NumberSum {
    static int sum(int[] num){
        int sum = 0;
        for(int i=0; i<num.length; i++){
            sum += num[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of numbers: ");
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i=0; i<n; i++){
            num[i] = sc.nextInt();
        }
        System.out.println("the sum: " + sum(num));

    }
}
