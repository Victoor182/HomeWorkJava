package LessonWork.Lesson3.Task3;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Randomtest {

    public static void main(String[] args) {

        double random1 = Math.random();
        System.out.println(random1);
        int random2 = 1 + (int) (Math.random()*10);
        System.out.println(random2);
        Random random = new Random();
        System.out.println(random.nextInt(20));
        System.out.println(ThreadLocalRandom.current().nextInt(45,50));
    }
}
