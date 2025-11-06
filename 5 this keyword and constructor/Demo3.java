// program
class Demo3{
    int a,b; // instance variable
    public static void main(String args[]){
        Demo3 obj1 = new Demo3(); // obj1 gets a and b
        obj1.a = 100;
        obj1.b = 200;
        System.out.println("value of obj1 instance variable : \na : "+obj1.a+"\nb : "+obj1.b);
        Demo3 obj2 = new Demo3(); // obj2 gets a and b
        System.out.println("value of obj2 instance variable : \na : "+obj2.a+"\nb : "+obj2.b);
        
    }
}