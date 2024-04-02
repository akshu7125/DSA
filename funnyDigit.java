import java.util.Scanner;
public class funnyDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            for (int i = n; i>0; i--) {
                boolean flag=true;

                String s=Integer.toString(i);
                for (int j = 1; j < s.length(); j++) {
                    if(s.charAt(j)<s.charAt(j-1)){
                       // break;
                      flag=false;
                      break;
                    }
                }
                if(flag==true){
                    System.out.println(i);
                    break;
                }
               // else n--;
            }
          t--;
        }
    }
}
