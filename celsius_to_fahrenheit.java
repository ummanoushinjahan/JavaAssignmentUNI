import java.util.Scanner;
public class celsius_to_fahrenheit {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);  //create scanner object
        double celsius, fahrenheit;
        System.out.print("Enter temperature in celsius : ");
        celsius = input.nextDouble();  //read celsius value
        fahrenheit = (celsius * 9 / 5) + 32;   //convert to fahrenheit
        System.out.println("Temperature in Fahrenheit = " + fahrenheit);
        input.close();
    }
}
