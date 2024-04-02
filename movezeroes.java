public class movezeroes {
    public static void main(String[] args) {
        class Solution {
            public void moveZeroes(int[] nums) {
                int n=nums.length;
                int j=1;
                for(int i=0;i<n;i++){
        
                    if(nums[i]==0 && nums[j]!=0){
                        swap(nums,i,j);
                        i++;
                        j++;
                    }
                    else if(nums[i]==0 && nums[j]==0){
                        j++;
                    }
                    else{
                        i++;
                        j++;
                    }
        
                }
            }
            public void swap(int arr[],int i,int j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
}
