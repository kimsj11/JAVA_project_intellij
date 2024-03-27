import java.util.Scanner;

public class If_else02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int min;
        System.out.print("첫번째 수 : ");
        int num1 = scan.nextInt();
        System.out.print("두번째 수 : ");
        int num2 = scan.nextInt();
        System.out.print("세번째 수 : ");
        int num3 = scan.nextInt();

        if (num1 < num2) {
            if (num1 < num3) min = num1;
            else min = num3;
        } else {
            if (num2 < num3) min = num2;
            else min = num3;
        }
        System.out.println("가장 작은 수: "+min);
    }
}
