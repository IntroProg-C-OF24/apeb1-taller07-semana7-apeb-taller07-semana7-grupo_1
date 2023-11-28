import java.util.Scanner;
public class Problem6 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        double cost, discount;
        String name;
        int type = 0;
        for(int i=0; i<7;i++){
            System.out.println("Enter the name");
            name = data.next();
            System.out.println("Enter the price");
            cost = data.nextDouble();
            System.out.println("Enter the type");
            type= data.nextInt();
            if (type != 1 && type !=2) {
                type = 3;
            }
            System.out.println("_______________________");
            switch (type){
                case 1: {
                discount=cost*0.1;
                cost=cost-discount;
                System.out.println("\nType client: " + type + " bought a computer with price $"+cost);
                break;  
                }
                case 2: {
                discount=cost*0.2;
                cost=cost-discount;
                System.out.println("\nType client: " + type + " bought a computer with price $"+cost);
                break;
                }
                case 3: {
                System.out.println("\nClient names: " + name + " bought a computer with price $"+cost);
                break;
                }
            }
            System.out.println("_______________________");
        }
    }
}
