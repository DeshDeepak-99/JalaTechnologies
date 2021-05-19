import java.util.*;

public class Main {

    public static boolean findIndex(int arr[], int t) {

        int len = arr.length;
        int i = 0;

        while (i < len) {

            if (arr[i] == t) {
                return true;
            } else {
                i = i + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = { 5, 4, 6, 1, 3, 2, 7, 8, 9 };

        System.out.println(findIndex(array, 12));

    }

}