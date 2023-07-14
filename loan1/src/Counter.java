public class Counter {

    public static void main(String[] args){
        Loan l= new Loan();
        l.setLoan_no(5);
        l.setAccount_no(10005);
        l.setCustomer_no(7);
        l.setLoan_amount(50.5F);
        l.setLoan_duration(3);
        l.setInterest(2.5F);
        System.out.println(Loan.Loan_counter);
        System.out.println("Loan number of Customer:" +l.getLoan_no());
        System.out.println("Account number of Customer:" +l.getAccount_no());
        System.out.println("Customer number of Customer:" +l.getCustomer_no());
        System.out.println("Loan amount of Customer:" +l.getLoan_amount());
        System.out.println("Loan duration of Customer:" +l.getLoan_duration());
        System.out.println("Interest of Customer:" +l.getInterest());
    }
}
