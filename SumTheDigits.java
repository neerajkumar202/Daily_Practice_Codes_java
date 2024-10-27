/*
* Problem Description
You take a number of test cases, denoted by T as input.For each test case, you should take integers N as input.
*  Your task is to calculate and print the sum of the digits of the given number N.

Problem Constraints

1 <= T <= 1000
0 <= N <= 100000000
Input Format

The first line is T which means the total number of test cases.
Each of the next T lines contain an integer N.
. Output Format

T lines each containing one integer representing the sum of the digits of the input integer.
Example Input

Input 1:
2
5
1001

Input 2:
2
123
1589
Example Output

Output 1:
5
2

Output 2:
6
23
Example Explanation

Explanation 1:
5 has only 1 digit hence sum is 5.
For the number 1001, the digits are 1,0,0,1. The Sum(1001) = 1+0+0+1 = 2.

Explanation 2:
For the number 123, the digits are 1,2,3. The Sum(123) = 1+2+3 = 6.
For the number 1589, the digits are 1,5,8,9. The Sum(1589) = 1+5+8+9 = 23.*/

import java.util.Scanner;
public class SumTheDigits {
    static int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;

        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int t=1;t<=T;t++){
            int n = in.nextInt();
            System.out.println(sumDigits(n));
        }



    }
}
