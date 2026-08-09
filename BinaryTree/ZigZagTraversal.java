import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagTraversal {

    static class Node
    {
        int data;
        Node left,right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;

        }
    }
static class BinaryTrees
{
     static int i=-1;
    public static Node buildTree(int nodes[])
    {
        i++;
        if(nodes[i]==-1)
        {
            return null;
        }
        Node newNode=new Node(nodes[i]);
        newNode.left=buildTree(nodes);
        newNode.right=buildTree(nodes);
        return newNode;


    }
    public static List<List<Integer>> zigzag(Node root)
    {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null)
        {
            return result;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        boolean ltr=true;

        while(!q.isEmpty())
        {
            int n=q.size();
            List<Integer> ans=new ArrayList<>();

            for(int i=0;i<n;i++)
            {
                Node curr=q.remove();
                

                if(ltr)
                {
                    ans.add(curr.data);
                }
                else
                {
                    ans.add(0,curr.data);
                }
                if(curr.left !=null) q.add(curr.left);
                if(curr.right !=null) q.add(curr.right);
            }
result.add(ans);
        ltr=!ltr;
        }
        return result;

    }
    
    public static void main(String [] args)
    {
        int nodes[]={1, 2, 5, -1, -1, -1, 8, -1, -1};
        BinaryTrees bt=new BinaryTrees();
    Node root=        bt.buildTree(nodes);
     List<List<Integer>> bottomUp = bt.zigzag(root);
     for(List<Integer> n:bottomUp)
     {
        System.out.println(n);
     }

    

    }
}

    
}
