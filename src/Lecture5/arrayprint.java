package Lecture5;

public class arrayprint {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int start = 0;
        int end = arr.length-1;
        for (int j : arr) {
            System.out.print(j);
        }
        System.out.println();
//        reverse(arr,start,end);
        brute(arr);

    }
    public static void brute(int[] arr){
        int[] arr2 = new int[arr.length];
        for (int i = arr.length -1; i>=0; i--){
            arr2[arr.length -i-1] = arr[i];
        }
        for (int i: arr2) {
            System.out.print(i+" ");
        }
    }


    public static void reverse(int[] arr,int start,int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        for (int j : arr) {
            System.out.print(j);
        }
    }
}
