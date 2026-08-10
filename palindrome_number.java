import java.util.Scanner;
public class palindrome_number{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);  //Create Scanner object
        int n, temp, rem, rev = 0;
        System.out.print("Enter a number : ");
        n = input.nextInt();  //Read input
        temp = n; //store the original number
        while (n > 0){
            rem = n % 10; //Get last digit
            rev = rev * 10 + rem; //Reverse the number
            n = n / 10;  //Remove last digit
        }
        if(temp == rev){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not Palindrome Number");
        }
        input.close(); //Close scanner
    }
}
