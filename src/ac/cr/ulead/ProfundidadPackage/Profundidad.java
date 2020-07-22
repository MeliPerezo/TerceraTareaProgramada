package ac.cr.ulead.ProfundidadPackage;

import java.util.*;
import java.util.Stack;

public class Profundidad {
       public  static LinkedList<String>  depthFirstSearch(int[][] matrix, int source) {
            LinkedList<String>  ListaP = new LinkedList<>();
            boolean[] visited = new boolean[matrix.length];
            visited[source - 1] = true;
            Stack<Integer> stack = new Stack<>();
            stack.push(source);
           System.out.println("Grafo de profundidad");
           System.out.println("Inicio del grafo: "+ source );

           int i, x;
            while (!stack.isEmpty()) {
                x = stack.pop();
                for (i = 0; i < matrix.length; i++) {
                    if (matrix[x - 1][i] == 1 && visited[i] == false) {
                        stack.push(x);
                        visited[i] = true;
                        String mostrar= (x+ "---->" +  (i+1));
                        x = i + 1;
                        i = -1;

                        ListaP.add(mostrar);
                    }
                }
            }
            return ListaP;
        }
    }




