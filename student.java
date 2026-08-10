public class student{
    String name;
    String department;
    int id;
    //display student information
    void display(){
        System.out.println("Name : " + name);
        System.out.println("Depertment : " + department);
        System.out.println("ID : " + id);
        System.out.println();
    }
    public static void main(String[] args){
        //Create 3 student objects
        student s1 = new student();
        student s2 = new student();
        student s3 = new student();
        //first student
        s1.name = "Noushin";
        s1.department = "CSE";
        s1.id = 43;
         
        //second student
        s2.name = "Rahim";
        s2.department = "EEE";
        s2.id = 05;

        //third student
        s3.name = "Karim";
        s3.department = "BBA";
        s3.id = 110;

        //Display information
        s1.display();
        s2.display();
        s3.display();
    }
}
