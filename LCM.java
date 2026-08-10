import java.util.Scanner;
public class LCM {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int a, b, lcm;
        System.out.print("Enter first number : ");
        a = input.nextInt();
        System.out.print("Enter second number : ");
        b = input.nextInt();
        //Find LCM
        lcm = (a > b) ? a : b;
        while(lcm % a != 0 || lcm % b != 0){
            lcm++;
        }
        System.out.println("LCM = " + lcm);
        input.close();
    }
}
