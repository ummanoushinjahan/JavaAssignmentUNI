import java.util.Scanner;
public class strong_number{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);  //Create scanner object
        int n, temp, rem, sum = 0, fact, i;
        System.out.print("Enter a number : ");
        n = input.nextInt(); //Read input
        temp = n; //Store original number
        while(n > 0){
            rem = n % 10; //get last digit
            fact = 1;  //find factorial of the digit
            for(i = 1; i<=rem; i++){
                fact = fact * i;
            }
            sum = sum + fact;  //Add factorial
            n = n / 10; //Remove last digit
        }
        if(temp == sum){
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not a Strong Number");
        }
        input.close();  //Close scanner
    }
}
