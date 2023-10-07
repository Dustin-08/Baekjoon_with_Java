import java.util.Scanner;

public class A_Nanu_B {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        double a = in.nextDouble();
        double b = in.nextDouble();
        double sum = 0;

        sum = a/b;

        System.out.println(sum);
        in.close();
    }
}
