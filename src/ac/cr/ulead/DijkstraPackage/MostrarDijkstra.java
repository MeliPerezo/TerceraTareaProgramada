package ac.cr.ulead.DijkstraPackage;

public class MostrarDijkstra {
    public MostrarDijkstra(int startVertex, int[] distances, int[] padres) {
        int numero_Vertices = distances.length;
        System.out.print("Vertice\t Distancia\tCamino de nodos");

        for (int vertexIndex = 0; vertexIndex < numero_Vertices; vertexIndex++) {
            if (vertexIndex != startVertex) {
                System.out.print("\n" + startVertex + " -> ");
                System.out.print(vertexIndex + " \t\t ");
                System.out.print(distances[vertexIndex] + "\t\t");
                printPath(vertexIndex, padres);
            }
        }
    }

    private static void printPath(int currentVertex, int[] padres) {

        if (currentVertex == -1) {
            return;
        }
        printPath(padres[currentVertex], padres);
        System.out.print(currentVertex + " ");
    }
}