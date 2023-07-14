import java.util.Scanner;
public class Ifelse {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = s.nextInt();
        if ((num%2 != 0) || (num%2 == 0) && (num >= 6 && num <= 20)){
            System.out.println("Weird");
        }
        else if((num%2 == 0) && (num >= 2 && num <= 5) || (num%2 == 0) && (num >= 20)){
            System.out.println("Not Weird");
        }
    }
}
