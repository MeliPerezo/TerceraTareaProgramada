package ac.cr.ulead.AmplitudPackage;
import java.util.LinkedList;
import java.util.Queue;
public class Amplitud {

   public  static LinkedList  breadthFirstSearch(int[][] matriz, int source) {
        LinkedList<String>  Lista = new LinkedList<>();
       boolean[] visitado = new boolean[matriz.length];
        visitado[source - 1] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        System.out.println("* Grafo de Amplitud *");
        System.out.println("Inicio del grafo: "+ source );
        while (!queue.isEmpty()) {
            System.out.println(queue.peek());
            int x = queue.poll();
            int i;
            for (i = 0; i < matriz.length; i++) {
                if (matriz[x - 1][i] == 1 && visitado[i] == false) {

                    queue.add(i + 1);
                    visitado[i] = true;
                   String mostrar= (x+ "---->" +  (i+1) );
                     Lista.add(mostrar);
                }
            }
        }
        return Lista;
    }
}