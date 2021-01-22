package algorithms;


/**
 * class Node:
 * x,y - the price for get up (y) or right (x)
 * entry - the best price from (0,0) to this node
 * numOfPaths - number of shortest paths until this node 
 * entryFromTheEnd - same as entry, but from the end to (0,0)
 */

class Node {
	int x,y,entry,numOfPaths,entryFromTheEnd;
	
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
		entry = 0;
		entryFromTheEnd = 0;
		numOfPaths = 1;
	}
}