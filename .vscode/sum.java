import java.util.Scanner;

class sum {
    public static  void main(String[] args) {
        Scanner scnr= new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=scnr.nextInt();
        System.out.println("Enter the second number:");
        int b=scnr.nextInt();
        int sum=a+b;
        System.out.println("The Sum Of "+a+" And "+b+ "  b is " + sum );


      scnr.close();
}
}