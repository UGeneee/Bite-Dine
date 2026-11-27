package dsa;

import java.util.Scanner;

public class CampusWayfinder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Graph campus = new Graph();

        campus.addEdge("A", "B");
        campus.addEdge("A", "C");
        campus.addEdge("B", "D");
        campus.addEdge("C", "D");

        campus.printGraph();
        System.out.println();

        System.out.print("Enter start vertex for DFS: ");
        String dfsStart = sc.nextLine().trim().toUpperCase();
        if (campus.hasVertex(dfsStart)) {
            campus.dfs(dfsStart);
        } else {
            System.out.println("Invalid vertex: " + dfsStart);
        }
        System.out.println();

        System.out.print("Enter start and target vertices for BFS: ");
        String[] input = sc.nextLine().trim().toUpperCase().split("\\s+");
        if (input.length == 2 && campus.hasVertex(input[0]) && campus.hasVertex(input[1])) {
            campus.bfs(input[0], input[1]);
        } else {
            System.out.println("Invalid input. Example: A D");
        }

        sc.close();
    }
}
