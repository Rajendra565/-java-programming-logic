import java.util.Scanner;


public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=9;
        int counter=0;
        for(int i=1;i<=number;i++){
            if(number%1==0){
                counter++;
            }
        }
        if(counter==2){
            System.out.println("prime number");
        }
        else{
            System.out.println("Not prime number");
        }
    }
}
