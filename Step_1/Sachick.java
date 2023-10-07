import java.util.Scanner;

public class Sachick {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int[] sums = new int[5];

        sums[0] = a+b;
        sums[1] = a-b;
        sums[2] = a*b;
        sums[3] = a/b;
        sums[4] = a%b;

        for(int i=0; i<5; i++){
            System.out.println(sums[i]);
        }
        in.close();
    }
}
