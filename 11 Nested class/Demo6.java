// example showing the concept of nested class in java

// non static nested class | local class
class EnclosingClass{    
        void display(){
            // local class
            class Demo{
                void display(){
                    System.out.println("Display method called");
                }
            }
            Demo obj = new Demo();
            obj.display();
        }
   }
class Demo6{
    public static void main(String args[]){
        EnclosingClass eobj = new EnclosingClass();
        eobj.display();
    }
}