package cn.com.dataStructure;

public class EdgeWeightedDigraph {
	private final int V;
	private int E;
	private Bag<DirectedEdge>[] adj; 
	public EdgeWeightedDigraph(int V){
		this.V=V;
		this.E=0;
		adj=new Bag[V];
		for(int v=0;v<V;v++){
			adj[v]=new Bag<DirectedEdge>();
		}
	}
	public int V(){
		return V;
	}
	public int E(){
		return E; 
	}
	
	public void addEdge(DirectedEdge  e){
		adj[e.from()].add(e);
		E++;
	}
}
//加权有向边
class DirectedEdge{
	private final int v;
	private final int w;
	private final double weight;
	
	public DirectedEdge(int v,int w,int weight){
		this.v=v;
		this.w=w;
		this.weight=weight;
	}
	
	public double weight(){
		return weight;
	}
	public int from(){
		return v;
	}
	public int to(){
		return w;
	}
}