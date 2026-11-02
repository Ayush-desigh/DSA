import java.util.Arrays;

public class LeetCodeProblem2285 {


    public  static long  maximumImportance(int n, int[][] roads) {
        

        int[] deg=new int[n];
        for(int i[]:roads)
        {
            deg[i[0]]++;
            deg[i[1]]++;
        }

        Arrays.sort(deg);
        long res=0;
        long level=1;
        for(int i=0;i<n;i++)
        {
            res+=(deg[i]*level);
            level++;
        }

        return res;
    }

   

    public static void main(String[] args) {
        
       int n = 5 ;
       int roads[][] ={{0,1},{1,2},{2,3},{0,2},{1,3},{2,4}};

long ans=maximumImportance(n, roads);
System.out.println("Maximum Importance road"+ans);
    }
    
}
