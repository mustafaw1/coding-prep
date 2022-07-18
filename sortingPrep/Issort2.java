import java.util.Random;

public class Issort2 {
    public static int totalcount = 0;
    public static void main(String[] args) {
        for (int numElement = 10; numElement <= 150; numElement+=10) {
            Sort(randArr(numElement, 0, 150));
            System.out.println(numElement+":"+totalcount);
        }
        

    }

    public static int[] randArr(int random, int min, int max) {
        Random random2 = new Random();
        int[] arr = new int[random];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = random2.nextInt(max - min) + min;
            // System.out.println(arr[i]);
        }
        return arr;

    }

    public static int findMin(int[] arr, int startIndex, int lastIndex) {
        
        int index = startIndex;
        int min = arr[startIndex];
        for (int i = startIndex; i <= lastIndex; i++) {
            totalcount+=1;
            if (arr[i] < min) {
                min = arr[i];
                index = i;

            }

        }
      
        return index;
    }
  

    public static void swapIndex(int arr[], int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void Sort(int[] arr) {
        int startIndex = 0;

        for (startIndex = 0; startIndex <= arr.length - 1; startIndex++) {
            swapIndex(arr, startIndex, findMin(arr, startIndex, arr.length-1));
        

        }
    }

}

// public static void Sort(int[] arr) {
// int min;
// int temp = 0;
// for (int i = 0; i < arr.length; i++) {
// min = i;
// for (int j = i + 1; j < arr.length; j++) {
// if (arr[j] < arr[min]) {
// min = j;
// }
// temp = arr[min];
// arr[min] = arr[i];
// arr[i] = temp;

// }
// }
