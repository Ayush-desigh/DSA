public class LeetcodeProblem1342 {


    public static int numberOfSteps(int num) {

        return helper(num,0);



    }
    public static   int helper(int n,int c)
    {
        if(n==0)
        {
            return c;
        }
        if(n%2==0)
        {
            int k=n/2;
            return helper(k,c+1);
        }
        else
        {
            return helper(n-1,c+1);
        }



    }

    public static void main(String[] args) {

        System.out.println(numberOfSteps(14));
    }
}
