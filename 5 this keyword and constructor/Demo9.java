// program showing the concept of constructor
class Demo9{
    Demo9(){
        System.out.println("constructor called");
    }
    public static void main(String args[]){
        new Demo9();
        new Demo9();
        new Demo9();
        new Demo9();
    }
}