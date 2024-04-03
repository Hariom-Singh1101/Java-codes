

class Hari{
    int x;
    int y;
  
    Hari(){
        x=10;
        y=20;
        System.out.println("Default constructor");
        System.out.println("value of x is "+ x);
        System.out.println("value of y is "+ y);
    }
    Hari( int a ,int b){

        System.out.println("parameterised constructor with two values");
        System.out.println("value of a is "+ a);
        System.out.println("value of b is "+ b);
    }
    Hari(int a){
        System.out.println("Parameterised constructor with single value");
        System.out.println("value of a is "+ a);
    }
 }
 class CreatConstructor {
    public static void main(String args []){
        Hari h1 = new Hari();
        Hari h2 = new Hari(5,7);
        Hari h3 = new Hari(8);

    }
}
