public class PermanentEmployee extends Employee{
    private double basicpay;
    private double hra;
    private int experience;
    PermanentEmployee(double basicpay, double hra, int experience){
        this.basicpay=basicpay;
        this.hra=hra;
        this.experience=experience;
    }

    public double getBasicpay() {
        return basicpay;
    }

    public void setBasicpay(double basicpay) {
        this.basicpay = basicpay;
    }

    public double getHra() {
        return hra;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getVariablecomponent() {
        return variablecomponent;
    }

    public void setVariablecomponent(int variablecomponent) {
        this.variablecomponent = variablecomponent;
    }

    public void calculateSalary(double basicpay, double hra, int experience, int variablecomponent){
        int variablecomponent =
        double salary = variablecomponent + basicpay + hra;

    }
}
