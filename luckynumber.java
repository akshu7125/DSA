import java.util.Scanner;
public class luckynumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int order=0;
        int original=x;
        int compare=x;
        while(x>0){
            x/=10;
            order++;

        }
        System.out.println("order is" +order);
        int ans=0;
        while(original>0){
            
            int digit=original%10;
            ans+= Math.pow(digit,order);
            original/=10;
        }
        if(compare==ans){
            System.out.println("true");

        }
        else System.out.println("false");
    }
}
