
interface Predator{
    String getFood();
}

interface  Barkable{
    void bark();
}


class Tiger extends Aniaml implements Predator, Barkable{
    public void bark() {
        System.out.println("야오오오오오옹");
    }

    public String getFood(){
        return "apple";
    }
}

class Lion extends Aniaml implements Predator,  Barkable{
    @Override
    public void bark() {
        System.out.println("어흐으으으으응");

    }

    public String getFood(){
        return "banana";
    }
}


class Zookeeper{

void feed ( Predator predator ){
    System.out.println("feed " + predator.getFood());
    }
}

class Bouncer{
    void barkAnimal(Barkable animal) {
        animal.bark();
    }
}

public class Interface_Basic {

    public static void main(String[] args) {
        // ZooKeepre zooKeeper();
        Zookeeper zookeeper = new Zookeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
       // zookeeper.feed(tiger);
       // zookeeper.feed(lion);
        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);
        Tiger predatorTiger = new Tiger();
        predatorTiger.bark();
        predatorTiger.getFood();
    }
}
