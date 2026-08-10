import java.util.Scanner;
public class prime_number{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);  //create Scanner object
        int n, i;
        System.out.print("Enter a number : ");
        n = input.nextInt();  //Read input
        if(n <= 1){
            System.out.println("Not a Prime Number");  //1 or less is not prime
        }
        else{
            for(i=2; i<n; i++){
                if(n % i == 0){
                    System.out.println("Not a Prime Number");  //Divisible
                    return;  //Stop the program
                }
            }
            System.out.println("Prime Number");  //No divisor found
        }
        input.close();  //Close Scanner
    }
}
