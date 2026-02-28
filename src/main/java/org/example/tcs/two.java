package org.example.tcs;

import java.util.Arrays;

public class two {
    public static void main(String[] args) {
        int[] arr = {4,5,4,7,5};
        int ans = avgOfArray(arr);
        System.out.println(ans);
        int second = largestInArray(arr);
        System.out.println(second);
        System.out.println(Arrays.toString(reverseOfArray(arr)));
    }
    static int avgOfArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int sum  = 0;
        for (int i = 0; i < end; i++) {
            sum= sum +arr[i];
        }
        return sum / end;
    }

    static int largestInArray(int[] arr ){
        int largest = 0;
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i] > arr[largest]){
                largest= i;
            }

        }
        return arr[largest];
    }
    static int[] reverseOfArray(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while (left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }
}
