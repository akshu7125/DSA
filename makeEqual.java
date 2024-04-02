import java.util.Scanner;
public class makeEqual {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int max=arr[0];
                boolean flag=true;

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 1; i <n; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        for (int i = 0; i <n; i++) {
            if(arr[i]!=max){
                if(arr[i]*2==max){
                   arr[i]= arr[i]*2;
                }
                else if(arr[i]*3==max){
                    arr[i]=arr[i]*3;
                }
                else {flag=false;break;}
            }
        }
        // for (int i = 0; i < n; i++) {
        //     if(arr[i]!=arr[0]){
        //        flag=false;
        //     }
           
        // }
        if(flag==true){
            System.out.println("true");
        }
        else System.out.println("false");
    }
}
