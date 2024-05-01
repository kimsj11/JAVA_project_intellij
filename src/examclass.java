
/**
 *
 * 7. 다음의 요구 사항을 충족시키는 Java 프로그램을 작성하세요.
 * 7-1. Calculator 클래스를 만드세요. 이 클래스에는 정수형 데이터를 입력받아 두 수를 더하는 add() 메서드를 작성하세요.
 * 7-2. Main 클래스에서 Calculator 객체를 생성하고, add() 메서드를 사용하여 두 수를 더한 결과를 출력하세요.
 *
 * */

class Calculator{
    public int add(int a, int b) {
        return a+b;
    }
}

public class examclass {
    public static void main(String[] args) {

        Calculator c = new Calculator();
        System.out.println(c.add(150, 75));

    }
}