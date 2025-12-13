// example showing the concept of method overriding

class Parent{
    void shape(){
        System.out.println("Its Shape");
    }
}
class Circle extends Parent{
    @Override
    void shape(){
        System.out.println("Its Circle Shape");
    }
}
class Rectangle extends Parent{
    @Override
    void shape(){
        System.out.println("Its Rectangle Shape");
    }
}
class Square extends Parent{}

class Demo11{
    public static void main(String args[]){
        Circle cobj = new Circle();
        cobj.shape();
        Rectangle robj = new Rectangle();
        robj.shape();
        Square sobj = new Square();
        sobj.shape();
    }
}

