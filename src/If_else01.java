import java.util.Scanner;

public class If_else01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("a = ");
        int a = scan.nextInt();
        System.out.println("b = ");
        int b = scan.nextInt();
        System.out.println("==============");
        if(a>b){
            System.out.println(a);
        } else if (a<b) {
            System.out.println(b);
        }else {
            System.out.println(a+", "+b);
        }
    }
}
