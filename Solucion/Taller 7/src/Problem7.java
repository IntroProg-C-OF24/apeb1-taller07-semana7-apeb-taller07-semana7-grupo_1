public class Problem7 {
    public static void main(String[] args) {
        int num=-1,num1=1;
        do{
            System.out.println(num + " / " +num1);
            num= num *(-1);
            num1++;
        }while(num1<=10);
    }
}
