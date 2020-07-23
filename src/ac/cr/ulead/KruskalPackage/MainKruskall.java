package ac.cr.ulead.KruskalPackage;

public class MainKruskall {
    public static void main(String[] args) {


        int adjacency_matrix[][] = {{0, 0, 0, 0},
                                    {10, 0, 0, 0},
                                    {6, 0, 0, 0},
                                    {5, 15, 4, 0}};


        Kruskall graph = new Kruskall(adjacency_matrix);

        graph.getKruskalSolution();
        System.out.print(graph.result);

    }
}