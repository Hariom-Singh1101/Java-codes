 abstract class First{ //you can't create the object of the abstract class but u can access it
    int x=11;         // by creating a child class of this abstract class 
    int y=12;         // Note: we can create a constructor of abstract class
    void fun1(){
        System.out.println("Value of x is :"+x);
        System.out.println("Value of y is :"+y);
    }
    // First(int p,int q){
    //     x =p ;  
    //     y =q;
    // }
 }
 class Second extends First{
    // Second(){
    //     super(50,60);     // calling the constructor of the parent class using super
    // }
 }
 class Abstract1 {
    public static void main(String [] args){
        Second s2 = new Second();
        s2.fun1();

    }
    
}
