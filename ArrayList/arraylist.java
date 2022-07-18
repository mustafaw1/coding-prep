import java.util.ArrayList;

public class arraylist {
    static ArrayList<Integer> intarr = new ArrayList<Integer>();

    public static void addElement(int i) {
        intarr.add(i);

    }

    public static void delele(int i) {
        intarr.remove(i);
    }

    public static void getElement(int i) {
        intarr.get(i);
    }

    public static void clearlist() {
        intarr.clear();
    }

    public static void returnLastindex(int i) {
        intarr.lastIndexOf(i);
    }

    public static void returnSize() {
        intarr.size();
    }

    public static void main(String[] args) {
        arraylist.addElement(5);
        arraylist.addElement(4);
        arraylist.addElement(3);
        arraylist.addElement(6);
        arraylist.returnSize();
    }

}
