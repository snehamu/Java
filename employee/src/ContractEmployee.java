public class ContractEmployee extends Employee{
    private double wages;
    private int hours;
    ContractEmployee(double wages, int hours){
        this.wages=wages;
        this.hours=hours;
    }
    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        this.wages = wages;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void calculateSalary(double wages, int hours){
        double salary = hours * wages;
    }
}
