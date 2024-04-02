import java.util.*;
public class kfromlast {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       ArrayList<Integer> list=new ArrayList<>();
       int num=0;
        while((num=sc.nextInt())!=-1){
            list.add(num);
        }
        System.out.println(list.size());
        int n=sc.nextInt();
        System.out.println(list.get(list.size()-n));
        
    }
}
