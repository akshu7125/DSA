import java.util.*;
public class rotate {
    public static void rotate(int[] nums, int k) {
        int n=nums.length;
        k=n%k;
        rottate(nums,0,n-k-1);
        rottate(nums,n-k,n-1);
        rottate(nums,0,n-1);
    }
    public static void rottate(int[] nums,int i,int j){
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    public static void swap(int arr[],int i,int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(rotate(nums,k));
    }
}