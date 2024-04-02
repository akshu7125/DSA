import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class kfreqcharacter{
    public static void main(String[] args) {
        int arr[]={2,1,2,3,1,1,3,20};
        int k=2;
        kfrequent(arr, k);

    }
    static class Pair{
        int element;
        int frequency;
        public Pair(int element,int frequency){
            this.element=element;
            this.frequency=frequency;
        }
    }
    public static void kfrequent(int[] arr, int k){
        int n=arr.length;
        Map<Integer,Integer> mp=new HashMap<>();
        for (int i = 0; i < n; i++) {
            mp.put(arr[i],mp.getOrDefault(arr[i], 0)+1);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>(Comparator.comparingInt((Pair p)->-p.frequency));
        for(Map.Entry<Integer,Integer> set:mp.entrySet()){
            Pair p=new Pair(set.getKey(),set.getValue());
            pq.add(p);        
        }
        while(k!=0){
            System.out.println(pq.poll().k+" ");
            k--;
        }


    }
}