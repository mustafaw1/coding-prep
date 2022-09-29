class Discount {
       public static void main(String[] args) {
      
        double originalprice = Double.parseDouble(args[0]);

        double discount = Double.parseDouble(args[1]);

        double s = 100 - discount;

        double Finalamount = (s * originalprice) / 100;

        System.out.println(Finalamount);
        
    }

}
