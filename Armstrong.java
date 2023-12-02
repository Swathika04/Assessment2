import java.util.Scanner;
public class Armstrong{
    public static void main(String[]args){
        int i=1,a,arm=0,n,temp;
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the number:");
        n =sc.nextInt();
        temp=n;
        for(;n!=0;n/=10){
            a =n%10;
            arm =arm+(a*a*a);
        }
        if(arm == temp){
            System.out.print(temp+ "is Armstrong number");
        }else{
            System.out.print(temp+ "is not Armstrong number");
    }


}
}
