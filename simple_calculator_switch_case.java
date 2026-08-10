import java.util.Scanner;
public class simple_calculator_switch_case {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);  //create scanner object
        double num1, num2;
        char op;
        System.out.print("Enter first number : ");
        num1 = input.nextDouble();   //Read input
        System.out.print("Enter an operator(+, -, *, /) : ");
        op = input.next().charAt(0);
        System.out.print("Enter second number : ");
        num2 = input.nextDouble();
        //perform calculation using switch case
        switch(op){
            case '+' :
                System.out.println("Result = " + (num1 + num2));
                break;
            case '-' :
                System.out.println("Result = " + (num1 - num2));
                break;
            case '*' :
                System.out.println("Result = " + (num1 * num2));
                break;
            case '/' :
                if(num2 != 0){
                    System.out.println("Result = " + num1 / num2);
                }
                else{
                    System.out.println("Cannot divide by zero");
                }
                break;
                default:
                    System.out.println("Invalid Operator");
        }
        input.close();   //close scanner
    }
}
