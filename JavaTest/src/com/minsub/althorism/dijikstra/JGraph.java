package com.minsub.althorism.dijikstra;

import java.util.ArrayList;
import java.util.List;

public class JGraph {
	private final int VERTEX_DEFAULT_SIZE = 10;
	private final int VERTEX_EXIST = -1;
	
	private int[][] table = null;
	private int nArraySize;
	private int nVertexCnt = 0;
	
	/**
	 * Constructor, 디폴트 사이즈로 table을 생성
	 */
	public JGraph(){
		nArraySize = VERTEX_DEFAULT_SIZE;
		table = new int[nArraySize][nArraySize];
		for(int i = 0; i<nArraySize; i++){
			for(int j = 0; j<nArraySize; j++){
				table[i][j] = 0;
			}
		}
	}
	
	/**
	 * Constructor, 입력받은 크기만큼의 table을 생성하는 생성자
	 * @param size
	 */
	public JGraph(int size){
		nArraySize = size;
		table = new int[nArraySize][nArraySize];
		for(int i = 0; i<nArraySize; i++){
			for(int j = 0; j<nArraySize; j++){
				table[i][j] = 0;
			}
		}
	}
	
	/**
	 * 두개의 Vertex를 입력받아 해당 경로를 List형태로 반환, DFS를 사용해 단순한 경로를 탐색
	 * @param v1
	 * @param v2
	 * @return List<Integer>
	 */
	public List<Integer> search(int v1, int v2){
		List<Integer> list = new ArrayList<Integer>();
		list.add(v1);
		
		boolean[] visitedVertex = new boolean[nArraySize];
		for(int i=0;i<nArraySize;i++){
			visitedVertex[i] = false;
		}
		int vertexCnt = nArraySize;
		int vertex = v1;
		while(vertexCnt > 0){
			visitedVertex[vertex] = true;
			if(vertex == v2){
				return list;
			}
			for(int i = 0; i < nArraySize; i++){
				if(table[vertex][i] > 0 && !visitedVertex[i]){
					list.add(i);
					vertex = i;
				}
			}
			vertexCnt--;
		}
		return null;
	}
	
	/**
	 * graph배열을 입력받음
	 * @param table, 이차원 integer배열인 int[][]
	 */
	public void addTable(int[][] table){
		this.table = table;
		nArraySize = table.length;
		nVertexCnt = nArraySize;
	}
	
	/**
	 * edge삽입
	 * @param v1, 출발 vertex
	 * @param v2, 도착 vertex
	 * @param gravity, 가중치
	 */
	public void addEdge(int v1, int v2, int gravity){
		if(v1 < nArraySize && v2 < nArraySize){
			table[v1][v2] = gravity;
			table[v2][v1] = gravity;
		}
	}
	
	/**
	 * Vertex삭제
	 * @param key 삭제할 버텍스의 key
	 */
	public void removeVertex(int key){
		table[key][key] = 0;
		for(int i = 0;i < nArraySize; i++){
			table[key][i] = 0;
			table[i][key] = 0;
		}
	}
	
	/**
	 * Edge 삭제
	 
	 */
	public void removeEdge(int v1, int v2){
		table[v1][v2] = 0;
		table[v2][v1] = 0;
	}
	/**
	 * Vertex 존재 유무 확인
	 * @param key
	 * @return true or false
	 */
	public boolean isVertex(int key){
		if(table[key][key] == VERTEX_EXIST){
			return true;
		}
		return false;
	}
	
	/**
	 * Edge의 가중치 반환
	 * @param v1, 출발 vertex
	 * @param v2, 도착 vertex
	 * @return gravity 
	 */
	public int getEdgeGravity(int v1, int v2){
		return table[v1][v2];
	}
	
	/**
	 * table graph를 반환
	 * @return int[][]
	 */
	public int[][] getTable(){
		if(table != null){
			return table;
		}
		return null;
	}
	
	/**
	 * Vertex의 존재 유무 확인
	 * @return true/false
	 */
	public boolean isEmpty(){
		if(nVertexCnt == 0){
			return true;
		}
		return false;	
	}
	
	/**
	 * Vertex의 갯수 반환
	 * @return int, 현재 graph의 vertex 갯수
	 */
	public int vertexSize(){
		return nVertexCnt;
	}
	
	/**
	 * TEST, 콘솔로 프린트 
	 */
	public void printTable(){
		System.out.print("    ");
		for(int i = 0; i<nArraySize; i++){
			System.out.print("["+i+"]      ");
		}
		System.out.println();
		for(int i = 0; i<nArraySize; i++){
			System.out.print("["+i+"]  ");
			for(int j = 0; j<nArraySize; j++){
				System.out.print(table[i][j]+",       ");
			}
			System.out.println();
		}
	}
}