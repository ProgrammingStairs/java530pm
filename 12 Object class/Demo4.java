// example showing the concept of object class methods

@Deprecated
class Demo4{
    @Override
    protected void finalize(){
        System.out.println("finalize method called..!!");
    }
    public static void main(String args[]){
        Demo4 obj = new Demo4();
        System.out.println("Object created successfully");

        obj = null;
        System.gc();
        System.out.println("Garbage collector works successfully");
    }
}