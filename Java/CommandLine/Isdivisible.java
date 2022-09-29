package CommandlinePrep;

import java.util.ArrayList;

class Isdivisible {
    public static void main(String args[]) {
        ArrayList<String> result = new ArrayList<String>();
        int n = (args.length > 0) ? Integer.parseInt(args[0]) : 0;
        for (int i = 1; i <= n; i++) {if (i % 30 == 0) {
                result.add("FBA");
            } else if (i % 15 == 0) {
                result.add("FB");
            } else if (i % 3 == 0) {
                result.add("F");
            } else if (i % 5 == 0) {
                result.add("B");
            } else {
                String s = String.valueOf(i);
                result.add(s);
            }

        }

        // **************************************** */

        for (n = 0; n <= result.size() - 1; n++) {
            System.out.println((n + 1) + ": " + (result.get(n)));
        }

    }
}
