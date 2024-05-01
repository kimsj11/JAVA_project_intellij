
interface Shape{
    double getArea();
}

class Circle2 implements Shape{
 private double radius; // instance 변수 radius - 반지름 선언

    public void setRadius( double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        // 원의 넓이 구하는 공식 = 반지름 * 반지름 * PI
        return radius * radius * Math.PI;
    }
}

class Rectangle implements Shape{
    private double length;
    private double width;

    public void setLength( double length ){
        this.length = length;
    }
    public void setWidth( double width ){
        this.width = width;
    }

        public double getArea(){
            return length * width;
    }
}

public class example {
    public static void main(String[] args) {
        Circle2 circle2 = new Circle2();
        Rectangle rectangle = new Rectangle();
        circle2.setRadius(10);
        rectangle.setLength(8);
        rectangle.setWidth(7);

        System.out.println("원의 넓이" + circle2.getArea());
        System.out.println("사각형의 넓이"+ rectangle.getArea());
    }
}


/*** 1. 자바에서 상수로 선언한 객체는 다시 재선언을 하는 것이 불가능하다.2,3,4,
자바에서 상수를 ;선언할 때 사용하는 키워드는 무엇인가?
        final

        2. final int mini = 3; 라는 코드가 있을 때 여기서 상수와 리터럴을 각각 쓰시오.
        상수: 1 리터럴: 3

        3. 삼항 연산자를 사용하여 아래 코드를 수정해 number가 0일 경우 false를 아닐경우 true를 출력하시오.
        int number = 0;
        System.out.println();

        int number = 0;
        System.out.println(number != 0 ? true : false);
4.
        4. 10x10의 이차원 배열 dArray를 만들고 아래와 같이 값을 넣는 코드를 작성하시오.
            [
           [0,1,2,3,4,5,6,7,8,9],[0,1,2,3,4,5,6,7,8,9],[0,1,2,3,4,5,6,7,8,9],[0,1,2,3,4,5,6,7,8,9],[0,1,2,3,4,5,6,7,8,9]
           [0,1,2,3,4,5,6,7,8,9],[0,1,2,3,4,5,6,7,8,9],[0,1,2,3,4,5,6,7,8,9],[0,1,2,3,4,5,6,7,8,9],[0,1,2,3,4,5,6,7,8,9]
           ]

        System.out.println("4번 출력 : ");
        for (int i = 0; i < 10; i++){
        for (int j = 0; j < 10; j++){
        System.out.print(dArray[i][j] + " ");
        }
        System.out.println();
        }


 5. 반복문을 사용하여 2차원 배열의 총 합계를 구하는 코드를 작성하시오.

 int sum = 0;

 for (int i = 0; i < 10; i++){
 for (int j = 0; j < 10; j++){
 sum += mArray[i][j];
 }
 }

 System.out.println("5번 답 : " + sum);

6. Switch Case 문을 사용해 월을 숫자로 입력 받아 영어의 월을 출력하는 코드를 작성하시오.
        ex.) 1 입력 시 January.

7. 다음의 요구 사항을 충족시키는 Java 프로그램을 작성하세요.
        1. Calculator 클래스를 만드세요. 이 클래스에는 정수형 데이터를 입력받아 두 수를 더하는 add() 메서드를 작성하세요.
        2. Main 클래스에서 Calculator 객체를 생성하고, add() 메서드를 사용하여 두 수를 더한 결과를 출력하세요.





/***1. 8. 다음의 요구 사항을 충족시키는 Java 프로그램을 작성하세요.
*       1.Shape 인터페이스를 만드세요. 이 인터페이스는 getArea() 메서드를 가져야 합니다.
*       2. Circle 클래스를 작성하세요. 이 클래스는 Shape 인터페이스를 구현해야 합니다. Circle 클래스는 반지름을 인스턴스 변수로 가지며,
 *         getArea() 메서드를 구현하여 원의 넓이를 반환해야 합니다.
*       3. Rectangle 클래스를 작성하세요. 이 클래스는 Shape 인터페이스를 구현해야 합니다. Rectangle 클래스는 가로와 세로를 인스턴스 변수로 가지며,
 *         getArea() 메서드를 구현하여 직사각형의 넓이를 반환해야 합니다.
*       4. Main 클래스에서는 Circle 및 Rectangle 객체를 생성하고, 각 객체의 넓이를 출력하세요.
*/
