
package taller7_d;
import java.util.Scanner;
public class Problema3 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        double total[] = new double[5], costoDias[] = new double[5];
        int numDias[] = new int[5];
        String names[] = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("-------------------");
            System.out.println("Ingrese el nombre de la persona: ");
            names[i] = tecla.nextLine();
            System.out.println("Cuantos dias hizo: ");
            numDias[i] = tecla.nextInt();
            tecla.nextLine(); 
            System.out.println("Cuanto costo el dia: ");
            costoDias[i] = tecla.nextDouble();
            tecla.nextLine(); 
            total[i] = (numDias[i] * costoDias[i]);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("-------------------");
            System.out.println(names[i] + " / " + numDias[i] + " / $" + costoDias[i] + " / $" +total[i]);
            System.out.println("-------------------");
        }
    }
}