package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class MinMaxArray {

    public static void main(String[] args) {
        int arr[] = {256741038, 623958417, 467905213, 714532089, 938071625};
        System.out.println("manual solution");
        miniMaxSum(arr);
        System.out.println("internet solution");
        MinMaxFromInternet(arr);

    }

    private static void MinMaxFromInternet(int[] arr) {
        sortArray(arr);
        List<Long> a = new ArrayList<>();
        for (int i = 0; i < 5; i++)
            a.add(Long.valueOf(arr[i]));
        long min = a.stream().mapToLong(f -> f).min().getAsLong();
        long max = a.stream().mapToLong(f -> f).max().getAsLong();
        long sum = a.stream().mapToLong(f -> f).sum();

        System.out.println("Min :" + (sum - max) + " " + "Max :" + (sum - min));
    }

    static void miniMaxSum(int[] arr) {
        sortArray(arr);
        long min = 0;
        long max = 0;
        long total = 0;
        for (int i = 0; i <= arr.length - 1; i++)
            total += arr[i];

        for (int i = 0; i <= arr.length - 1; i++) {
            min = total - arr[i];
            if (min > max)
                max = min;
        }
        System.out.println("Min :" + min + " " + "Min :" + max);

    }

    static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index])
                    index = j;
            }
            if (index != i) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
