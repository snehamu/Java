public class Confectionary {

    public static void main(String[] args) {
        Chocolate c=new Chocolate(190499, "Dairymilk", 100, 40 );
        System.out.println("Barcode of Chocolate:" +c.getBarcode());
        System.out.println("Name of Chocolate:" +c.getName());
        System.out.println("Weight of Chocolate:" +c.getWeight());
        System.out.println("Cost of Chocolate:" +c.getCost());
    }
}
