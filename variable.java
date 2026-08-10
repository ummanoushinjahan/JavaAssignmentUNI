public class variable {
    int a = 10;    //Instance variable
    public static void main(String [] args){
        variable obj = new variable();
        int b = 20;  //Local variable
        System.out.println("Instance variable : " + obj.a);
        System.out.println("Local variable : " + b);
        
    }
}
