package com.shrajan.leetcode.blind75.graph;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class GraphAnalysis {

	
	public static void main(String args[]) {
		
		BasicGraph graph = getGraph();
		//recursivedepthFirstTraversal(graph, new HashSet<BasicGraph>());
		iterativeDepthFirstTraversal(graph);
		System.out.println("BFS");
		iterativeBFS(graph);
		
	} 
	
	public static void iterativeBFS(BasicGraph start) {
        if (start == null) {
            return;
        }

        Set<BasicGraph> visited = new HashSet<>();
        Queue<BasicGraph> queue = new ArrayDeque<>();

        queue.offer(start);

        while (!queue.isEmpty()) {
        	BasicGraph current = queue.poll();

            if (!visited.contains(current)) {
                System.out.print(current.val + " ");
                visited.add(current);

                for (BasicGraph neighbor : current.neighbors) {
                    if (!visited.contains(neighbor)) {
                        queue.offer(neighbor);
                    }
                }
            }
        }
    }
	
	public static void recursivedepthFirstTraversal(BasicGraph graph,Set<BasicGraph> visited) {
		
		if(graph==null || visited.contains(graph)) return;
		
		
		System.out.println(graph.val);
		visited.add(graph);
		
		for(BasicGraph grph:graph.neighbors) {
			recursivedepthFirstTraversal(grph,visited);	
		}
		
	}
	
	public static void iterativeDepthFirstTraversal(BasicGraph graph) {
		if(graph==null)return;
		
		Set<BasicGraph> visited = new HashSet<BasicGraph>();
		Stack<BasicGraph> stack = new Stack<BasicGraph>();
		
		stack.push(graph);
		
		while(!stack.isEmpty()) {
			BasicGraph current = stack.pop();
			
			if(!visited.contains(current)) {
				System.out.print(current.val+"  ");
				visited.add(current);
				
				for(BasicGraph gr : current.neighbors) {
					stack.push(gr);
				}
			}
		}
		
		
		
	}
	
	public static BasicGraph getGraph() {
		BasicGraph node1 =  new BasicGraph(1);
		BasicGraph node2 =  new BasicGraph(2);
		BasicGraph node3 =  new BasicGraph(3);
		BasicGraph node4 =  new BasicGraph(4);
		
		
		node1.neighbors.add(node2);
		node1.neighbors.add(node4);
		
		node2.neighbors.add(node1);
		node2.neighbors.add(node3);
		
        node3.neighbors.add(node2);
        node3.neighbors.add(node4);

        node4.neighbors.add(node1);
        node4.neighbors.add(node3);
        
        return node1;
	}
}
