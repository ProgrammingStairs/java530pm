// example showing the concept of function

class Demo5{
    // We can create n no. of functions
    void display(){
        System.out.println("Display method called");
        draw();
    }
    void draw(){
        System.out.println("Draw method called");
    }
    void view(){
        System.out.println("View method called");
    }
    public static void main(String args[]){
        Demo5 obj1 = new Demo5();
        Demo5 obj2 = new Demo5();
        obj1.display();
        obj2.view();
    }
}