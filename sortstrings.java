import java.util.*;
public class sortstrings {
    public static void main(String[] args) {
        String arr[]={"ram","ananad","yogesh","nikhil","bandna"};
        for(int i=0;i<arr.length-1;i++){
            int min_idx=i;
            for(int j=i+1;j<arr.length;j++)if((arr[min_idx].compareTo(arr[j]))>0)min_idx=j;
            String temp=arr[min_idx];
            arr[min_idx]=arr[i];
            arr[i]=temp;
        }
        for(String i:arr)System.out.print(i+" ");
    }
}