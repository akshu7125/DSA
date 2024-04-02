import java.util.*;
public class maxconsecutive1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int[] arr=new int[input];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int count=0;
        int maxcount=0;
        for (int i = 0; i < arr.length; i++) {
           if(arr[i]==1){
            count++;
           }
           else{
            maxcount=Math.max(maxcount, count);
            count++;
           }
        }
        System.out.println(maxcount);
    }
}
