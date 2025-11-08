// program
// this keyword is used to pass as an argument in function calling
class Demo7{
    void show(){
        System.out.println("show method called");
        display(this);
    }
    void display(Demo7 obj){
        System.out.println("display method called, default string representation of object : "+obj);
    }
    public static void main(String args[]){
        Demo7 obj = new Demo7();
        obj.show();
    }
}