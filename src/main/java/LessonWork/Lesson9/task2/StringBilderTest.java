package LessonWork.Lesson9.task2;

public class StringBilderTest  {
    public static void main(String[] args) {

       // StringBuilder builder = new StringBuilder();
       // StringBuilder builder = new StringBuilder(50);
        StringBuilder builder = new StringBuilder("AppelPear");

        System.out.println("Capacity arhive " + builder.capacity());
        System.out.println("long string " + builder.length());
        System.out.println("String " + builder);

        builder.append("Banana").append("Cherry").append("Tomato");

        System.out.println("Capacity arhive " + builder.capacity());
        System.out.println("long string " + builder.length());
        System.out.println("String " + builder);

        builder.append(24);
        System.out.println("string " + builder);

        builder.appendCodePoint(25);
        System.out.println("String " + builder);

        System.out.println(builder.charAt(5));


        builder.delete(9,15);
        System.out.println(builder);

        builder.deleteCharAt(builder.length()-1);
        System.out.println(builder);

        System.out.println(builder.indexOf("r"));

        builder.insert(5,"Cucumber");
        System.out.println(builder);

        builder.replace(5,13,"Watermelon");
        System.out.println(builder);

        String substring = builder.substring(5);
        System.out.println(substring);

        substring = builder.substring(15,19);
        System.out.println(substring);

        String result = builder.toString();
        System.out.println(result);

        builder.reverse();
        System.out.println(builder);

    }
}
