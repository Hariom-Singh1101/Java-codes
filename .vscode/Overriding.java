class First{
    int x;
    int y;
    void fun1(int p ,int q){
        x=p;
        y=q;
    }
    void display(){
        System.out.println("Value of x is : "+x);
        System.out.println("Value of y is : "+y);
    }
}
class Second extends First{
    void fun1(int p ,int q){
        x=p;
        y=q;
    }

}

class Overriding  {
    public static void main (String[] args){
    Second s1 =new Second();
    s1.fun1(5,7);
    s1.display();
    
}
}