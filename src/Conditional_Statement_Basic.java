import java.util.ArrayList;

public class Conditional_Statement_Basic {
    public static void main(String[] args) {
        boolean money = true; // 현재 내 상태

        //조건문
        if(money == true){
            System.out.println("택시를 탄다.");
        }else{
            System.out.println("걸어간다.");
        }

        int money1 = 3000;
        boolean hasCard = true;

        // 지금 2800 돈이 이상이거나 카드가 true인 경우 택시를 탈 수 있다.
        if (money1 >= 2800 || hasCard == true){
            System.out.println("택시를 탄다.");
        }else{
            System.out.println("걸어간다.");
        }

        if(money1 == 2000)

            //반드시 else를 써야 하는건 아니다.
            if(money1 == 2000) {
                System.out.println("돈이 2천원 있다.");
            }

        // 문자가 들어갈 수 있는 pocket이라는 방이 생성.
        ArrayList<String> pocket = new ArrayList<String>();
        pocket.add("훔친지갑1");
        pocket.add("훔친지갑2");
        pocket.add("훔친라면");

        // contains = 포함
        if(pocket.contains("훔친지갑1") && pocket.contains("훔침")) {
            System.out.println("다 쓴다");
        }else if (pocket.contains("훔친지갑1")){
            System.out.println("난 다시 훔쳐.");
        }else{
            System.out.println("다시 훔친다.");
        }

       // [0] = 1; ArrayList x

        int myAge = 29;

        switch (myAge){
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                System.out.println("20대 초반");
                break;
            case 25:
                System.out.println("20대 중반");
                break;
            case 26:
            case 27:
            case 28:
            case 29:
                System.out.println("20대 후반");
                break;
            default:
                System.out.println("20대가 아닌 다른 나이.");
        }




    }
}

