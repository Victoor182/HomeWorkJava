package LessonWork.Lesson8.Search;

import LessonWork.Lesson8.Sort.Sortutils;

import java.util.Arrays;

public class SearchTest {

    public static void main(String[] args) {

        int[] array = {3, 7, 1, 3, 9, 2, 14, 78, 16, 12, 0, 7, 2};
        System.out.print("Result linear Search: ");
        System.out.println(SearchUtil.linearSearch(array, 7));

        Arrays.sort(array);

        System.out.println(" Sort Masiv: ");
        System.out.println(Arrays.toString(array));

        System.out.print(" Result binary search : ");
        System.out.println(SearchUtil.BinarySearch(array, 2));

        System.out.print("Result Search Jump : ");
        System.out.println(SearchUtil.jumpSearch(array,3));

        array = new int [] {3, 7, 1, 3, 9, 2, 14, 78, 16, 12, 0, 7, 2};
        System.out.println(" masiv not sort:");
        System.out.println(Arrays.toString(array));

        Sortutils.bibbleSort(array);
        System.out.println("sort Method Buble: ");
        System.out.println(Arrays.toString(array));

        array = new int [] {3, 7, 1, 3, 9, 2, 14, 78, 16, 12, 0, 7, 2};
        System.out.println(" masiv not sort:");
        System.out.println(Arrays.toString(array));
        Sortutils.insertionSort(array);
        System.out.println("sort insert: ");
        System.out.println(Arrays.toString(array));

        array = new int [] {3, 7, 1, 3, 9, 2, 14, 78, 16, 12, 0, 7, 2};
        System.out.println(" masiv not sort:");
        System.out.println(Arrays.toString(array));

        Sortutils.selectionSort(array);
        System.out.println("sort Selection: ");
        System.out.println(Arrays.toString(array));



    }
}
