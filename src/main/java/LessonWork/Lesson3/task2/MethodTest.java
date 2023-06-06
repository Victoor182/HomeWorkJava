package LessonWork.Lesson3.task2;

public class MethodTest {
    public static void main(String[] args) {

        System.out.println("start Program");
        System.out.println("give Methodt");
       int result = sumTowNumber(7,2);
        System.out.println("result Work Method " + result);
        System.out.println("End work Program");
        System.out.println(joinStrings("Hello, ", "Wolrd!"));

        }
        public static String joinStrings(String First,String second){

       // String result = First+second;
       // return result;
            return First+second;
        }

        public static int sumTowNumber(int first,int second){
            System.out.println("start Method");
        int sum = first + second;
            System.out.println("end method");
        return sum;
    }


}
