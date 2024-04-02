public class towerofhanoi {

    public static void main(String[] args) {
        toh(2,"Source","destination","helper");
    }
   static  public void toh(int n,String s,String d,String h){
        if(n<=0){
            return;
        }
        toh(n-1,s,h,d);
        System.out.println("disc" +n+" moved from "+s+" to "+d);
        toh(n-1,h,d,s);
    }
}
