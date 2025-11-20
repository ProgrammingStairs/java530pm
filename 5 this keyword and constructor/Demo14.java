// program showing the concept of constructor
import java.util.Scanner;
class Demo14{
    int rno;    // instance variable 
    String name;// instance variable
    // parameterized constructor
    Demo14(int rno,String name){
        this.rno = rno;
        this.name = name;
        System.out.println("parameterized constructor called");
    }
    // parameterized constructor
    Demo14(Demo14 obj){
        rno = obj.rno;
        name = obj.name;
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

        Demo14 obj = new Demo14(rno,name);
        Demo14 objNew = new Demo14(obj);
        
        obj.display();
        System.out.println("\nAfter Copying : \n");
        objNew.display();        
    }
}


















