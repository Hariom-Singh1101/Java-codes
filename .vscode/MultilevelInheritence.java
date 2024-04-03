 class Class1{
    int a=55;
 }
 class Class2 extends Class1{
    int b=66;
 }
 class Class3 extends Class2{
    int c=98;
    void fun3(){
    System.out.println("a=" +a+ "b= " +b+ "c= " +c);
 }}
 
 class MultilevelInheritence {
    public static void main (String [] args){
        Class3 obj=new Class3();
        obj.fun3();


    }
    
}
