import java.util.Scanner;
public class diamond{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);  //Create scanner object
        int n;
        System.out.print("Enter number of rows : ");
        n = input.nextInt();
        //Upper part
        for(int i = 1; i<=n; i++){
            //print spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //print stars
            for(int k=1; k<=(2 * i - 1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Lower part
        for(int i = n - 1; i>=1; i-- ){
            //print spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //print stars
            for(int k=1; k<=(2 * i - 1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();  //close scanner
    }
}