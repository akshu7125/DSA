import java.util.*;
public class bitmasking {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       String s=Integer.toBinaryString(n);
       StringBuilder ans =new StringBuilder(s);
      for (int i = 0; i < ans.length(); i++) {
        if(i%2!=0){
            if(ans.charAt(i)=='0'){
                ans.setCharAt(i, '1');
            }
            else if(ans.charAt(i)=='1'){
                ans.setCharAt(i, '0');
            }
        }
        
      }
      String m=ans.toString();
      int answer=Integer.parseInt(m,2);
      System.out.println(answer);
    }
}
