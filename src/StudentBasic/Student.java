package StudentBasic;

public class Student {
    private String name;
    private String id;
    private int year;
    private String major;

    private static int count = 0;

    public Student(String name, String id, int year, String major) {
        this.name = name;
        this.id = id;
        this.year = year;
        this.major = major;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Year: " + year);
        System.out.println("Major: " + major);
        System.out.println();
    }
}
