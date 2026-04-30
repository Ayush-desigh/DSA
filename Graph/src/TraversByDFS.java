package src;

import java.util.ArrayList;

public class TraversByDFS

{
    static class Edge
    {
        int src;
        int dest;
        int weight;

        public Edge(int s,int d,int w)
        {
            this.src=s;
            this.dest=d;
            this.weight=w;
        }
    }

     static void  DFS(ArrayList<Edge>[] graph,int curr,boolean visit[])

    {
        System.out.print(curr+" ");
        visit[curr]=true;

        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e=graph[curr].get(i);
            if(!visit[e.dest])
            {
                DFS(graph,e.dest,visit);
            }
        }

    }

    static  void CreateGraph(ArrayList<Edge>[] graph)
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }
        // 0 vertex
        // 1 vertex
        graph[0].add(new Edge(0, 1, 5));
        graph[0].add(new Edge(0, 2, 3));

        // 1 vertex
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 3, 4));

        // 2 vertex
        graph[2].add(new Edge(2, 0, 3));
        graph[2].add(new Edge(2, 4, 6));

        // 3 vertex
        graph[3].add(new Edge(3, 1, 4));
        graph[3].add(new Edge(3, 4, 2));
        graph[3].add(new Edge(3, 5, 7));

        // 4 vertex
        graph[4].add(new Edge(4, 2, 6));
        graph[4].add(new Edge(4, 3, 2));

        // 5 vertex
        graph[5].add(new Edge(5, 3, 7));
        graph[5].add(new Edge(5, 6, 1));

        // 6 vertex (disconnected component connected only to 5)
        graph[6].add(new Edge(6, 5, 1));


    }

    public static void main(String[] args) {
        int v=7;
        boolean visit[]=new boolean[v];
        ArrayList<Edge>[] graph=new ArrayList[v];
        CreateGraph(graph);
        DFS(graph,0,visit);



    }
}
