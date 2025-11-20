// program to count no. of objects created
class Demo8{
    static int count=0;
    Demo8(){
        count++;
    }
    public static void main(String args[]){
        new Demo8();
        new Demo8();
        new Demo8();
        new Demo8();
        new Demo8();
        System.out.println("No. of objects created : "+count);
    }
}