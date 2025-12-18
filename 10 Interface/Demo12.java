// example showing the concept of interface

interface Showable{
    default void show(){}
}
interface Movable{
    default void show(){}
}
class Demo12 implements Showable,Movable{
    @Override
    public void show(){
        System.out.println("show method called");
    }

    public static void main(String args[]){
        Showable obj = new Demo12();
        obj.show();
    }
}