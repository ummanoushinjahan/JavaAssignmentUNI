public class shift_operator {
    public static void main(String [] args){
        int a = 8;
        //Left shift
        System.out.println("Left shift = " +(a << 1));
        //Right shift
        System.out.println("Right shift = " +(a >> 1));
        //Unsigned right shift
        System.out.println("Unsigned Right Shift = " + (a >>> 1));
    }
}
