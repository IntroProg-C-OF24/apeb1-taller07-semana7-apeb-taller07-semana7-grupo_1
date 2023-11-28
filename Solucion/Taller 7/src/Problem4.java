import java.util.Scanner;
public class Problem4 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        String names[]= new String[100] ,position[]= new String[100], condition;
        int age[]= new int[100],i=0;
        double height[]= new double[100],perHeight = 0,perAge = 0;
        do{
            System.out.println("Enter the name of player");
            names[i] = data.nextLine();
            System.out.println("Enter the position of player");
            position[i] = data.nextLine();
            System.out.println("Enter the age of player"); 
            age[i]=data.nextInt();
            perAge=perAge+ age[i];
            System.out.println("Enter the height of player");
            height[i]=data.nextDouble();
            perHeight=perHeight +height[i];
            i++;
            data.nextLine();
            System.out.println("Do you want to continue? (yes/no): ");
            condition = data.nextLine();
            System.out.println("__________________________________");
        }while("yes".equals(condition)||"y".equals(condition));  
        for(int j=0 ;j<=i-1;j++){
            System.out.println("---------------------------------------");
            System.out.println("Name: " + names[j] + "/ Position: " + position[j] + "/ Age: " + age[j] + "/ Height: " + height[j]);
            System.out.println("---------------------------------------");
        }
        System.out.println("----Average-------");
        perAge=perAge/(i);
        perHeight=perHeight/(i);
        System.out.println("Age average: "+perAge);
        System.out.println("Height average: "+perHeight);
    }
}
