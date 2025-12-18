// example showing the concept of interface

interface Showable{
    default void show(){
        printData();
        System.out.println("show method called");
    }
    default void display(){
        printData();
        System.out.println("display method called");
    }
    private void printData(){
        System.out.println("statement 1");
        System.out.println("statement 2");
        System.out.println("statement 3");
    }
    static void title(){
        System.out.println("####### Welcome to Interface #######");
    }
}
class Demo11 implements Showable{
    public static void main(String args[]){
        Showable.title();
        Showable obj = new Demo11();
        obj.show();
        obj.display();
    }
}