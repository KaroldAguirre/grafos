import java.util.Scanner;

public class probando {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            grafo ponderadoNodir;
            System.out.print("digite el número de vertices: ");
            int numero = sc.nextInt();

            ponderadoNodir = new grafo(numero);
            ponderadoNodir.ponderadoNODir();
            System.out.println(ponderadoNodir);

            System.out.println();

            System.out.print("digite el vertice a empezar: ");
            int vertice = sc.nextInt();
            System.out.print("digite el vertice fin: ");
            int fin = sc.nextInt();

            drijkstra dij = new drijkstra(999, "", vertice, fin);
            System.out.println(ponderadoNodir.dijkstra(vertice, fin, 0, "", dij));
        }
    }
    
}