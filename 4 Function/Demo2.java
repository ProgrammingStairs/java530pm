// example showing the concept of function

class Demo2{
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
        new Demo2().display();   // Anonymous object
        new Demo2().display();   // Anonymous object
        new Demo2().display();   // Anonymous object
        new Demo2().display();   // Anonymous object
        new Demo2().draw(); // Anonymous object
        new Demo2().view(); // Anonymous object
    }
}