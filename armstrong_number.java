import java.util.Scanner;
public class armstrong_number {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);  //Create scanner object
        int n, temp, rem, sum = 0;
        System.out.print("Enter a number : ");
        n = input.nextInt(); //Read input
        temp = n; //store the original number
        while(n > 0){
            rem = n % 10; //get last digit
            sum = sum + (rem * rem * rem); //add cube of the digit
            n = n / 10;  //remove last digit
        }
        if(temp == sum){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }
        input.close(); //close Scanner
    }
}
