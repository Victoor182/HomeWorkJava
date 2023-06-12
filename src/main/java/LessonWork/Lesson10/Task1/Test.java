package LessonWork.Lesson10.Task1;

import LessonWork.Lesson3.task1.Cat;

import java.io.Serializable;

public class Test extends Cat  implements Runnable, Serializable, Comparable {

    private String value;
    public Test(){

    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public void run() {

    }
}
