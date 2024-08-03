public class GreatestThreeNumber {
  public static void main(String[] args) {
    
  
        int a=1;
        int b=10;
        int c=3;
        // ----------method 1------------


        // int big=a;
        // if(big<b){
        //     big=b;
        // }
        // else if(big<c){
        //     big=c;
        // }
        // System.out.println(big);



        //----------------Method 2----------
        if(a>=b&&a>=c){
            System.out.println("a is Greatest number ="+a);
        }
        else if(b>=a&&b>=c){
            System.out.println("b is Greatest number ="+b);
        }
        else if(c>=a&&c>=b){
            System.out.println("c is Greatest number ="+c);
        }
    }
}
