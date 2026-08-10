import java.util.Scanner;
public class fibonacci_series {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);  //Create Scanner object
        int n, a=0, b=1, c;
        System.out.print("Enter the number of terms : ");
        n = input.nextInt();
        System.out.println("Fibonacci Series : ");
        for(int i=1; i<=n; i++){
            System.out.println(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        input.close();  //Close Scanner
    }
}
