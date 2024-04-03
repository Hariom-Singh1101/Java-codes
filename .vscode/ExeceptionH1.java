public class ExeceptionH1 {
    public static void main(String[] args) {
        System.out.println("A");
        try{
        int x=5/0;
        System.out.println(x);
        }
        catch (ArithmeticException e){

        }
        
        System.out.println("B");
        
    }
}
