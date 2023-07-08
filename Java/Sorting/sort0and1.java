package Java.Sorting;

public class sort0and1 {
    public static int[] sortzeroandOne(int[] arr) {
        int i = 0;
        int j = arr.length -1;
        while(i < j){
            if(arr[i] == 1){
                if(arr[j] == 0){
                    arr[i] = 0;
                    arr[j] = 1;
                }
                j--;
            }
            else{
                i++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 1, 0, 1, 1, 0 };
        sortzeroandOne(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            
        }

    }

}
