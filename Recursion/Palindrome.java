public class Palindrome
{

    static int sum=0;
   public static void reverse(int n)
    {
        if(n<1)
        {
            return ;
        }
        int k=n%10;
        sum=sum*10+k;
        reverse(n/10);
    }
    
//    static boolean palindrome(int n)
//    {
//       return n==reverse(n);
//    }
    public static void main(String[] args) {
//        System.out.println(reverse(12345));
//        System.out.println(palindrome(1331));
    }
}
