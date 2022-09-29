public class Main {
    int value;

    public Main() {
        value = 1;
    }

    public static void main(String[] args) {
        Main myObj = new Main();
        myObj.value = 1;
        System.out.println(myObj.value);
    }
    // public void incrementingValue(Main obj) {
    //     System.out.println("value incremented");
    //      obj.value++;
    //  }
}
