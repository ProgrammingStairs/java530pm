// example showing the concept of constructor chaining
// this can also be used to call current class constructor

class Student{
    int rno;
    String name;
    double per;
    Student(){
        this(56);
        System.out.println("no argument constructor invoked");
    }
    Student(int rno){
        this(rno,"Andrew Anderson");
    }
    Student(int rno,String name){
        this(rno,name,56.67);
    }
    Student(int rno,String name,double per){
        this.rno = rno;
        this.name=name;
        this.per=per;
        display();
    }
    void display(){
        System.out.println("Roll Number : "+rno);
        System.out.println("Percentage : "+per);
        System.out.println("Name : "+name);
    }
}
class Demo17{
    public static void main(String args[]){
        Student s = new Student();
    }
}