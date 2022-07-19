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

    public boolean contains(int element) {
        for (int i = 0; i < Data.length; i++) {
            if(element == Data[i])
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

    public int getSize() {
        return Data[size];
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(Data[i] + " ");
        }
    }

    public static void main(String[] args) {
        IntArrayList list = new IntArrayList();
        list.addElement(5);
        list.addElement(9);
        list.addElement(10);
        list.deleleElement(2);
        list.display();
        

    }

}
