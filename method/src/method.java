public class method {

   static String display(String name){

        System.out.println(name);
       return name;
    }
    public method(){
        System.out.println("This a a default Constructor");
    }
    String name;
   int age;
   public method(String name, int age){
       this.name=name;
       this.age=age;
   }
    public static void main(String[] args) {
        /*display("Hi");
        System.out.println(display("hi"));*/

        method m=new method("Sneha", 23);
        m.name="Sneha";
        m.age=23;
        System.out.println("My name is" +m.name);

    }
}
