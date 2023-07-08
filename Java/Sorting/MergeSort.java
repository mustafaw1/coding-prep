package Java.Sorting;

import java.util.Arrays;

class MergeSort {
    public static void mergeSort(int[] arr, int[] temparr, int left , int right){
        if(left == right){
            return;
        }

        int mid = (left + right) / 2;

        mergeSort(arr, temparr, left, mid);//split the left half
        mergeSort(arr, temparr, mid + 1, right);//split the riht half
        merge(arr, temparr, left, mid, right);// merge the two half
    }

    public static void merge(int[] arr, int[] temparr, int left, int mid, int right){
        int k = left; // index where we will write to the temparr 
        int i = left;
        int j = mid + 1;
        while(i <= mid && j <= right)
        {
            if(arr[i] <= arr[j]){
                temparr[k++] = arr[i++];
            }
            else{
                temparr[k++] = arr[j++];
            }
        }
        
        while(i <= mid){//copy the remaining element from the left half into the temp array
            temparr[k++] = arr[i++];
        }

        for(i = left; i <= right; i++) {// copy the remaining elements from the right half into temp array
           arr[i] = temparr[i]; 
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 10, 4, 5, -6, 7, 15, 3 };
        int[] temparr = Arrays.copyOf(arr, arr.length);
        mergeSort(arr, temparr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }

}
