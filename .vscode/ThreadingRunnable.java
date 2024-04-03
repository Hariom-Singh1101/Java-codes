 class First implements Runnable{
    int i;
   public void run(){
        for(i=0;i<10;i++){
            System.out.println("First :"+i);
        }
    }
 }
 class Second implements Runnable {
    int i;
    public void run(){
        for(i=0;i<10;i++){
            System.out.println("Second :"+i);
        }
    }
 }
 class ThreadingRunnable {
    public static void main (String []args){
        First f1=new First();
        Second s2=new Second();
        Thread t1=new Thread(f1);
        Thread t2=new Thread(s2);
        t1.start();
        t2.start();

    }
    
}
