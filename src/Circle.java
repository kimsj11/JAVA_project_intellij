import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final double PI = 3.14;
        System.out.printf("반지름 입력");//sou + tap = System.out.printf("");
        double radius = scan.nextDouble(); //반지름 입력받기

        System.out.println("원의 둘레:"+(2*PI*radius));
        System.out.println("원의 넓이:"+(PI*radius*radius));//intellij git commmit push 알려주실분 구함~~~~--->>>>>>>>
    }
}
/* 야이 컴퓨터 개색갸
어디서 사람을 이겨먹으려 해?
내가 오류가 있어도 github에 push and commit 하겠다니까?
야이 시팔롬아
intellij sibar
* */