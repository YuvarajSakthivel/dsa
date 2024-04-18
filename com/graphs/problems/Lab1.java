package com.graphs.problems;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Lab1 {

    public static int[] shortestPath(UndirectedGraph mygraph,int source) {
        int dist[] = new int[mygraph.vertexCount];
        Queue<Integer> myqueue = new LinkedList<Integer>();
        boolean visited[]= new boolean[mygraph.vertexCount];
        dist[source]=0;
        myqueue.add(source);
        visited[source] =true;

        while(!myqueue.isEmpty()) {
            int currentVertex = myqueue.poll();

            for (int vertex:mygraph.adjList.get(currentVertex)) {
                if (visited[vertex]==false) {
                   dist[vertex] = dist[currentVertex] +1;
                   visited[vertex] = true;
                   myqueue.add(vertex);
                }
            }
        }
return dist;
    }

    public static void main(String[] args) {

        UndirectedGraph mygraph = new UndirectedGraph(5);
        mygraph.addEdge(0,1);
        mygraph.addEdge(0,2);

        mygraph.addEdge(1,2);
        mygraph.addEdge(1,3);

        mygraph.addEdge(2,3);
        mygraph.addEdge(2,4);

        mygraph.addEdge(3,4);

       // mygraph.printGraph();

        int[] dist = shortestPath(mygraph,0);
        System.out.println(Arrays.toString(dist));
    }
}
