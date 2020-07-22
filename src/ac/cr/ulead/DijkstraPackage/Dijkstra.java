package ac.cr.ulead.DijkstraPackage;

public class Dijkstra {
    private static final int NO_PARENT = -1;
    public int startVertexP;
    public int[] distancesP;
    public int[] parentsP;

    public void dijkstra(int[][] m, int startVertex) {
        int numero_Vertices = m.length;
        int[] shortestDistances = new int[numero_Vertices];
        boolean[] added = new boolean[numero_Vertices];
        for (int vertexIndex = 0; vertexIndex < numero_Vertices; vertexIndex++) {
            shortestDistances[vertexIndex] = Integer.MAX_VALUE;
            added[vertexIndex] = false;
        }
        shortestDistances[startVertex] = 0;
        int[] parents = new int[numero_Vertices];
        parents[startVertex] = NO_PARENT;
        for (int i = 1; i < numero_Vertices; i++) {
            int nearestVertex = -1;
            int shortestDistance = Integer.MAX_VALUE;
            for (int vertexIndex = 0; vertexIndex < numero_Vertices; vertexIndex++) {
                if (!added[vertexIndex] && shortestDistances[vertexIndex] < shortestDistance) {
                    nearestVertex = vertexIndex;
                    shortestDistance = shortestDistances[vertexIndex];
                }
            }
            added[nearestVertex] = true;
            for (int vertexIndex = 0; vertexIndex < numero_Vertices; vertexIndex++) {
                int edgeDistance = m[nearestVertex][vertexIndex];

                if (edgeDistance > 0 && ((shortestDistance + edgeDistance) < shortestDistances[vertexIndex])) {
                    parents[vertexIndex] = nearestVertex;
                    shortestDistances[vertexIndex] = shortestDistance + edgeDistance;
                }
            }
        }
        this.startVertexP = startVertex;
        this.distancesP = shortestDistances;
        this.parentsP = parents;
    }
}