// example showing the concept of run time polymorphism

class Parent{
    void show(){
        System.out.println("show method of parent called");
    }
    void display(){
        System.out.println("display method of parent called");
    }
}
class Child extends Parent{
    void show(){
        System.out.println("show method of child called");
    }
    void draw(){
        System.out.println("draw method of child called");
    }
}

class Demo13{
    public static void main(String args[]){
        Parent obj = new Child(); // upcasting
        obj.show();
        obj.display();
        Child cobj = (Child)obj; // downcasting
        cobj.draw();
    }
}

