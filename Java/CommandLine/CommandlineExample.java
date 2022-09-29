// import java.util.ArrayList;

public class CommandlineExample {
    public static void main(String args[]) {
        int n = (args.length > 0) ? Integer.parseInt(args[0]) : 0;
        

        for (n = 0; n < args.length; n++) {

            System.out.println(args[n]);
            // System.out.println(result);
        }
        

    }

}
