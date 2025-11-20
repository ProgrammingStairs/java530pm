// program showing the concept of constructor
import java.util.Scanner;
class Demo13{
    int rno;    // instance variable 
    String name;// instance variable
    // parameterized constructor
    Demo13(int rno,String name){
        this.rno = rno;
        this.name = name;
        System.out.println("parameterized constructor called");
    }
    // default constructor
    Demo13(){}
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

        Demo13 obj = new Demo13(rno,name);
        obj.display();
        Demo13 objNew = new Demo13();
        objNew.rno = obj.rno;
        objNew.name = obj.name;
        System.out.println("\nAfter Copying : \n");
        objNew.display();        
    }
}