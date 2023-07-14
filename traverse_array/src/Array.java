public class Array {
    int[] arr = new int[5];
    public void myMethod(int arr){
        arr[0] = 90;
        arr[1] = 70;
        arr[2] = 75;
        arr[3] = 80;
        arr[4] = 85;
    }
    public void methodArray(){
        for(int i=0; i<arr.length; i++)
            System.out.println(arr[i]);
    }
}
