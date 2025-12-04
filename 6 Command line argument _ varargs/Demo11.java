// example showing the concept of varargs
class Demo11{
    void test(String name,int...var){
        System.out.println("\nNo. of arguments : "+(var.length+1));
        System.out.print(name+"\t");
        for(int element : var){
            System.out.print(element+"\t");
        }
    }
    public static void main(String...args){
        Demo11 obj = new Demo11();
        obj.test("noname",10,20);
        obj.test("noname",10,20,30);
        obj.test("noname",10,20,30,40);
        obj.test("noname",new int[]{10,20,30,40,50});
    }
}