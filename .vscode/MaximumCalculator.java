import java.util.Scanner;

public class MaximumCalculator {
    public static void main(String arg[]){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter two numbers to find maximum of two");
        int a = scnr.nextInt();
        int b=scnr.nextInt();
        if(a>b){
            System.out.println("The maximum number is "+a);
        }
        else{
            System.out.println("The maximum number is "+b);
        }
        scnr.close();   
    }
    
}
