// example showing the concept of nested class in java
// static nested class
class EnclosingClass{
    static int age=70;
    static private String name = "Andrew Anderson";  
    static class StaticNestedClass{
        void display(){
            System.out.println("Name : "+name);
            System.out.println("Age : "+age);
        }
    }
}
class Demo2{
    public static void main(String args[]){
        EnclosingClass.StaticNestedClass obj = new EnclosingClass.StaticNestedClass();
        obj.display();
    }
}