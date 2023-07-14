public class EmployeeRecord {

    public static void main(String[] args) {

        double salary[] = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};
        int length = salary.length;
        int sum = 0;
        int count=0;
        for (int i = 0; i < salary.length; i++)
            sum += salary[i];
        double average = sum / length;
        System.out.println("The average salary of the employee is: "+average);

        for (int i=0; i < salary.length; i++)

            if(salary[i] > average) {
                count++;
            }
                System.out.println("The number of employees having salary greater than the average is: "+count);


      count=0;
        for (int i=0; i < salary.length; i++)
        if(salary[i] < average) {
            count++;
        }
            System.out.println("The number of employees having salary lesser than the average is: " +count);

    }

}
