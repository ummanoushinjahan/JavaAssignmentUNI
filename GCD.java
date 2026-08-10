import java.util.Scanner;
public class GCD {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.print("Enter first number : ");
        a = input.nextInt();
        System.out.print("Enter second number : ");
        b = input.nextInt();
        //Find GCD
        while(b != 0){
            int rem = a % b;
            a = b;
            b = rem;
        }
        System.out.println("GCD = " + a);
        input.close();
    }
}
