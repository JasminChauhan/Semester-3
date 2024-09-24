import java.util.*;
public class GraphTraversal {
    public static void main(String[] args) {
        Graph g = new Graph();
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(1,3);
        g.addEdge(2,4);
        g.addEdge(3,3);
        g.addEdge(1,4);

        g.dfs(1);
        g.bfs(1);
    }
}
class Graph {
    HashMap<Integer , List<Integer>> adjList = new HashMap<>();
    public Graph(){
        adjList = new HashMap<>();
    }
    public void addEdge(int a , int b) {
       adjList.putIfAbsent(a, new ArrayList<>());
       adjList.putIfAbsent(b, new ArrayList<>());
       adjList.get(a).add(b);
       adjList.get(b).add(a); 
    }

    public void dfs(int start) {
        Set<Integer> visited = new HashSet<>();
        System.out.println("Dfs Traversal:");
        dfsHelper( start, visited);
    }

    public void dfsHelper(int vertex , Set<Integer> visited) {
        visited.add(vertex);

        System.out.print(vertex + " ");

        for (int neighbor : adjList.getOrDefault(vertex , new ArrayList<>())){
            if (!visited.contains(neighbor)){
                dfsHelper(neighbor , visited);
            }
        }
    }

    public void bfs(int start) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();

        visited.add(start);
        q.add(start);
        System.out.println("Bfs Traversal:");
     

        while(!q.isEmpty()) {
            int vertex = q.poll();
            System.out.print(vertex + " ");

            for (int neighbor : adjList.getOrDefault(q, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    q.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }

    
}