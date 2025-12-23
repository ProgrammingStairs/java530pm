// example showing the concept of Exception handling

class Demo7{
    public static void main(String args[]){
        try{   
            Class.forName("Demo6");
            System.out.println("Class Found");
        }catch(ClassNotFoundException e){
            System.out.println("Exception : "+e);
        }
    }   
}