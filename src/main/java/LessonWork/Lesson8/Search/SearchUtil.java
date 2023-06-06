package LessonWork.Lesson8.Search;

public class SearchUtil {
    public static int linearSearch(int[] array, int elemnt) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == elemnt) {
                return i;
            }
        }
        return -1;

    }

    public static int BinarySearch(int[] array, int elemnt) {

        int start = 0;
        int end = array.length - 1;
        int current = array.length / 2;

        while (start <= end) {

            if (array[current] == elemnt) {

                return current;
            } else if (elemnt < array[current]) {
                end = current - 1;

            } else {
                start = current + 1;
            }
            current = (start + end ) / 2;

        }
        return -1;
    }

    public static int jumpSearch (int[] array, int elemnt) {

        int start = 0;
        int jump = (int) Math.sqrt(array.length);
        int end = jump;

        while (end < array.length) {
            if (array[end] < elemnt ){
                start = end +1 ;
                end = start + jump;
            }else  {
                break;
            }
        }
        if (end >= array.length) {
            end = array.length -1;
        }
         for (int i = start; i <= end; i++) {
             if (array[i] == elemnt){
                 return i;
             }
         }
         return -1;

    }


}

