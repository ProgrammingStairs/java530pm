// example showing the concept of interface

interface Showable{
    int age=100;
    void getAge();
}
class Demo10{
    public static void main(String args[]){
        new Showable(){
            @Override
            public void getAge(){
                System.out.println("Age : "+age);
            }
        }.getAge();
    }
}