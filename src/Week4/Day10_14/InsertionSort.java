package Week4.Day10_14;

import java.util.Arrays;

public class InsertionSort {
    /*public void swap(int[]arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        System.out.println("swap");
    }*/
    public int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j;
            int temp = arr[i];
            System.out.println("focus : arr[" + i + "]=" + temp);
            for (j = i; j > 0 && arr[j-1]>temp ; j--) {
                System.out.printf("arr[" + (j-1) + "]=" + arr[j-1] + "\n");
                arr[j] = arr[j-1];
            }
            arr[j] = temp;
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }


    public static void main(String[] args) {
        InsertionSort s = new InsertionSort();
        int arr[] = new int[]{8, 5, 6, 2, 4};
        s.sort(arr);
    }
}