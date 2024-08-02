import java.util.Scanner;

public class EvenOrOddNumber {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you number");
        int n=sc.nextInt();
        
        
        // Method 1: Using Brute Force

        if(n>0){
            System.out.println("Positive");
        }
        else if(n<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }

        // Method 2: Using Nested if-else Statements
        if(n>=0){
            if(n==0){
                System.out.println("Zero");
            }
            else{
                System.out.println("The number is positive ");
            }
        }
        else{
            System.out.println("The number is Negative");
        }

        // Method 3: Using Ternary Operators
        System.out.println(n>0?"positive":"Negative");


    }
}
