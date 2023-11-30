package taller7_d;
import java.util.Scanner;
public class Problema5 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        String nombre[] = new String[4];
        double nota[]=new double[4];
        for (int i = 0; i < 4; i++){
            System.out.println("-------------------");
            System.out.println("Ingrese el nombre del estudiante: ");
            nombre[i] = tecla.nextLine();
            System.out.println("Ingrese la nota del estudiante: ");
            nota[i] = tecla.nextDouble();
            tecla.nextLine();
        }
        System.out.println("_____________________________________");
        for(int j=0;j<4;j++){
            if (nota[j]>=7) 
                System.out.println(nombre[j] + " / " + nota[j] + "/ Aprobado");
            else
                System.out.println(nombre[j] + " / " + nota[j] + "/ Reprobado");
        }

    }
}