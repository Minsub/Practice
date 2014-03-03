package com.minsub.althorism.dijikstra;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class JDijkstra {	
	private final int TABLE_MAX_VALUE = 1024 * 2014;
	private JGraph graph = null;
	private int[] distance;
	private int[] vertexPath;
	private boolean[] visitedVertex;
	
	public JDijkstra(JGraph graph) {
		this.graph = graph;
		init();
	}
	
	// 최적경로의 가중치를 반환
	public int getPathGravity(int start, int destination){
		init();
		int tmp;
		int[][] table = graph.getTable();
		
		convertTableForPath(table);
		
		for(int i = 0; i < graph.vertexSize(); i++){
			distance[i] = table[start][i];
		}
		visitedVertex[start] = true;
		distance[start] = 0;
		
		for(int i = 0; i < table.length-2; i++){
			tmp = getPos(table.length);
			visitedVertex[tmp] = true;
			for(int j = 0; j < table.length; j++){
				if(!visitedVertex[j]){
					if(distance[tmp] + table[tmp][j] < distance[j]){
						distance[j] = distance[tmp] + table[tmp][j];
						vertexPath[j] = tmp;	
					}
				}
			}
		}
		
		rollbackTableForPath(table);
		return distance[destination];
	}
	
	/**
	 * 최단경로의 Vertex들을 List형태로 반환한다.
	 * @param start 시작 지점의 vertex 
	 * @param destination 도착 지점의 vertex
	 * @return List<Integer> 도착지점까지의 vertex들의 인덱스가 들어가 있음 
	 */
	public List<Integer> getPath(int start, int destination){
		init();
		int tmp;
		int[][] table = graph.getTable();
		
		convertTableForPath(table);
		
		for(int i = 0; i < table.length; i++){
			distance[i] = table[start][i];
		}
		visitedVertex[start] = true;
		distance[start] = 0;
		
		for(int i = 0; i < table.length-2; i++){
			tmp = getPos(table.length);
			visitedVertex[tmp] = true;
			for(int j = 0; j < table.length; j++){
				if(!visitedVertex[j]){
					if(distance[tmp] + table[tmp][j] < distance[j]){
						distance[j] = distance[tmp] + table[tmp][j];
						vertexPath[j] = tmp;	
					}
				}
			}
		}
		
		rollbackTableForPath(table);
		return fillList(start, destination);
	}
	
	// private Method  // 
	
	//최적 경로를 위한 배열 포인트 반환함수
	private int getPos(int tableSize){
		int tmp = TABLE_MAX_VALUE+2;
		int pos = -1;
		for(int i = 0; i < tableSize; i++){
			if(distance[i] < tmp  && !visitedVertex[i]){
				tmp = distance[i];
				pos = i;
			}
		}
		return pos;
	}
	
	// 연산을 위한 객체 초기화
	private void init(){
		this.distance = new int[graph.vertexSize()];
		this.visitedVertex = new boolean[graph.vertexSize()];
		this.vertexPath = new int[graph.vertexSize()];
		for(int i = 0; i < graph.vertexSize(); i++){
			vertexPath[i] = 0;
			visitedVertex[i] = false;
		}
	}
	
	// Vertex들을 List에 저장
	private List<Integer> fillList(int start, int end){
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(end);
		for(int i = 0; i < graph.vertexSize(); i++){
			stack.push(vertexPath[end]);
			if( vertexPath[end] != start){
				end = vertexPath[end];
			}else{
				break;
			}
		}
		
		List<Integer> list = new ArrayList<Integer>();
		while(stack.size() > 0){
			list.add(stack.pop());
		}
		return list;
	}
	
	// 최적경로를 구하기위해 테이블을 잠시 변경
	private void convertTableForPath(int[][] table){
		for(int i = 0; i < table.length; i++){
			for(int j = 0; j < table.length; j++){
				if(table[i][j] == 0){
					table[i][j] = TABLE_MAX_VALUE;
				}
			}
		}
			
	}
	
	// 변경된 테이블을 다시 복구
	private void rollbackTableForPath(int[][] table){
		for(int i = 0; i < table.length; i++){
			for(int j = 0; j < table.length; j++){
				if(table[i][j] == TABLE_MAX_VALUE){
					table[i][j] = 0;
				}
			}
		}
	}
	
	/**
	 * TEST, 콘솔에 프린트
	 */
	public void test(){
		for(int i = 0; i<distance.length;i++){
			System.out.print("["+i+"],  ");
			
		}
		System.out.println();
		for(int i = 0; i<distance.length;i++){
			System.out.print(distance[i]+",    ");
			
		}
		System.out.println();
		for(int i = 0; i<visitedVertex.length;i++){
			System.out.print(visitedVertex[i]+", ");
		}
		System.out.println();
		for(int i = 0; i<vertexPath.length;i++){
			System.out.print(vertexPath[i]+",    ");
		}
	}
}
