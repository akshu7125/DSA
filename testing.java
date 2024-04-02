import java.util.*;

public class testing {

    static  void  subsequence(String p , String up)
    {
        if(up.length() == 0)
        {
            StringBuilder sb = new StringBuilder(p);
            sb.reverse();
            System.out.println(sb);
            return;
        }
        char ch = up.charAt(0);
        subsequence(p , up.substring(1)); //not take ch
        subsequence(p+ch , up.substring(1)) ; //take ch


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder tb = new StringBuilder(a);
        tb.reverse();
        String s = new String(tb);
        subsequence("" , s);
    }
}


