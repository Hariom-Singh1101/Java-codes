public class Finally {
    public static void main (String[] args){
        System.out.println("A");
        try{
            int x=10/0;
            System.out.println(x);

    }
    catch(ArrayIndexOutOfBoundsException a1){

    }
    finally{
        System.out.println("B");
    }
    
}}
