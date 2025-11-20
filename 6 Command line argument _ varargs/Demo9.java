class Demo{
    static{
        System.out.println("statement 4");
    }
    static void display(){}
}
class Demo9{
    static{
        System.out.println("statement 1");
    }
    public static void main(String args[]){
        System.out.println("statement 3");
        Demo.display();
    }
    static{
        System.out.println("statement 2");
    }
}