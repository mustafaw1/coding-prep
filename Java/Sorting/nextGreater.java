package Java.Sorting;

public class nextGreater {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            boolean isEqual = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j])
                    isEqual = true;
                if (isEqual && nums1[i] < nums2[j]) {
                    result[i] = nums2[j];
                    isEqual = false;
                    break;
                }
            }
            if (isEqual)
                result[i] = -1;

        }
        return result;
    }

    public static void main(String[] args) {
        int[] num1 = { 4, 1, 2 };
        int[] num2 = { 1, 3, 4, 2 };
        System.out.println(nextGreaterElement(num1, num2).toString());

    }

}
