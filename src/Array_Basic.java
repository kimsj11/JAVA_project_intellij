public class Array_Basic {

    // 배열 선언과 동시에 초기화를 진행
    public static void main(String[] args) {
        int[] myArray = new int[10];

        // 배열 초기화와 동시에 선언 및 값 대입
        int[] myArray2 = {1,2,3,4,5};

        // 다차원 배열               0           1           2           3           4
        int[][]  myArray3 = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};

        // 배열 초기화

        myArray[0] = 1;
        myArray[1] = 1;
        myArray[2] = 1;
        myArray[3] = 1;
        myArray[4] = 1;
        myArray[5] = 1;
        myArray[6] = 1;
        myArray[7] = 1;
        myArray[8] = 1;
        myArray[9] = 1;
        // myArray[10] = 1;
        // 배열은 0부터 시작인데 10이 있어서 에러가 발생함.

        // 색인(index)
        // [index]
        System.out.println(myArray2[3]);


    }
}
