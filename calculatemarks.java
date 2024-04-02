// import java.net.SocketTimeoutException;
// import java.util.*;
// public class calculatemarks {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         char arr[][]=new char[n][10];
//         char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
//         for (int i = 0; i <n; i++) {
//             for (int j = 0; j <10; j++) {
//                 arr[i][j]=sc.next().charAt(0);
//             }
            
//         }
//          for (int i = 0; i <n; i++) {
//             int count=0;
//             for (int j = 0; j <10; j++) {
//                if(arr[i][j]==keys[j]){
//                 count++;
//                }
//             }
//             System.out.println(count);
           
//         }

        
//     }
// }
import java.util.*;
public class calculatemarks {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    char arr[][]=new char[num][10];
    char arr1[]={'D','B','D','C','C','D','A','E','A','D'};
    int count=0;

    for(int i=0;i<num;i++){
          for(int j=0;j<10;j++){
            arr[i][j]=sc.next().charAt(0);
        }
    }
    for(int i=0;i<num;i++){
        count=0;
        for(int j=0;j<10;j++){
            if(arr[i][j]==arr1[j]){
                count++;
            }
        }
        System.out.println(count);
    }}}
