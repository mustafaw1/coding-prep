package ArrayList;

public class IntArrayList {
    private static final int InitialCapacity = 20;
    private int size = 0;
    private int Data[] = {};

    public IntArrayList() {
        Data = new int[InitialCapacity];
    }

    public IntArrayList(int[] n) {
        Data = n;

    }

    public void addElement(int i) {
        Data[size++] = i;

    }

    public boolean containsElement(int element) {
        for (int i = 0; i < Data.length; i++) {
            if (element == Data[i])
                return true;

        }

        return false;
    }

    public int deleleElement(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bound");
        }

        int removedElement = Data[index];
        for (int i = index; i < size - 1; i++) {
            Data[i] = Data[i + 1];
        }
        size--;

        return removedElement;

    }

    public int getElement(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bound");
        }
        return Data[index];
    }

    public int clearlist() {
        return size = 0;

    }

    public void getSize() {
        System.out.print("Size = " + size);
    }

    public void display() {
        System.out.print("[");
        System.out.print(Data[0]);
        for (int i = 0; i < size - 1; i++) {
            System.out.print(", " + Data[i + 1]);

        }
        System.out.print("]");
    }

    // [12, 443, 66]
    public static void main(String[] args) {
        IntArrayList list = new IntArrayList();
        list.addElement(12);
        list.addElement(443);
        list.addElement(66);
        list.addElement(67);
        list.display();

    }

}
