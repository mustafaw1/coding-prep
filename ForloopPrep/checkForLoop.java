class checkforLoop {
    public static boolean checkingCondition(Myvalue Myobj) {
        System.out.println("Condition checked");
        return Myobj.value < 5;
    }

    public static int incrementingValue(Myvalue Myobj) {
        System.out.println("Value is incremented");
        return Myobj.value++;
    }

    public static void main(String[] args) {
        Myvalue Myobj = new Myvalue();
        for (Myobj.value = 0; checkingCondition(Myobj); incrementingValue(Myobj)) {
            System.out.println("for loop is executed");
        }
    }

}

class Myvalue {
    int value;

    Myvalue() {
        value = 0;
    }
}
