public class test {
    public static void main(String[] args) {
        int monthNumber = 12;
        String monthName;
        monthName = "January";

        switch (monthNumber) {
            case 1:
            monthName = "January";
            break;

            case 2:
            monthName = "February";
            break;

            case 3:
            monthName = "March";
            break;

            case 4:
            monthName = "April";
            break;

            case 5:
            monthName = "May";
            break;

            case 6:
            monthName = "June";
            break;

            case 7:
            monthName = "July";
            break;

            case 8:
            monthName = "August";
            break;

            case 9:
            monthName = "September";
            break;

            case 10:
            monthName = "October";
            break;

            case 11:
            monthName = "November";
            break;

            case 12:
            monthName = "December";
            break;


            default:
                monthName = "Invalid month number";
                break;
        }

        System.out.println("6번 답: " + monthName);


        /*int[][] mArray = new int[10][10];
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                mArray[i][j] = j;
            }
        }


        System.out.println("4번 출력 : ");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(mArray[i][j] + " ");
            }
            System.out.println();
        }


        int sum = 0;

        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                sum += mArray[i][j];
            }
        }

        System.out.println("5번 답 : " + sum);
        */
    }
}
