import source.*;
import java.util.*;

public class BreathFirstSearch {
    private static final boolean DEBUG_ON = false;
    private static final int TEST_GRAPH_SIZE = 9;
    private static char[] output = new char[TEST_GRAPH_SIZE];
    private static int index = 0;

    public static void bfs(Graph theGraph, char currentVertex) {
        theGraph.markVisited(currentVertex);
        System.out.println("  ** Visited " + currentVertex + " **");

        Queue<Character> q = new LinkedList<Character>();
        q.add('L');

        System.out.println("Elements in Queue:" + q.poll());
    }

    public static void main(String[] args) {
        // Create a new graph wih 8 Vertexs, which will be named 'A' through 'I'
        Graph theGraph = new Graph(TEST_GRAPH_SIZE);

        // Create links between the Vertexs.
        theGraph.linkTwoVertexs('A', 'B');
        theGraph.linkTwoVertexs('A', 'C');
        theGraph.linkTwoVertexs('A', 'D');
        theGraph.linkTwoVertexs('A', 'E');
        theGraph.linkTwoVertexs('B', 'F');
        theGraph.linkTwoVertexs('F', 'H');
        theGraph.linkTwoVertexs('D', 'G');
        theGraph.linkTwoVertexs('G', 'I');

        // Do a depth first search on theGraph starting from 'E'
        System.out.println("\n\n   Performing DFS traversal on graph beginning at vertex 'A': ");
        bfs(theGraph, 'A');
        System.out.println("                 Expecting: A B F H C D G I E");
        System.out.print("   Output list of vertices: ");
        for (int i = 0; i < TEST_GRAPH_SIZE; i++) {
            System.out.print(output[i] + " ");
        }
        System.out.println();

        System.out.println("\n\n   Starting over again, same graph, from 'G'... ");
        theGraph = new Graph(TEST_GRAPH_SIZE);

        // Create links between the Vertexs.
        theGraph.linkTwoVertexs('A', 'B');
        theGraph.linkTwoVertexs('A', 'C');
        theGraph.linkTwoVertexs('A', 'D');
        theGraph.linkTwoVertexs('A', 'E');
        theGraph.linkTwoVertexs('B', 'F');
        theGraph.linkTwoVertexs('F', 'H');
        theGraph.linkTwoVertexs('D', 'G');
        theGraph.linkTwoVertexs('G', 'I');
        index = 0;
        System.out.println("\n\n   Performing DFS traversal on graph beginning at vertex 'G': ");
        bfs(theGraph, 'G');
        System.out.println("                 Expecting: G D A B F H C E I");
        System.out.print("   Output list of vertices: ");
        for (int i = 0; i < TEST_GRAPH_SIZE; i++) {
            System.out.print(output[i] + " ");
        }
        System.out.println();

    }
}
