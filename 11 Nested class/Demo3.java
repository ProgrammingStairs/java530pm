// example showing the concept of nested class in java

// non static nested class
class EnclosingClass{
    static int age=70;
    static private String name = "Andrew Anderson";  
    double weight = 56.43;
    class NonStaticNestedClass{
        void display(){
            System.out.println("Name : "+name);
            System.out.println("Age : "+age);
            System.out.println("Weight : "+weight);
        }
    }
    public static void main(String args[]){
        EnclosingClass eobj = new EnclosingClass();
        NonStaticNestedClass obj = eobj.new NonStaticNestedClass();
        obj.display();
    }
}