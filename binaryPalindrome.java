import java.util.*;
public class binaryPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        palindromeCheck(n);

    }
    static void palindromeCheck(int num){
        String binary=Integer.toBinaryString(num);
        StringBuilder sc=new StringBuilder(binary);
        if(sc.reverse().toString().equals(binary)){
            System.out.println(num);
        }
        else palindromeCheck(++num);
    }

}
