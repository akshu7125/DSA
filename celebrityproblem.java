// import java.util.Scanner;


// public class celebrityproblem {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     int m=sc.nextInt();
//     int arr[][]=new int[m][n];
//     for(int i=0;i<n;i++){
//         for(int j=0;j<n;j++){
//             arr[i][j]=sc.nextInt();
//         }
//     }
//      for(int i=0;i<n;i++){
//         for(int j=0;j<n;j++){
//             System.out.print(arr[i][j]+" ");
//         }
//         System.out.println(" ");
//     }
   
//      for(int i=0;i<n;i++){
//         for(int j=0;j<n;j++){
//             System.out.print(arr[i][j]+" ");
//         }
//         System.out.println(" ");
//     }
   
//     }
//     }
    

import java.util.*;

public class celebrityproblem {
    //guessing the celebrity
 public static void main(String[] args) {
       int n=3;
    Scanner sc=new Scanner(System.in);
    int[][]arr=new int[n][n];
    boolean flag=true;
    int k=0;
    for(int i=0;i<n;i++){
      
        for(int j=0;j<n;j++){
            arr[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<n;i++){
           flag=true;
        for(int j=0;j<n;j++){
            if(arr[i][j]!=0){
              flag=false;
              break;
            }
        }
        if(flag==true){
            k=i;
            break;
        }
      }
      for(int i=0;i<n;i++){
        if(i==k){
          continue;
        }
        else{
          if(arr[i][k]!=1){
                flag=false;
            }
        }
      }
      if(flag==true){
        System.out.println("celebrity"+ k);
      }
      else{
        System.out.println("not celebrity");
      }
 }
}