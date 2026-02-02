import java.util.Stack;

public class nxtGreator {

    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,3};
        Stack<Integer>s=new Stack<>();
        int nextgreator[] = new int[arr.length];

        for(int i=arr.length-1;i>=0;i--)
        {

            while( !s.isEmpty() && arr[s.peek()]<=arr[i])
            {
                s.pop();
            }

            if(s.isEmpty())
            {
                nextgreator[i]=-1;
            }
            else
            {
                nextgreator[i]=arr[s.peek()];
            }
            s.push(i);
        }
        for(int i=0;i<nextgreator.length;i++)
        {
            System.out.println(nextgreator[i]+"");
        }
        System.out.println();
    }
    
}
