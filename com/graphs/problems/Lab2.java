package com.graphs.problems;


/**
 * Find cyclic present in the undirected graph.
 */
public class Lab2 {

    public static boolean isCyclicPresent(UndirectedGraph mygraph) {

        boolean visited[] = new boolean[mygraph.vertexCount];

        for (int i=0;i<mygraph.vertexCount;i++) {
            if(!visited[i]) {
                if(dfs(mygraph,visited,i,-1) == true) {
                    return true;
                }
            }

        }

        return false;
    }

    private static boolean dfs(UndirectedGraph mygraph, boolean[] visited, int currentVertex, int parentVertex) {

        visited[currentVertex]=true;
        for (int vertex : mygraph.adjList.get(currentVertex)) {
            if (!visited[vertex]) {
                if(dfs(mygraph,visited,vertex,currentVertex) == true) {
                    return true;
                }
            } else if (vertex!=parentVertex) {
               return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {


        UndirectedGraph undirectedGraph = new UndirectedGraph(5);

        undirectedGraph.addEdge(0,1);
        undirectedGraph.addEdge(1,2);
        undirectedGraph.addEdge(1,3);
        undirectedGraph.addEdge(2,3);
        undirectedGraph.addEdge(2,4);
        boolean result = isCyclicPresent(undirectedGraph);
        System.out.println(result);
    }

}
