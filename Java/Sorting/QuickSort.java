package Java.Sorting;

public class QuickSort {
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    public static int subPartition(int[] arr, int start, int end){
        int pivot = end;
        int pStart = start;
        for (int i = start; i < end; i++) {
            if(arr[i] <= pivot){
                swap(arr, i, pStart);
                pStart++;
            }
            
        }
        //swap pStart with pivot
        swap(arr, end, pStart);
        return pStart;

    }

    public static void quickSort(int arr[] , int start, int end){
        if (start >= end) {
            return;
        }

        int pivot = subPartition(arr, start, end);

        quickSort(arr, start, pivot - 1);
        quickSort(arr, pivot + 1, end);
       
    }
    public static void main(String[] args) {
        int[] arr = {-3, 2, 4, 14, -6, 8, 9};
        quickSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        
    }
    
}
