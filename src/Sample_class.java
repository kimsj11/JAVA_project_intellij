import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

// 동물 클래스 생성
class Animal{
    String name;
    Boolean cute;

    public void setName(String name){
        this.name = name;
    }

    public void setCute(Boolean cute){
        this.cute = cute;
    }
}

public class Sample_class {

    // 과일주스 만들기 메서드
    public static String mixer(String fruits){
        System.out.println(fruits + "주스가 나왔습니다~");
        return fruits + "주스";
    }
    public static void main(String[] args) {
        String juice = mixer("사과 당근");
        System.out.println("내가 만든 주스 : +juice");


        Animal cat = new Animal();
        //cat.name = "고양이";
        Animal dog = new Animal();
        //cat.name = "강아지";

        dog.setName("강아지");
        cat.setName("고양이");

        System.out.println(cat.name);
        System.out.println(dog.name);

        dog.setCute(true);
        cat.setCute(false);

        System.out.println(cat.cute);
        System.out.println(dog.cute);

        }
    }

