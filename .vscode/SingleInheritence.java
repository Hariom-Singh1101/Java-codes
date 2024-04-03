class Hari{
    int x;
    int y;
    // void setValue(int p,int q){
    //     x=p;
    //     y=q;
    // }
    // void display(){
    //  System.out.println("x = " + x + ", y = " + y);
    // }
    Hari(int p,int q){
        x=p;
        y=q;
        System.out.println("Constructer called");
        System.out.println("x = " + x + ", y = " + y);
    }
   
}
class Om extends Hari{
   
 
    int z =11;
    void fun3(){
    System.out.println(z+ " "+ x + " " +y);
}
Om(){
    super(11,12);
    System.out.println("Constructer 2 called");
}
}
class SingleInheritence {
    public static void main (String[] args) {
      Om o1 = new Om();
    //   o1.setValue(5,7);
      o1.fun3();   
}
}