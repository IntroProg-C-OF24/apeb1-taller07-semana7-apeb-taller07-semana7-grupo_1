package taller7_d;
import java.util.Scanner;
public class Problema4 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        String nombres[]= new String[100] ,posicion[]= new String[100], condicion;
        int age[]= new int[100],i=0;
        double altura[]= new double[100],promAltura = 0,promEdad = 0;
        do{
            System.out.println("Ingrese el nombre del jugador: ");
            nombres[i] = tecla.nextLine();
            System.out.println("Ingrese la posicion del jugador: ");
            posicion[i] = tecla.nextLine();
            System.out.println("Ingrese la edad del jugador: "); 
            age[i]=tecla.nextInt();
            promEdad=promEdad+ age[i];
            System.out.println("Ingrese la altura del jugador: ");
            altura[i]=tecla.nextDouble();
            promAltura=promAltura +altura[i];
            i++;
            tecla.nextLine();
            System.out.println("Desea continuar? (yes/no): ");
            condicion = tecla.nextLine();
            System.out.println("__________________________________");
        }while("yes".equals(condicion)||"y".equals(condicion));  
        for(int j=0 ;j<=i-1;j++){
            System.out.println("---------------------------------------");
            System.out.println("Nombre: " + nombres[j] + "/ Posicion: " + posicion[j] + "/ Anio: " + age[j] + "/ Altura: " + altura[j]);
            System.out.println("---------------------------------------");
        }
        System.out.println("----PROMEDIO-------");
        promEdad=promEdad/(i);
        promAltura=promAltura/(i);
        System.out.println("Edad promedio: "+promEdad);
        System.out.println("Altura promedio: "+promAltura);
    }
}