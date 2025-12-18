// example showing the concept of interface

interface Showable{
    int age=100;
}
interface Movable{
    int age=200;
}

class Demo7 implements Showable,Movable{
    public static void main(String args[]){
        System.out.println("Age : "+Showable.age);
        System.out.println("Age : "+Movable.age);
    }
}