public class forloop {
    public static void main(String args[]){
        int num=27, reverse=0;
        for(;num!=0;)
        {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num/10;
        }
        System.out.println("Reverse of 27 is:" +reverse);
    }
}
