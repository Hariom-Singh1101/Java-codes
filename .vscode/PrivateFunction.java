class Hariom{
    int x;
    private static int y;
    void fun1(){
        x=5;
    }

   static void fun2(){
        
        y=55;
    }
    void fun3(){
        System.out.println("Value of x is : "+x);
        System.out.println("value of y is : " +y);
    }
}
 class PrivateFunction {
    public static void main(String []args){
        Hariom h1 =new Hariom();
        h1.fun1();
        Hariom.fun2();
        h1.fun3();

    }
    
}
