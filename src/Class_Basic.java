class car {
    String brand;
    int rider;
    int price;

    public void setCar(String brand, int rider, int price){
        this.brand = brand;
        this.price = price;
        this.rider = rider;
    }
}

public class Class_Basic {
    // 1. 붕어빵에는 3가지 맛이 있다. (크림, 팥, 치즈)
    // 3가지 종류의 맛을 넣어서 출력하는 메서드를 만드시오.

    public static void bungabbang (String[] taste, int idx){
        System.out.println(taste[idx] + "붕어빵 입니다.");
    }

    public static void main(String[] args){

        car sjCar = new car();
        sjCar.setCar("아우디", 5, 2000000000);
        System.out.println(sjCar.brand + "," + sjCar.rider + "," + sjCar.price);

        String [] taste = {"크림", "팥", "김치"};
        bungabbang(taste, 0);
    }

}

