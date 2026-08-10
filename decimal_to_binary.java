import java.util.Scanner;
public class decimal_to_binary {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int decimal, binary = 0, rem, place = 1;
        System.out.print("Enter a decimal number : ");
        decimal = input.nextInt();  //read input
        //convert decimal to binary
        while(decimal > 0){
            rem = decimal % 2;   //get remainder
            binary = binary + (rem * place);
            place = place * 10;
            decimal = decimal / 2;
        }
        System.out.println("Binary Number = " + binary);
        input.close();  //close scanner
    }
}
