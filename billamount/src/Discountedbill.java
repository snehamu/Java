public class Discountedbill {
    private int bill_id;

    public int getBill_id() {
        return bill_id;
    }

    public void setBill_id(int bill_id) {
        this.bill_id = bill_id;
    }

    private int customer_id;

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    private float discount;

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    private float bill_amount;

    public float getBill_amount() {
        return bill_amount;
    }

    public void setBill_amount(float bill_amount) {
        this.bill_amount = bill_amount;
    }

    public float calculatediscountedbillamount(){
        float discountedBillAmount = bill_amount - bill_amount * (discount/100);
        return discountedBillAmount;
    }

    public int setBill_id() {
        return bill_id;
    }

    public int setCustomer_id() {
        return customer_id;
    }
}
