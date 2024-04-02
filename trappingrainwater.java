import java.util.Scanner;


public class trappingrainwater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(rainwater(arr));

        
    }
    static public int rainwater(int arr[]){
        int n=arr.length;
        int left[]=new int[n];
        int right[]=new int[n];
        left[0]=arr[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1], arr[i]);
        }
        right[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],arr[i]);
        }
        int ans =0;
        for(int i=0;i<n;i++){
            ans+=Math.min(right[i],left[i])-arr[i];
        }
         return ans;

    }
}
