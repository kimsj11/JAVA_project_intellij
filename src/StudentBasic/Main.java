package StudentBasic;

public class Main {
    public static void main(String[] args) {

            Student student1 = new Student("SungJin1", "20001121", 3, "Mechanical Engineering");
            Student student2 = new Student("SungJin2", "20001122", 1, "Mechanical Engineering");
            Student student3 = new Student("SungJin3", "20001123", 4, "Architecture");
            Student student4 = new Student("SungJin4", "20001124", 6, "Taxation");

            System.out.println("Total number of students: " + Student.getCount());

            student1.printInfo();
            student2.printInfo();
            student3.printInfo();
            student4.printInfo();
        }
    }