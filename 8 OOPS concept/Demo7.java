// example showing the concept of getter and setter method

class Demo{
    private String name;
    // setter method
    public void setName(String name){
        this.name=name;
    }
    // getter method
    public String getName(){
        return name;
    }
}
class Demo7{
    public static void main(String args[]){
        Demo obj = new Demo();
        obj.setName("Andrew Anderson");
        System.out.println("Name : "+obj.getName());
    }
}