package LessonWork.Lesson3.task1;

public class Cat {
    private int age ;
    private String color ;

    public Cat() {
        System.out.println("vizvon konstruktor klassa Cat");
    }


    public Cat(int age){

        this.age = age;
    }
public Cat(String color){

        this.color = color;
}

    public Cat(int age, String color) {
        this.age = age;
        this.color = color;
    }
}
