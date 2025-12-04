// example showing the concept of varargs
class Demo10{
    void test(int...var){
        System.out.println("No. of arguments : "+var.length);
    }
    public static void main(String...args){
        Demo10 obj = new Demo10();
        obj.test(10,20);
        obj.test(10,20,30);
        obj.test(10,20,30,40);
        obj.test(new int[]{10,20,30,40,50});
    }
}