
import java.util.Random;

public class generateRandom {
  
   public static int randomNumber(int max,int min){
   
    Random random = new Random();
    for (int i = 0; i < 20; i++) {
        int x = random.nextInt(max - min) + min;
        System.out.println(x);
        
    }
    return random.nextInt(max - min) + min;
   }


   public static int[] randArr(int random, int max, int min){
     Random random2 = new Random();
     int[] arr = new int[random];
     for (int i = min; i < max; i++) {
        arr[i] = random2.nextInt(max-min) + min;
        System.out.println(arr[i]);
     }
    return arr;
    
     




   }
    public static void main(String[] args) {
        // int  max = 100;
        // int min =  0;
        // randomNumber(max, min);
        int random = 5;
        int min = 0;
        int max = 100;
       System.out.println(randArr(random, max, min));
       
       
    }

}
