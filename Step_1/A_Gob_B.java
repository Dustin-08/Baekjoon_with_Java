import java.util.Scanner;

public class A_Gob_B {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int sum = 0;

        sum = a*b;

        System.out.println(sum);
        in.close();
    }
}
