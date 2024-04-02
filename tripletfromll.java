import java.util.*;
public class tripletfromll {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();  
      int n3=sc.nextInt();  
      int arr1[]=new int[n1];
      for (int i = 0; i < n1; i++) {
        arr1[i]=sc.nextInt();
      }
      int arr2[]=new int[n2];
      for (int i = 0; i < n2; i++) {
        arr2[i]=sc.nextInt();
      }
      int arr3[]=new int[n3];
      for (int i = 0; i < n3; i++) {
        arr3[i]=sc.nextInt();
      }
      int t=sc.nextInt();
      for (int i = 0; i < n1; i++) {
        for (int j = 0; j < n2; j++) {
            for (int k = 0; k< n3; k++) {
                if(arr1[i]+arr2[j]+arr3[k]==t){
                    System.out.print(arr1[i]+" ");
                    System.out.print(arr2[j]+" ");
                    System.out.print(arr3[k]);
                    break;

                }
            }
        }
        
      }
    }
}
