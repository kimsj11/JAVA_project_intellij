public class Loop_Basic {
    public static void main(String[] args) {
        // While 반복문
        // 조건문이 true일 동안 반복합니다.
        int treeHit = 0;
        while (true){
            treeHit ++;
            if (treeHit % 10 != 0){
                continue;
            }

            System.out.println("나무를" + treeHit + "번 찍었습니다");
            if (treeHit == 100){
                System.out.println("나무가 넘어갑니다~");
                break;
            }
        }

        //For 문
        String[] dlist = {"one", "two", "three", "four", "five"};
        System.out.println(dlist[0]);
        System.out.println(dlist[1]);
        System.out.println(dlist[2]);
        System.out.println(dlist[3]);
        System.out.println(dlist[4]);

        // 그렇다면 for문을 통해 출력을 하면 됩니다.
        for (int i = 0; i < dlist.length; i++){
            // .length(배열의 길이를 반환함.)
            // 처음에 i = 0이 들어감 ->
            System.out.println(dlist[i]);

            int[] marks = {90, 25, 67, 45, 80};
            for(int j=0; j<marks.length; j++) {
                if (marks[j] >= 60) {
                    System.out.println((j+1)+"번 학생은 합격입니다.");
                }else {
                    System.out.println((j+1)+"번 학생은 불합격입니다.");
                }


                //2중 for문을 두 번 사용해서
                // 구구단 2단~9단까지 출력하는 코드를 작성 해봅시다.

                for(int l=2; l<10; l++) {
                    for(int k=1; k<10; k++) {
                        System.out.print(l*k+" ");
                    }
                    System.out.println("");  // 줄을 바꾸어 출력하는 역할을 한다.

                    String[] colors = {"red", "green", "blue", "yellow"};
                    System.out.println(colors);
                    for (int a = 0; a < colors.length; a++){
                        System.out.println(colors[a]);

                        //index를 넣는것 조차 귀찮아서 자동으로 배열의 값을 가져오는 반복문을 만들어버림..
                        //for ~ each문이라고 합니다.
                        for (String color : colors){
                            System.out.println(color);
                        }
                        // for ( "type" - "배열 안에 들어가 있는 데이터의 타입"  "변수명" : iterate - 반복해서 값에 접근할 배열)

                        int[] numbers = {1,2,3,4,5,6,7,8,9};
                        //for each로 출력을 해보시오.

                        for (int number : numbers){
                            System.out.println(number);
                        }

                    }
                }

            }

        }

    }
}
