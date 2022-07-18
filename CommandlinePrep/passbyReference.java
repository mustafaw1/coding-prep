public class passbyReference {
    public static void main(String[] args) {
        int x = 0;
        incrementNumber(x);
        System.out.println(x);
    }

    public static void incrementNumber(int x) {
        x += 1;
    }
}