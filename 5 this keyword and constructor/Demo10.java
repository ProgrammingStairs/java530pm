// program showing the concept of constructor
class Demo10{
    Demo10(){
        int rno=101;
        String name = "Andrew Anderson";
        System.out.println("no argument constructor called");
        System.out.println("name : "+name);
        System.out.println("rollnumber : "+rno);
    }
    public static void main(String args[]){
        new Demo10();
    }
}