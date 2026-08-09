import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        Queue<Integer> queue=new LinkedList<>();
        int index=0;
        while(index<k)
        {
            if(arr[index]<0)
            {
                queue.offer(arr[index]);
                
            }
            index++;
        }
        
        List<Integer> res=new ArrayList<>();
        res.add(queue.isEmpty() ?0:queue.peek());
        
        for(int i=1;i<=arr.length-k;i++)
        {
            if(arr[i-1]<0)
            {
                queue.remove();
            }
            if(arr[i+k-1]<0)
            {
                queue.offer(arr[i+k-1]);
            }
            res.add(queue.isEmpty() ?0:queue.peek());
        }
        
        return res;
    }


    public static void main(String[] args) {
        int arr[]={12,-1,-7,8,-15,30,16,28};
        List<Integer> ans=firstNegInt(arr, 03);
        System.out.println(ans);
    }
}