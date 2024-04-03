 class First extends Thread {
    
     public void run(){
        int i;
        for(i=0;i<10;i++){
            System.out.println("First :" +i);
        }
    }
 }
 class Second extends Thread {
    
    public void run(){
        int i;
        for(i=0;i<10;i++){
            System.out.println("Second :" +i);
        }
    }
 }
 class Thrading {
    public static void main(String [] args)
    {
       First f1=new First();
       Second s2=new Second();
       f1.start();
       s2.start();
    }
    
}
