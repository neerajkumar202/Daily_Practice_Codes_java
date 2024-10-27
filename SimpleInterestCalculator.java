import java.util.Scanner;
public class SimpleInterestCalculator {
    static double Slc(int P,float R,int T){
        double si = (P*R*T)/100.0;

        return si;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        float R = sc.nextFloat();
        int T = sc.nextInt();
        System.out.println(Slc(P,R,T));
    }
}
