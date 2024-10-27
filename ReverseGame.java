/*
* Q2. Reverse Game
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Write a program that accepts T numbers(N) from the user and find reverse of the given number(N).


Problem Constraints

1 <= T <= 100

1 <= N <= 100000000



Input Format

First line is T which means number of test cases.

Each next N lines contain an integer N.



Output Format

T lines each containing reverse of the input integer.



Example Input

Input 1:

2
101
105
Input 2:


1
100


Example Output

Output 1:

101
501
Output 2:

1


Example Explanation

Explanation 1:

Reverse(101)=101
Reverse(105)=501
Explanation 2:

Reverse(100)=001=1
*/


public class ReverseGame {
    static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            rev =  rev * 10 + x % 10;
            x = x / 10;

        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println(reverse(123));

    }
}
