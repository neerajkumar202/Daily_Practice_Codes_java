/* Problem Statement
* You are given a Bank account having N amount and you are asked to perform ADD(credit)
* or SUBTRACT(debit) operation of an amount X.After the operation print the amount left
* in the Bank account.
*  If the debit amount is greater than current balance print "Insufficient Funds"(without quotes) and the operation is skipped.

*Problem Constraints

1 <= N, X <= 105

Input Format

First line contains a single integer N denoting the balance in bank account.
Next line contains two space separated integers Type and Amount(X).


If Type == 1, Perform ADD operation.
If Type == 2, Perform SUBTRACT operation.

Output Format

Print Amount in the bank balance after the operation.

Example Input

Example Input 1 :
1000
1 500

Example Input 2 :
1000
2 200

Example Input 3 :
1000
2 1500


Example Output

Example Output 1 :
1500

Example Output 2 :
800

Example Output 3 :
Insufficient Funds


Example Explanation

Example 1 :
Initially bank balance is 1000.
ADD 500, bank balance becomes 1500, print it.

Example 2 :
Initially bank balance is 1000.
SUBTRACT 200, bank balance becomes 800, print it.

Example 3 :
Initially bank balance is 1000.
SUBTRACT 1500, can't subtract since balance is only 1000, print "Insufficient Finds".*/




import java.util.Scanner;
public class BankAccount {
    static int balance(int type,int initialBalance,int operationalAmount){
        if(type==1){ // credit or add
            initialBalance+=operationalAmount;
            return initialBalance;

        }
        else if(type==2){
            if(operationalAmount>initialBalance){
                System.out.println("Insufficient Balance");
            }
            else{
                initialBalance-=operationalAmount;
                return initialBalance;
            }

        }
        return initialBalance;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        int initialBalance = sc.nextInt();
        int operationalAmount = sc.nextInt();
        System.out.println(balance(type,initialBalance,operationalAmount));
        sc.close();


    }
}
