import java.util.Stack;
import java.util.*;
public class NextGreater496
{   
    public static int[] nextGreater(int[] nums1,int[] nums2)
    {
        Stack<Integer> st=new Stack<>();
         int[] nxtgrtar=new    int[10001];

         for(int i=nums2.length-1;i>=0;i--)
         {
            while(!st.isEmpty() && st.peek()<=nums2[i])
            {
                st.pop();
            } 
            nxtgrtar[nums2[i]]=st.isEmpty() ? -1:st.peek();
            st.push(nums2[i]);

         }
         for(int i=0;i<nums1.length;i++)
         {
            nums1[i]=nxtgrtar[nums1[i]];
         }
          return nums1;
        }
       

    

    public static void main(String[] args)
    {
        int[] arr1={4,1,2};
        int[] arr2={1,3,4,2};

        int result[]=nextGreater(arr1, arr2);
        System.out.println(Arrays.toString(result));

    }

}