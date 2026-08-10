import java.util.Scanner;
public class largest_among_3_numbers {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter first number : ");
        a = input.nextInt();
        System.out.print("Enter second number : ");
        b = input.nextInt();
        System.out.print("Enter third number : ");
        c = input.nextInt();
        //Check the largest number
        if(a >= b && a>=c){
            System.out.println("Largest number = " + a);
        }
        else if(b>=a && b>=c){
            System.out.println("Largest number = " + b);
        }
        else{
            System.out.println("Largest number = " + c);
        }
        input.close();  //close scanner
    }
}
