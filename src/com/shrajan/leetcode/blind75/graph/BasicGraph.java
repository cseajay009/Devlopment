package com.shrajan.leetcode.blind75.graph;

import java.util.ArrayList;
import java.util.List;



public class BasicGraph {

	int val;
	
	List<BasicGraph> neighbors;
	
	public BasicGraph() {
		    val = 0;
	        neighbors = new ArrayList<BasicGraph>();
	}
	
	public BasicGraph(int _val) {
        val = _val;
        neighbors = new ArrayList<BasicGraph>();
    }
    public BasicGraph(int _val, ArrayList<BasicGraph> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
	
	
}
	