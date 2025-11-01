// example showing the concept of function

class Demo3{
    // We can create n no. of functions
    void display(){
        System.out.println("Display method called");
    }
    void draw(){
        System.out.println("Draw method called");
    }
    void view(){
        System.out.println("View method called");
    }
    public static void main(String args[]){
        Demo3 obj = new Demo3();
        obj.display();
        obj.display();
        obj.display();
        obj.display();
        obj.draw();
        obj.view();
    }
}