import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        double total[] = new double[5], costDays[] = new double[5];
        int numDays[] = new int[5];
        String names[] = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("-------------------");
            System.out.println("Enter the name of person");
            names[i] = data.nextLine();
            System.out.println("How many days did");
            numDays[i] = data.nextInt();
            data.nextLine(); 
            System.out.println("How much did the day cost");
            costDays[i] = data.nextDouble();
            data.nextLine(); 
            total[i] = (numDays[i] * costDays[i]);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("-------------------");
            System.out.println(names[i] + " / " + numDays[i] + " / $" + costDays[i] + " / $" +total[i]);
            System.out.println("-------------------");
        }
    }
}
