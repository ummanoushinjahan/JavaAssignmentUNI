import java.util.Scanner;
public class perfect_number {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);  //create scanner object
        int n, i, sum = 0;
        System.out.print("Enter a number : ");
        n = input.nextInt();   //Read input
        //Find the sum of proper divisors
        for(i = 1; i<n; i++){
            if(n % i == 0){
                sum = sum + i;
            }
        }
        //Check whether the number is perfect
        if(sum == n){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not a Perfect Number");
        }
        input.close(); //close scanner
    }
}
