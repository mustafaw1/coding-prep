package Java.Sorting;

public class count1 {
    public static int hamingWeight(int n) {
        int count = 0;
        while(n > 0){
            count += (n & 1);
            n = n >>1;  
        }
        return count;

    }
        
        

    
    public static void main(String[] args) {
        int n = 1111111110;
        System.out.print(hamingWeight(n));
    }

}
