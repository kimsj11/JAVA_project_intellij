/**
 * */
public class Operator_Basic { //Operator = 연산자
    public static void main(String[] args) {
        int test1 = 0;
        int test2 = 0;
        int test3 = 0;
        int test4 = 0;

        // 연산식: ++ 피연산자 (다른 연산을 수행하기 전에 피연산자의 값을 1증가시킴)
//        ++test1;
        System.out.printf("TEST 1 : %d \n", ++test1);
        // 연산식: -- 피연산자 (다른 연산을 수행하기 전에 피연산자의 값을 1감소시킴)
//        --test2;
        System.out.printf("TEST 2 : %d \n", --test2);
        // 연산식: 피연산자 ++ (다른 연산을 수행한 후에 피연산자의 값을 1 증가시킴)
//        test3++;
        System.out.printf("TEST 3 : %d \n", test3++);
        //   연산식: 피연산자 -- (다른 연산을 수행한 후에 피연산자의 값을 1 감소시킴)
//        test4--;
        System.out.printf("TEST 4 : %d \n", test4--); //행 옮기기: commad+shift+방향키
        System.out.printf("TEST 4 AFTER : %d \n", test4);

        // 내가 무언가를 변수와 함께 프린트를 하고 싶다면 printf 와 %d

        /************************************************/

        // 논리 부정 연산자.
        System.out.println(!false);
        System.out.println(!true);
        // !(느낌표)가 붙으면 반대로 인식. 반전


        // 산술 연산자
        System.out.println(33/6); // "/" = 항상 몫을 출력함.
        System.out.println(33%6); // "%" = 항상 나머지를 출력함.
        // (X) % 2 == 0
        // 해당 값은 짝수 아니라면 홀수
        System.out.println(2131321230%2);

        // 비교 연산자
        System.out.println(1>2);      // false
        System.out.println(1>=2);     // false
        System.out.println(1<2);      // true
        System.out.println(1<=2);     // true
        System.out.println(1 == 2);   // false
        System.out.println(1 != 2);   // true
        System.out.println(!(1 == 2)); // true

        // 논리 연산자
        System.out.println(true && false); // AND(&&) = 둘 다 true면 true, 나머지는 다 false
        System.out.println(true || false); // OR(||)  = 둘 중 하나만 true면 true, 둘 다 false면 false

        // 2진수로 계산하면 됩니다.
        System.out.println(10&3);
        System.out.println(10|3);
        System.out.println(10^3); // ^(XOR) 베타적 논리

        // 삼항 연산자
        System.out.println(false ? 1 : 2); //2
        System.out.println(true ? 1 : 2);  //1

        int test = 0;
        System.out.println(test++ != --test && false ^ true || test++ > --test);
    }
}
