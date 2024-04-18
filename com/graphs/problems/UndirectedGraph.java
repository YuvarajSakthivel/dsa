package com.graphs.problems;

import java.util.ArrayList;
import java.util.List;

public class UndirectedGraph {
    int vertexCount;
    List<ArrayList<Integer>> adjList;

    public UndirectedGraph(int count) {
        this.vertexCount = count;
        this.adjList = new ArrayList<>(count);
        for(int i=0;i<count;i++) {
            this.adjList.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int vertex1,int vertex2) {
        this.adjList.get(vertex1).add(vertex2);
        this.adjList.get(vertex2).add(vertex1);
    }

    public void printGraph() {
        for (int i=0;i<vertexCount;i++) {
            System.out.print("vertex:"+i+"\t");
            for (int j=0;j < this.adjList.get(i).size();j++) {
                System.out.print(this.adjList.get(i).get(j) + "\t");
            }
            System.out.println("");
        }
    }
}

