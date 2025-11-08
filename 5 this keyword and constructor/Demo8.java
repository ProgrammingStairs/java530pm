// program
// this keyword is used to return current class instance
class Demo8{
    Demo8 show(){
        System.out.println("show method called");
        return this;
    }
    void display(){
        System.out.println("display method called");
    }
    public static void main(String args[]){
        Demo8 obj = new Demo8();
        Demo8 obj1 = obj.show();
        obj1.display();
    }
}