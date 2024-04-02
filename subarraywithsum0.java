// import java.util.*;
// public class subarraywithsum0 {
    
//         public static void longestSubarrayWithSumK(int []a) {
//             // Write your code here
//             int len=0;
//             int n=a.length;
//             for(int i=0;i<n;i++){
//                 for(int j=i;j<n;j++){
//                         long sum=0;
    
//                     for(int K=i;K<=j;K++){
//                         sum+=a[K];
//                     }
//                     if(sum==0){
//                         for (int l = i; l <= j; l++) {
//                             System.out.print(a[l]+" ");
//                         }
//                         System.out.println();
                        
//                     }
//                 }
//             }
//         }
    
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i]=sc.nextInt();
//         }
//         longestSubarrayWithSumK(arr);
        
//     }
// }
public class subarraywithsum0 {
    public static void longestSubarrayWithSumK(int []a) {
        long sum=0;
        int max_len=0;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                sum=0;
                for(int l=i;l<=j;l++){
                    sum+=a[l];
                }
                if(sum==0){
                   for(int h=i;h<=j;h++){
                    System.out.print(a[h]+" ");
                   }
                   System.out.println();
                }
            }
        }
}
public static void main(String[] args) {
    int[]a={3,4,-7,3,1,3,1,-4,-2,-2};
    longestSubarrayWithSumK(a);

}
}