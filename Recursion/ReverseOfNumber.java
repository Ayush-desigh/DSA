public class ReverseOfNumber
{
    public static void main(String[] args) {
        reverse(12345);
        System.out.println(sum);
    }
    static int sum=0;
    static void reverse(int n)
    {
        if(n<1)
        {
            return ;
        }
        int k=n%10;
        sum=sum*10+k;
        reverse(n/10);
    }
}
