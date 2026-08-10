import java.util.Scanner;
public class leap_year {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);  //crate scanner object
        int year;
        System.out.print("Enter a year : ");
        year = input.nextInt();  //read input
        //cheak leap year
        if((year % 400 == 0) || (year % 4 == 0 && year %  100 != 0)){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not Leap Year");
        }
        input.close();  //close scanner
    }
}
