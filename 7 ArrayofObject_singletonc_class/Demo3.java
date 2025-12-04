// example showing the concept of singleton class
// Eager initialization
class Singleton{
    static final private Singleton instance = new Singleton();
    private Singleton(){}
    static Singleton getInstance(){
        return instance;
    }
    int a = 100;
    static void display(){
        System.out.println("display method called : "+instance);
    }
}   
class Demo3{
   public static void main(String args[]){
        Singleton.display();

        // Singleton obj1 = Singleton.getInstance();
        // System.out.println("value of a : "+obj1.a);
        // obj1.a+=100;
        // System.out.println("value of a : "+obj1.a);

        // Singleton obj2 = Singleton.getInstance();
        // System.out.println("value of a : "+obj2.a);
       
   }
}