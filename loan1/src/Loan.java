public class Loan {

    private int Loan_no;
    private  int Account_no;
    private int Customer_no;
    private float Loan_amount;
    private int Loan_duration;
    private float Interest;

    static int Loan_counter=0;

    public int getLoan_no() {
        return Loan_no;
    }

    public void setLoan_no(int loan_no) {
        Loan_no = loan_no;
    }

    public int getAccount_no() {
        return Account_no;
    }

    public void setAccount_no(int account_no) {
        Account_no = account_no;
    }

    public int getCustomer_no() {
        return Customer_no;
    }

    public void setCustomer_no(int customer_no) {
        Customer_no = customer_no;
    }

    public float getLoan_amount() {
        return Loan_amount;
    }

    public void setLoan_amount(float loan_amount) {
        Loan_amount = loan_amount;
    }

    public int getLoan_duration() {
        return Loan_duration;
    }

    public void setLoan_duration(int loan_duration) {
        Loan_duration = loan_duration;
    }

    public float getInterest() {
        return Interest;
    }

    public void setInterest(float interest) {
        Interest = interest;
    }

    public Loan(){
        Loan_counter++;
    }

    public int incrementLoans(){
        return Loan_counter++;
    }

    public int setLoan_no() {
        return Loan_no;
    }

    public int setAccount_no() {
        return Account_no;
    }

    public int setCustomer_no() {
        return Customer_no;
    }

    public float setLoan_amount() {
        return Loan_amount;
    }

    public int setLoan_duration() {
        return Loan_duration;
    }

    public float setInterest() {
        return Interest;
    }
}