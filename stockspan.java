public class stockspan {
    public static void main(String[] args) {
        int arr[]={100,80,60,70,60,75,85};
        int days;

        for(int i=0;i<=6;i++){
         days=0;

            for(int j=i;j>=0;j--){
                if(arr[i]>=arr[j]){
                    days++;
                }
                else{break;}

            }
           System.out.print(days+" ");

        }
    }
}
