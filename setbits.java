import java.util.*;
public class setbits {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int count=0;
      for(int i=1;i<=n;i++){
        String s=Integer.toBinaryString(i);
        for (int j = 0; j <s.length(); j++) {
            if(s.charAt(j)=='1'){
                count++;
            }
        }
      }
              System.out.println(count);
  
    }
}
