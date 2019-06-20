import java.util.*;
    public class AdjacencyListGraph {
        public int numberOfVertices;
        LinkedList<Integer>[] adjacencyList;

        public AdjacencyListGraph(int numberOfVertices) {
            this.numberOfVertices = numberOfVertices;
            adjacencyList = new LinkedList[numberOfVertices];
            for (int i = 0; i < numberOfVertices; i++) {
                adjacencyList[i] = new LinkedList<>();
            }
        }

        public void addEdge(int src, int dest) {
            adjacencyList[src - 1].add(dest - 1);
            //adjacencyList[dest].add(src);
        }

        public void printGraph() {
            for (int i = 0; i < numberOfVertices; i++) {
                if (adjacencyList[i].size() > 0) {
                    int x = i + 1;
                    System.out.println("Vertex " + x + " is connected to");
                    for (int j : adjacencyList[i]) {
                        System.out.println(j + 1);
                    }
                }
            }
        }

        public void BFS(int src) {
            boolean[] visited = new boolean[numberOfVertices];
            Queue<Integer> queue = new LinkedList<>();
            visited[src - 1] = true;
            queue.add(src);
            int i = 0, x;
            while (!queue.isEmpty()) {
                x = queue.poll();
                System.out.println(x + " ");
                Iterator<Integer> list = adjacencyList[x - 1].iterator();
                while (list.hasNext()) {
                    int n = list.next();
                    if (!visited[n]) {
                        visited[n] = true;
                        queue.add(n + 1);
                    }
                }
            }
        }
        public void DFS(int vertex){
            boolean[] visited = new boolean[numberOfVertices];
            Stack<Integer> stack = new Stack<>();
            visited[vertex-1]=true;
            stack.push(vertex);
            System.out.println(vertex);
            int x;
            while(!stack.isEmpty()){
                x=stack.pop();
                Iterator<Integer> list = adjacencyList[x-1].iterator();
                while(list.hasNext()){
                    int n=list.next();
                    if(!visited[n]){
                        visited[n]=true;
                        stack.push(n+1);
                        System.out.println(n+1);
                    }
                }
            }
        }

        /*public void DFS(int src) {
            boolean[] visited = new boolean[numberOfVertices];
            dfsRecursive(visited, src);
        }

        public void dfsRecursive(boolean[] visited, int vertex) {
            visited[vertex - 1] = true;
            System.out.println(vertex + " ");
            Iterator<Integer> list = adjacencyList[vertex - 1].iterator();
            while (list.hasNext()) {
                int n = list.next();
                if (!visited[n]) {
                    dfsRecursive(visited, n + 1);
                }
            }
        }*/
        public static void main(String[] args) {
            AdjacencyListGraph g = new AdjacencyListGraph(4);
            g.addEdge(1,1);
            g.addEdge(1, 2);
            g.addEdge(1, 3);
            //g.addEdge(1, 4);
            g.addEdge(2, 1);
            g.addEdge(3, 1);
            g.addEdge(3, 2);
            g.addEdge(3, 3);
            g.addEdge(4, 4);
            g.printGraph();
            System.out.println("BFS");
            g.BFS(1);
            System.out.println("DFS");
            g.DFS(3);
        }
}