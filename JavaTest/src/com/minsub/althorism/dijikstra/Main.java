package com.minsub.althorism.dijikstra;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		int[][] aa = {{	0,	7,	0,   0,	 3,	10,  0 },
					  {	7,	0,  4,  10,	 2,	 6,  0 },
					  { 0,	4,	0,   2,  0,  0,  0 },
					  { 0, 10,	2,   0, 11,	 9,  4 },
					  {	3,	2,	0,  11,	 0,  0,  5 },
					  {10,	6,	0,   9,  0,	 0,  0 },
					  { 0,  0,  0,   4,	 5,  0,  0 }};
		
		System.out.println("<<<<Graph>>>>");
		JGraph graph = new JGraph();
		graph.addTable(aa);
		graph.printTable();
		System.out.println("=============================================================");
		System.out.println("Vertex 0 에서 6까지 검색");
		
		List list = graph.search(0, 6);
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+"->");
		}
		
		
		///  JDijkstra
		System.out.println();
		System.out.println();
		System.out.println("<<<<JDijkstra>>>>");
		JDijkstra dij = new JDijkstra(graph);
		
		List list2 = dij.getPath(0, 6);
		System.out.println("Vertex 0 에서 6까지 검색");
		for(int i=0;i<list2.size();i++){
			System.out.print(list2.get(i)+"->");
		}
		System.out.println();
		System.out.println("Total Gravity"+dij.getPathGravity(0, 6));
		System.out.println("=============================================================");
		list2 = dij.getPath(0, 3);
		System.out.println("Vertex 0 에서 3까지 검색");
		for(int i=0;i<list2.size();i++){
			System.out.print(list2.get(i)+"->");
		}
		System.out.println();
		System.out.println("Total Gravity"+dij.getPathGravity(0, 3));
		System.out.println("=============================================================");

	}

}
