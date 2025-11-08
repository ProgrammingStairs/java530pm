// program showing the concept of constructor
class Demo11{
    int rno;
    String name;
    Demo11(){
        rno=101;
        name = "Andrew Anderson";
        System.out.println("no argument constructor called");
    }
    void display(){
        System.out.println("name : "+name);
        System.out.println("rollnumber : "+rno);
    }
    public static void main(String args[]){
        Demo11 obj = new Demo11();
        obj.display();
    }
}