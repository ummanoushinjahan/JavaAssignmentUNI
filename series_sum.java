import java.util.Scanner;
public class series_sum {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int n;
        double sum = 0;
        System.out.print("Enter the value of n : ");
        n = input.nextInt();
        //Calculate the Series
        for(int i=1; i<=n; i++){
            sum = sum + (double) i / Math.pow(2, i);
        }
        System.out.println("sum = " + sum);
        input.close();  //close scanner
    }
}
