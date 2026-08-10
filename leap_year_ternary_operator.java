import java.util.Scanner;
public class leap_year_ternary_operator {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int year;
        System.out.print("Enter year : ");
        year = input.nextInt();
        //Check leap year using ternary operator
        String result = (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
        ? "Leap Year"
        : "Not a Leap Year";
        System.out.println(result);
        input.close();
    }
}
