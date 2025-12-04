// example showing the concept of initializer block 
/*
    initializer block : 
        static block -> static initializer block

        instance initializer block
*/

class Demo5{
    int a;
    {
        a=100;
    }
    public static void main(String args[]){
        Demo5 obj = new Demo5();
        System.out.println("value of a : "+obj.a);
    }
}