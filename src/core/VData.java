package core;

public class VData {
	
	    	int cor, /* flag usado no algoritmo para cada vértice*/
	    	td,      /* tempo de descoberta do vértice */
	    	tt; /* tempo de termino do vértice */
	    	
	    String	pred; /* predecessor/antecessor do vértice na busca tanto no DFS quanto no BFS*/
	        float dist;
	        float custo;
	        
	        public void print() {
	        	System.out.println("pred   custo");
	        	System.out.println(this.pred + "   "+ this.custo);
	        }
}