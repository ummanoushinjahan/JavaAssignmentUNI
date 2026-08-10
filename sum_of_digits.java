import java.util.Scanner;
public class sum_of_digits {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);  //create scanner object
        int n, rem, sum=0;
        System.out.print("Enter a number : ");
        n = input.nextInt();
        //Calculate sum of digits
        while(n > 0){
            rem = n % 10;  //get last digit
            sum = sum + rem;  //add the digit
            n = n / 10;  //remove last digit
        }
        System.out.println("Sum of Digits = " + sum);
        input.close();   //close scanner
    }
}
