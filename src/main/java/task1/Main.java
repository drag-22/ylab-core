package task1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] array = new int[10][10];
        fill(array);
        System.out.println(Arrays.deepToString(array));
    }

    public static void fill(int[][] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = (int) (Math.random() * 2001 - 1000);
    }


    public static int max(int[][] arr) {
        var max = Integer.MIN_VALUE;
        for (int[] ints : arr)
            for (int anInt : ints)
                if (anInt > max)
                    max = anInt;
        return max;
    }

    public static int min(int[][] arr) {
        var min = Integer.MAX_VALUE;
        for (int[] ints : arr)
            for (int anInt : ints)
                if (anInt < min)
                    min = anInt;
        return min;
    }

    public static double avg(int[][] arr) {
        int sum = 0;
        var n = arr.length * arr[0].length;
        for (int[] ints : arr)
            for (int anInt : ints)
                sum += anInt;
        return (sum + 0.) / n;
    }
}