// program showing the concept of constructor
import java.util.Scanner;
class Demo12{
    int rno;
    String name;
    Demo12(int rno,String name){
        this.rno = rno;
        this.name = name;
        System.out.println("parameterized constructor called");
    }
    void display(){
        System.out.println("name : "+name);
        System.out.println("rollnumber : "+rno);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll number : ");
        int rno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name : ");
        String name = sc.nextLine();

        Demo12 obj = new Demo12(rno,name);
        obj.display();
    }
}