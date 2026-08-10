import java.util.Scanner;
public class password_do_while {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        String password;
        do{
            System.out.print("Enter Password : ");
            password = input.nextLine();
            if(! password.equals("1234")){
                System.out.println("Wrong password! Try again.");
            }
        }
        while(!password.equals("1234"));
        System.out.println("Correct password!");
        input.close();               
    }
}
