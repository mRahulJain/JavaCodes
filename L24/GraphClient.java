package L24;

import java.util.HashMap;

public class GraphClient {

	public static void main(String[] args) {
		Graph g = new Graph();
		g.addVertex("A");
		g.addVertex("B");
		g.addVertex("C");
		g.addVertex("D");
		g.addVertex("E");
		g.addVertex("F");
		g.addVertex("G");
		
		g.addEdge("A", "B", 10);
		g.addEdge("A", "D", 20);
		g.addEdge("B", "C", 5);
		g.addEdge("C", "D", 4);
		g.addEdge("D", "E", 3);
		g.addEdge("E", "F", 2);
		g.addEdge("E", "G", 1);
		g.addEdge("F", "G", 7);
		
		g.display();
		
//		System.out.println(g.noOfVertex());
//		System.out.println(g.noOfEdges());
//		System.out.println(g.containVertex("G"));
//		System.out.println(g.containEdge("C", "F"));
//		
//		g.removeEdge("B", "C");
//		g.display();
//		
//		g.removeVertex("A");
//		g.display();
		
//		System.out.println(g.hasPath("A", "F",new HashMap<>()));
//		g.removeEdge("D", "E");
//		System.out.println(g.hasPath("D", "E",new HashMap<>()));
//		
//		System.out.println(g.bfs("A", "F"));
//		System.out.println(g.dfs("A", "F"));
//		
//		g.bft();
//		System.out.println();
//		g.dft();
		
		System.out.println(g.isConnected());
		g.removeEdge("B", "C");
		g.removeEdge("F", "G");
		System.out.println(g.isCyclic());
		System.out.println(g.isTree());
		
		System.out.println(g.getCC());
		
		System.out.println(g.isBipartite());
	}

}
