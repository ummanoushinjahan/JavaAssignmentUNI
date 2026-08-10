import java.util.Scanner;
public class number_swap {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int a, b, temp;
        System.out.print("Enter first number : ");
        a = input.nextInt();  //Read first number
        System.out.print("Enter second number : ");
        b = input.nextInt();  //Read second number
        //Swap the numbers
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping : ");
        System.out.println("First Number = " + a);
        System.out.println("Second Number = " + b);
        input.close();  //close scanner
    }
}
