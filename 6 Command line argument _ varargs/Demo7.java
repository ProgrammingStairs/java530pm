class Demo{
    static int a = 100;
    static void display(){
        System.out.println("value of a : "+a);
    }
}
class Demo7{
    public static void main(String args[]){
        System.out.println("a : "+Demo.a);
        Demo.display();
    }
}