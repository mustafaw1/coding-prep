class checkforLoop2 {
    public static boolean checkingCondition(Integer i) {
        System.out.println("Condition checked");
        return i < 5;
    }

    public static int incrementingValue(Integer i) {
        System.out.println("Value is incremented");
        return i++;
    }

    public static void main(String[] args) {
        for (int i = 0; checkingCondition(i); i++) {
            System.out.println("for loop is executed");
        }
    }

}


