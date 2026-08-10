import java.util.Scanner;
public class even_odd {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);   //Create scanner object
        int n; 
        System.out.print("Enter a number : ");
        n = input.nextInt();  //Read input
        if(n % 2 == 0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
        input.close();  //close scanner
    }
}
