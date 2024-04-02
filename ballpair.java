import java.util.*;
public class ballpair {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       int total=0;
       for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
            
       }
        for (int i = 0; i <n; i++) {
            int num=arr[i]/2;
            total+=num;
       }
       System.out.println(total); 
    }
}
