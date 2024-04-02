// public class histogram {
//     public static void main(String[] args) {
        
//     }
//     public int largestrectangle(int arr[]){
//         int n=arr.length;
//         int [] left=new int[n];
//         int prev=previousSmaller( arr,n);
//         int [] right =new int[n];
//         int  next=nextsmaller(arr, n);
//         int area=Math.min()

//     }
//     public int previousSmaller(int[] arr,int n);
//     public int nextsmaller(int[] arr,int n);

// }
    import java.util.*;

public class histogram{
// Brute Force Approach to find largest rectangle area in Histogram
//public class Main {
    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack < Integer > st = new Stack < > ();
        int leftSmall[] = new int[n];
        int rightSmall[] = new int[n];
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            if (st.isEmpty()) leftSmall[i] = 0;
            else leftSmall[i] = st.peek() + 1;
            st.push(i);
        }

        // clear the stack to be re-used
        while (!st.isEmpty()) st.pop();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            if (st.isEmpty()) rightSmall[i] = n - 1;
            else rightSmall[i] = st.peek() - 1;

            st.push(i);
        }

        int maxA = 0;
        for (int i = 0; i < n; i++) {
            maxA = Math.max(maxA, heights[i] * (rightSmall[i] - leftSmall[i] + 1));
        }
        return maxA;

    }
    public static void main(String args[]) {
        int arr[] = {2, 1, 5, 6, 2, 3, 1};
        int n = 7;
        System.out.println("The largest area in the histogram is " + 
        largestRectangleArea(arr)); 

    }
}
