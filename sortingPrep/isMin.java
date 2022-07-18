public class isMin {

    public static int findMin(int[] arr, int startIndex, int lastIndex) {
        int index = startIndex;
        int min = arr[startIndex];
        for (int i = startIndex; i <= lastIndex; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;

            }
            
        }
        return index;
        
    }

    public static void main(String[] args) {
        int[] arr = { 90, 65, 54, 37, 23 };
        int startIndex = 0;
        int lastIndex = 4;
        for (int i = 0; i <= arr.length-1; i++) {

        }
        System.out.println(findMin(arr, startIndex, lastIndex));
    }
}
