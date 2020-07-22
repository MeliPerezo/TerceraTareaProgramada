package ac.cr.ulead.AmplitudPackage;

import ac.cr.ulead.AmplitudPackage.Amplitud;

import java.util.LinkedList;

public class MainAmplitud {

    public static void main(String[] args) {
        LinkedList<String> verConsola = new LinkedList<>();
        Amplitud amplitud = new Amplitud();
        int matrix [][] =  {{0,1,0,1,0,0,0},
                {1,0,1,1,1,0,0},
                {0,1,0,0,1,0,0},
                {1,1,0,0,1,1,0},
                {0,1,1,1,0,1,1},
                {0,0,0,1,1,0,1},
                {0,0,0,0,1,1,0}};
        verConsola = Amplitud.breadthFirstSearch(matrix, 1);
        for (int i =0; i<verConsola.size(); i++) {
            System.out.println(verConsola.get(i));
        }
    }

}

