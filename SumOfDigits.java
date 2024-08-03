public class SumOfDigits {
    public static void main(String args[]){
        int n=123215;
        int rem=0,total=0;
        while (n!=0) {
            rem=n%10;
            total=total+rem;
            n=n/10;
        }
        System.out.println(total);
    }
}
