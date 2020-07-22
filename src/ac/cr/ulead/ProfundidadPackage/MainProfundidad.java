package ac.cr.ulead.ProfundidadPackage;



import java.util.LinkedList;

public class MainProfundidad{

    public static void main(String[] args) {
        LinkedList<String> verConsola = new LinkedList<>();
        Profundidad  amplitud = new Profundidad() ;
        int matrix [][] =  {{0,1,0,1,0,0,0},
                {1,0,1,1,1,0,0},
                {0,1,0,0,1,0,0},
                {1,1,0,0,1,1,0},
                {0,1,1,1,0,1,1},
                {0,0,0,1,1,0,1},
                {0,0,0,0,1,1,0}};
        verConsola = Profundidad.depthFirstSearch(matrix, 2);
        for (int i =0; i<verConsola.size(); i++) {
            System.out.println(verConsola.get(i));
        }
    }
}