public class Confectionary {
    public static void main(String[] args) {
        Chocolate c=new Chocolate();
        c.setBarcode(190499);
        c.setName("Dairymilk");
        c.setWeight(100);
        c.setCost(40);
        System.out.println("Barcode of Chocolate:" +c.getBarcode());
        System.out.println("Name of Chocolate:" +c.getName());
        System.out.println("Weight of Chocolate:" +c.getWeight());
        System.out.println("Cost of Chocolate:" +c.getCost());
    }
}
