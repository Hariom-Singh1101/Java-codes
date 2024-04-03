public class ReverseArray {
    public static void main(String [ ] args)
    {
        int[] arr = {1,2,3,4,5}; 
        int []arr2=new int[5];
     
        for(int i=arr.length-1,j=0;i>=0;i--,j++){
            
            arr2[j]=arr[i];
            
            System.out.print(arr2[j] +" ");
        }
    }
}
