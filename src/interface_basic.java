interface Predator2{
    String getFood();
}

interface Barkable3{
    void bark();
}

class Rabbit extends Aniaml implements Predator2, Barkable3{
    public String getFood(){
        return "apple";
    }
    public void bark(){
        System.out.println("어흥어흥어흥");
    }
}

class Pig extends Aniaml implements Predator2, Barkable3{
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
