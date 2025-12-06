// example showing the concept of super keyword

class Parent{
    String name="Peter Parker";
    Parent(){
        System.out.println("Parent class constructor called");
    }
    void display(){
        System.out.println("display method of parent called");
    }
}
class Child extends Parent{
    String name="Andrew Anderson";
    Child(){
        super();
        System.out.println("Child class constructor called");
    }
    void display(){
        System.out.println("display method of child called");
    }
    void show(){
        System.out.println("Parent name : "+super.name);
        System.out.println("Child name : "+name);
        super.display();
        display();
    }
}
class Demo2{
    public static void main(String args[]){
        Child obj = new Child();
        obj.show();
    }
}