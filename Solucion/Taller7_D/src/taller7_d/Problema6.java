package taller7_d;
import java.util.Scanner;
public class Problema6 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        double costo, descuento;
        String nombre;
        int tipo = 0;
        for(int i=0; i<7;i++){
            System.out.println("Ingrese el nombre: ");
            nombre = tecla.next();
            System.out.println("Ingrese el precio: ");
            costo = tecla.nextDouble();
            System.out.println("Ingrese el tipo: ");
            tipo= tecla.nextInt();
            if (tipo != 1 && tipo !=2) {
                tipo = 3;
            }
            System.out.println("_______________________");
            switch (tipo){
                case 1: {
                descuento=costo*0.1;
                costo=costo-descuento;
                System.out.println("\nTipo cliente: " + tipo + " compro una computadora con precio $"+costo);
                break;  
                }
                case 2: {
                descuento=costo*0.2;
                costo=costo-descuento;
                System.out.println("\nTipo clientes: " + tipo + " compro una computadora con precio $"+costo);
                break;
                }
                case 3: {
                System.out.println("\nEl cliente: " + nombre + " compro una computadora con precio $"+costo);
                break;
                }
            }
            System.out.println("_______________________");
        }
    }
}