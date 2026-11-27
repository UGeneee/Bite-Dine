package dsa;

import java.util.*;

public class Graph {

    private HashMap<String, List<String>> adjList = new HashMap<>();

    public void addEdge(String u, String v) {
        adjList.putIfAbsent(u, new ArrayList<>());
        adjList.putIfAbsent(v, new ArrayList<>());
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    public boolean hasVertex(String v) {
        return adjList.containsKey(v);
    }

    public void printGraph() {
        System.out.println("Adjacency list:");
        for (String vertex : adjList.keySet()) {
            System.out.println(vertex + " -> " + adjList.get(vertex));
        }
    }

    public void dfs(String start) {
        Set<String> visited = new HashSet<>();
        System.out.print("DFS order:");
        dfsHelper(start, visited);
        System.out.println();
    }

    private void dfsHelper(String current, Set<String> visited) {
        visited.add(current);
        System.out.print(" " + current);
        for (String neighbor : adjList.get(current)) {
            if (!visited.contains(neighbor)) {
                dfsHelper(neighbor, visited);
            }
        }
    }

    public void bfs(String start, String target) {
        Set<String> visited = new HashSet<>();
        Map<String, String> parent = new HashMap<>();
        Queue<String> queue = new LinkedList<>();
        List<String> visitOrder = new ArrayList<>();

        visited.add(start);
        queue.add(start);

        while (!queue.isEmpty()) {
            String current = queue.poll();
            visitOrder.add(current);

            if (current.equals(target)) {
                break;
            }

            for (String neighbor : adjList.get(current)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    parent.put(neighbor, current);
                    queue.add(neighbor);
                }
            }
        }

        System.out.println("BFS visit order: " + visitOrder);

        if (!visited.contains(target)) {
            System.out.println("No path found from " + start + " to " + target);
            return;
        }

        LinkedList<String> path = new LinkedList<>();
        String step = target;
        while (step != null) {
            path.addFirst(step);
            step = parent.get(step);
        }
        System.out.println("BFS shortest path from " + start + " to " + target + ": " + path);
    }
}
