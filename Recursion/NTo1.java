public class NTo1
{
    public static void main(String[] args) {
    N(10);
    }


    static void N(int n)
    {
        if(n==0)
        {
            return;
        }
        N(n-1);
        System.out.println(n);

    }
}
