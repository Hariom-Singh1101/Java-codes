import java.util.Scanner;

class Averge1 {
    // public static void main(String [] args){
    // int i,n,sum=0;
    // n=10;
    // for(i=0;i<n;i++){
    // sum+=i;

    // }
    // System.out.println(sum/n);
    // }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter The Number:");
        int n = scnr.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;

        }
        System.out.println(sum / n);
        scnr.close();
    }

}
