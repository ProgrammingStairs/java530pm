// example showing the concept of nested class in java

// non static nested class | member class
class EnclosingClass{    
        void display(){
            Demo obj = new Demo();
            obj.display();
        }
        // member class
        class Demo{
            void display(){
                System.out.println("Display method called");
            }
        }
   }
class Demo5{
    public static void main(String args[]){
        EnclosingClass eobj = new EnclosingClass();
        eobj.display();
    }
}