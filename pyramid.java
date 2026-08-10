import java.util.Scanner;
public class pyramid {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);  //create new scanner
        int n;
        System.out.print("Enter number of rows : ");
        n = input.nextInt();
        //Print pyramid
        for(int i=1; i<=n; i++){
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
