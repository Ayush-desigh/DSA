public class Factorial
{
    public static void main(String[] args) {
        int ans=factorial1(5);
        System.out.println(ans);
    }
    static int factorial1(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n*factorial1(n-1);
    }
    static  int sum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return n+sum(n-1);
    }
}
