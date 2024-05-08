
abstract class Predator2 extends Aniaml{
   abstract String getFood();

   void printFood(){ // default를 제거한다. -- 인터페이스에서 추상화 클래스로 변경했기 때문에 method는 더 이상 사용할 수 없습니다.
       System.out.printf("my food is %s\n", getFood());
   }
}

interface Barkable3{
    void bark();
}

class Rabbit extends Predator2 implements Barkable3{
    public String getFood(){
        return "apple";
    }
    public void bark(){
        System.out.println("어흥어흥어흥");
    }
}

class Pig extends Predator2 implements Barkable3{
    public String getFood(){
        return "banana";
    }
    public void bark(){
        System.out.println("크아아아앙");
    }
}

class Zookeeper{
    void feed(Predator2 predator){
        System.out.println("feed" + predator.getFood());
    }
}

class Bouncer2 {
    void barkAnimal(Barkable3 barkable2) {
        barkable2.bark();
    }
}

public class interface_basic {
    public static void main(String[] args) {

        Rabbit rabbit = new Rabbit();
        Pig pig = new Pig();

        Bouncer2 bouncer2 = new Bouncer2();
        bouncer2.barkAnimal(rabbit);
        bouncer2.barkAnimal(pig);

        Rabbit predatorrabbit = new Rabbit();
        predatorrabbit.bark();
        predatorrabbit.getFood();
    }
}
