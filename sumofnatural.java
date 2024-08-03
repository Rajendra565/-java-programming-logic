public class sumofnatural {
    public static void main(String[] args) {
        int number=12;
        int sum=0;

        // Using for loop
        for(int i=1;i<=number;i++){
            sum+=i;
        }
        System.out.println(sum);

        // Method 2: Using Formula for the Sum of Nth Term
        System.out.println(number*(number+1)/2);
    }
    
}
