public class CountZeros
{

    static int countZero(int n)
    {
        return helper(n,0);
    }
    static int helper(int n,int c)
    {
        if(n==0)
        {
            return c;
        }
        int k=n%10;

        if(k==0)
        {
            return  helper(n/10,c+1);
        }
         return  helper(n/10,c);
    }
    public static void main(String[] args) {
        System.out.println(countZero(10002030));

    }
}
