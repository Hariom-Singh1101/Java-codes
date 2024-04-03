class First {
    int x;
    int y;

    void fun1(int p, int q) {
       x=p;
       y=q;
    }

    void fun2(int z) {
         x=z;
    }
    void display(){
        System.out.println("value of x is :" +x);
        System.out.println("value of Y is :" +y);
    }

}

class Overloading {
    public static void main (String[] args) {
     First f1=new First();
     f1.fun1(5, 7);
     f1.fun2(12); 
     f1.display();
}}
