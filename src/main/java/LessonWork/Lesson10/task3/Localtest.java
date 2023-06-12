package LessonWork.Lesson10.task3;

public class Localtest {
    public static void main(String[] args) {
        showResult(3,5);

    }
    public static void showResult(int a, int b){

        class MathOperation{
            int sum (int a,int b){
                return a +b ;
            }
            int mul ( int a,int b) {
                return a*b;
            }
            int sub (int a, int b){
                return a - b;
            }
            int div ( int a, int b){
                return a / b ;
            }
        }
        MathOperation operation = new MathOperation();
        System.out.println(operation.sum(a,b));
        System.out.println(operation.sub(a,b));
        System.out.println(operation.mul(a,b));
        System.out.println(operation.div(a,b));

    }
}
