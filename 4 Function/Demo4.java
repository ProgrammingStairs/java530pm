// example showing the concept of function

class Demo4{
    // We can create n no. of functions
    void display(){
        System.out.println("Display method called");
        draw();
    }
    void draw(){
        System.out.println("Draw method called");
        view();
    }
    void view(){
        System.out.println("View method called");
    }
    public static void main(String args[]){
        Demo4 obj = new Demo4();
        obj.display();
    }
}