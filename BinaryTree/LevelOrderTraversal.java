import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

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
    static class Binary
    {
         static int i=-1;
        public static Node  buildBinary(int nodes[])
        {
            i++;
            if(nodes[i]== -1)
            {
                return null;
            }
            Node newNode=new Node(nodes[i]);
            newNode.left=buildBinary(nodes);
            newNode.right=buildBinary(nodes);
            return newNode;

        }
        public static void levelOrder(Node root)
        {
            if(root==null)
            {
                return;
            }

            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while(! q.isEmpty())
            {
                Node curr=q.remove();

                if(curr==null)
                {
                    System.out.println();
                    if(q.isEmpty())
                    {
                        break;
                    }
                    else
                    {
                        q.add(null);
                    }
                }
                else
                {
                    System.out.println(curr.data+"");
                    if(curr.left != null)
                    {
                        q.add(curr.left);
                    }
                    if(curr.right != null)
                    {
                        q.add(curr.right);
                    }
                }
                
            }

        }

        public static void main(String[] args)
        {
            int nodes[]={1, 2, 5, -1, -1, -1, 8, -1, -1};
            Binary b=new Binary();
            Node root=b.buildBinary(nodes);
            b.levelOrder(root);
            // System.out.println();
            // System.out.println(root.data);
        } 
    }
    
}
