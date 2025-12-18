// example showing the concept of interface

interface Showable{
    void display();
}
interface Movable extends Showable{
    void show();
}
class Demo5 implements Movable{
    @Override
    public void display(){
        System.out.println("display method called");
    }
    @Override
    public void show(){
        System.out.println("show method called");
    }
    public static void main(String args[]){
        Movable obj = new Demo5();
        obj.display();
        obj.show();
    }
}