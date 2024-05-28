import java.util.LinkedList;

public class Graph {
    private int vertices; // Number of vertices
    private LinkedList<Integer> adjList[]; // Adjacency List

    // Constructor
    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Add edge to the graph
    public void addEdge(int src, int dest) {
        adjList[src].add(dest); // Add edge from src to dest
        adjList[dest].add(src); // Add edge from dest to src (undirected graph)
    }

    // Print the graph
    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + ":");
            for (Integer node : adjList[i]) {
                System.out.print(" -> " + node);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create a graph with 4 vertices
        int V = 4;
        Graph graph = new Graph(V);

        // Connect each vertex to every other vertex
        for (int i = 0; i < V; i++) {
            for (int j = i + 1; j < V; j++) {
                graph.addEdge(i, j);
            }
        }

        // Print the adjacency list representation of the graph
        graph.printGraph();
    }
}