// example showing the concept of object class methods

class Demo3{
    public static void main(String args[]){
        //Demo3 obj = new Demo3();
        Object obj = new String();
        Class c = obj.getClass();    
        System.out.println("signature : "+c);
        System.out.println("class name : "+c.getName());
    }
}