import java.util.Scanner;

public class ExceptionH2 {
    public static void main (String [] args)
    {
        int cb=10000;
        // int wb=15000;
        System.out.println("Enter amount:");
        Scanner scnr =new Scanner(System.in);
        int wb=scnr.nextInt();
        try{
            if(cb<wb){
                throw new ArithmeticException("Insuffient balance");
            }
        cb=cb-wb;
        System.out.println("Withdraw succesful of " +wb);
        System.out.println("Current Balance is " +cb);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        // scnr.close();    }
    

    }

}