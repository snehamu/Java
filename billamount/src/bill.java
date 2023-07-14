public class bill {
    public static void main(String args[]) {
        Discountedbill d=new Discountedbill();
        d.setBill_id(1001);
        d.setCustomer_id(101);
        d.setDiscount(0.02F);
        d.setBill_amount(199.99F);
        System.out.println("Bill Id of Customer:" +d.setBill_id());
        System.out.println("Customer Id of Customer:" +d.setCustomer_id());
        System.out.println("Discounted Bill Amount:" +d.calculatediscountedbillamount());
    }
}
