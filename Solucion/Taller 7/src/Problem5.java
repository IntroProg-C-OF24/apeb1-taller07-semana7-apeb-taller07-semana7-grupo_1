import java.util.Scanner;
public class Problem5 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        String names[] = new String[4];
        double note[]=new double[4];
        for (int i = 0; i < 4; i++){
            System.out.println("-------------------");
            System.out.println("Enter the name of student");
            names[i] = data.nextLine();
            System.out.println("What is the note");
            note[i] = data.nextDouble();
            data.nextLine();
        }
        System.out.println("_____________________________________");
        for(int j=0;j<4;j++){
            if (note[j]>=7) 
                System.out.println(names[j] + " / " + note[j] + "/ Approved");
            else
                System.out.println(names[j] + " / " + note[j] + "/ Failed");
        }

    }
}
