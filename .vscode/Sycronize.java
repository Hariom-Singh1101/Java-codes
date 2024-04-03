
import java.util.Scanner;
class Account{
    int bal;
    Account(int p){
        bal=p;
    }
    boolean issuficient(int w){
        if(bal>w){
            return true;
        }
        else{
            return false;
        }
    }
    void withdraw(int j,String g1){
        bal-=j;
        System.out.println(g1+ " withdraw succesful " +j);
        System.out.println(g1+ " current balance is :"+bal);
    }
}
    class Customer implements Runnable{
        Account x1;
        String n1;
        Customer(Account d1,String n){
            x1=d1;
            n1=n;
        }
       public void run(){
            Scanner scnr=new Scanner(System.in);
            synchronized(x1){
            System.out.println("Enter ammount to withdraw for "+n1+ ":");
            int amt=scnr.nextInt();
            if(x1.issuficient(amt)){
                x1.withdraw(amt, n1);
            }
            else{
                System.out.println("insufficient amount");
            }
           
        }}
        
    }

 
 class Sycronize {
public static void main (String [] args)    
{
    Account a1=new Account(10000);
    Customer c2=new Customer(a1,"hariom"); 
    Customer c3=new Customer(a1,"prince"); 
    Thread t1 = new Thread(c2);  
    Thread t2 = new Thread(c3);    
    // Start both threads 
    t1.start();                                          
    t2.start();              
}
}
