import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//Adjacency Matrix
public class AdjacencyMatrixGraph {
    public int numberOfVertices;
    boolean[][] adjacencyMatrix;
    public AdjacencyMatrixGraph(int numberOfVertices){
        this.numberOfVertices=numberOfVertices;
        adjacencyMatrix=new boolean[numberOfVertices][numberOfVertices];
    }
    public void addEdge(int src, int dest){
        adjacencyMatrix[src-1][dest-1]=true;
    }
    public void removeEdge(int src, int dest){
        adjacencyMatrix[src-1][dest-1]=false;
    }
    public boolean hasEdge(int src, int dest){
        if(adjacencyMatrix[src-1][dest-1])
            return true;
        return false;
    }
    public void displayGraph(){
        for(int i=0;i<numberOfVertices;i++){
            for(int j=0; j<numberOfVertices;j++){
                if(adjacencyMatrix[i][j]){
                    System.out.print("1 ");
                }
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }

    public void BFS(int src){
        boolean[] visited =new boolean[numberOfVertices];
        Queue<Integer> queue=new LinkedList<>();
        visited[src-1]=true;
        queue.add(src);
        while(!queue.isEmpty()){
            int x=queue.poll();
            System.out.println(x+" ");
            int i=0;
            while(i<adjacencyMatrix.length) {
                if(adjacencyMatrix[x-1][i] == true && visited[i]==false){
                    queue.add(i+1);
                    visited[i]=true;
                }
                i++;
            }
        }
    }
    public void DFS(int src){
        boolean[] visited = new boolean[adjacencyMatrix.length];
        visited[src-1]=true;
        Stack<Integer> stack = new Stack<>();
        stack.push(src);
        int i,x;
        System.out.println(src+" ");
        while (!stack.isEmpty()){
            x = stack.pop();
            for(i=0;i<adjacencyMatrix.length;i++){
                if(adjacencyMatrix[x-1][i]==true && visited[i]==false){
                    stack.push(x);
                    visited[i]=true;
                    System.out.println(i+1+" ");
                    x=i+1;
                    i = -1;
                }
            }
        }
    }
    public static void main(String args[]){
        AdjacencyMatrixGraph g = new AdjacencyMatrixGraph(4);
        g.addEdge(1, 1);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
     //   g.addEdge(1, 4);
        g.addEdge(2, 1);
        g.addEdge(3, 1);
        g.addEdge(3, 2);
        g.addEdge(3, 3);
        g.addEdge(4, 2);
        g.addEdge(4, 3);
        g.addEdge(4, 4);
        g.displayGraph();
        System.out.println("BFS");
        g.BFS(1);
        System.out.println("DFS");
        g.DFS(4);
    }
}
