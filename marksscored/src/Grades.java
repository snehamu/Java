import java.util.Scanner;

public class Grades {
    public static void main(String args[]){
        Scanner m = new Scanner(System.in);
        System.out.println("Enter Mark:");
        int mark = m.nextInt();
        if(mark<=100 && mark>=90){
            System.out.println("Grade A");
        }
        else if(mark<90 && mark>=70){
            System.out.println("Grade B");
        }
        else if(mark<=69 && mark>=50){
            System.out.println("Grade C");
        }
        else if(mark<50){
            System.out.println("Fail");

    }
}
