package HomeWork.Lesson3;

public class TypeTest {
    public static void main(String[] args) {

        byte b = 45;
        short sh;
        sh = b;
        System.out.println(sh);

        sh = 100;
        b = (byte)sh;
        System.out.println(b);

    }
}
