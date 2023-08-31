import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        int a = obj.nextInt();
        if(a%2==1)
        {
            System.out.println("it is an odd number");
        }
        else {
            System.out.println("it is an even number");
        }
    }
}