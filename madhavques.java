import java.util.*;
public class madhavques {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=1;
        while(n>0){
            int num=3*k+2;
            if(num % m !=0){
                System.out.println(num);
               n--;
            }
           k++;
            
        }
    }
}
