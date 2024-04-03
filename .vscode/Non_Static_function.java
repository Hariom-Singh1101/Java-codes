class Hariom{
    void fun1(){
        System.out.println("I am in fun1() method");
    }
    void fun2(){
        System.out.println("I am in fun2() method");
    }
}


class Non_Static_function {
    public static void main(String[] args) {
        // Creating object of the class "Non_Static_function"\
  
         Hariom e1=new Hariom();
        e1.fun1();
        e1.fun2();

    }
    
}
