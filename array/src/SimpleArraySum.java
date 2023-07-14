public class SimpleArraySum {
    int sum=0;

    int calculateSum(int arr[]){
        for(int i=0; i<arr.length; i++)
            sum += arr[i];
        return sum;
    }

    public static void main(String[] args){
        SimpleArraySum a = new SimpleArraySum();
        int arr[] = new int[]{1, 2, 3, 4, 5};
        System.out.println("The sum of array is " + a.calculateSum(arr));
    }
}
