import java.util.Scanner;
public class multiple {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        {
            System.out.println("Enter a number:");
          int num = s.nextInt();
          for(int i=1; i<=10; i++){
              System.out.printf("%d * %d = %d \n", num, i, num*i);
          }
        }
    }
}
