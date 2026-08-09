public class BuildBinaryTreesB {

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
    
    public static void main(String [] args)
    {
        int nodes[]={1, 2, 5, -1, -1, -1, 8, -1, -1};
        BinaryTrees bt=new BinaryTrees();
    Node root=        bt.buildTree(nodes);
    System.out.println();
    System.out.println(root.data);

    }
}
    
}
