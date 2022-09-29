package sortingPrep;

class Pair<T> {
    public T x;
    public T y;

}

public class TwoSum {
    private static Pair twoSum(int[] arr, int target, Pair pair) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    pair.x = i;
                    pair.y = j;
                }
            }
        }
        return pair;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 4, 0, 7, 10, 16, 8, 9, 6 };
        int target = 20;
        Pair pair = new Pair();
        twoSum(arr, target, pair);
        System.out.println("(" + pair.x + "," + pair.y + ")");
    }

}
