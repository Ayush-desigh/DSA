public class Klevel {

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

    public static void kthlevel(Node root,int level,int k)
    {
        if(root==null)
        {
            return;
        }
        System.out.print("");
        if(level==k)
        {
            System.out.println(root.data);
        }
        kthlevel(root.left, level+1, k);
        kthlevel(root.right, level+1, k);
    }
    
    public static void main(String [] args)
    {
        int nodes[]={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTrees bt=new BinaryTrees();
    Node root=        bt.buildTree(nodes);
    kthlevel(root, 1, 2);
    

    }
}
    
}
