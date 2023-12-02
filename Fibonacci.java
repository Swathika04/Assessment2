import java.util.Scanner;
public class Fibonacci{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the n value: ");
        int n = sc.nextInt();
        int [] fib = new int[n];
        fib[1]=1;
        fib[0]=0;
        for(int i = 2;i<n;i++){
            fib[i] = fib[i-1]+fib[i-2];
            System.out.print("reverse the Fibonacci number" +n+ ":");
        }
        for(int i=n-1;i>=0;i--){
            System.out.print(fib[i]+ " ");
        }
        sc.close();
    }
}
