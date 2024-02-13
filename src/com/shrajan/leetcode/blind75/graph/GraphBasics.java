package com.shrajan.leetcode.blind75.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GraphBasics {

	public static void main(String[] args) {
	
		
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
       //  1
       // / \
      // 2 - 4
      //  \ /
      //   3

        
     // You can now use any of the nodes as the starting point of your graph
    // For example, if you want to represent the graph starting from node1:
        

  // The 'graph' object now represents the entire graph with the specified values.

        
        BasicGraph graph = node1;
        
		/**
		 * 
		 */

		//bft(graph);
		dft(graph,new HashSet<BasicGraph>());
		//printAllVertices(graph);
	}
	
	 
	    private Map<BasicGraph, BasicGraph> visited = new HashMap<>();
	    
	    
	    public BasicGraph cloneGraph(BasicGraph node) {
	        if (node == null) {
	            return null;
	        }

	        if (visited.containsKey(node)) {
	            return visited.get(node);
	        }

	        BasicGraph newNode = new BasicGraph(node.val, new ArrayList<>());
	        visited.put(node, newNode);

	        for (BasicGraph neighbor : node.neighbors) {
	            newNode.neighbors.add(cloneGraph(neighbor));
	        }

	        return newNode;
	    }
	
	  /* Depth First Traversal */

	  public static void dft(BasicGraph node, Set<BasicGraph> visited) {
		
	
		
		if(node==null || visited.contains(node)) return;
		
		    System.out.println(node.val + " ");
	        visited.add(node);

	        for (BasicGraph neighbor : node.neighbors) {
	        	dft(neighbor, visited);
	        }
	}
	  public static void printAllVertices(BasicGraph start) {
	        if (start == null) {
	            return;
	        }

	        Set<BasicGraph> visited = new HashSet<>();
	        
	        dft(start, visited);
	        System.out.println("Visited:");
	        visited.stream().map(e->e.val).forEach(System.out::println);;
	    }
	
	  /* Breadth First Traversal */
		
	  public static void  bft(BasicGraph node) {
		
	  }
}
