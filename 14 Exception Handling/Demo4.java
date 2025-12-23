// example showing the concept of Exception handling

class Demo4{
    static String str;
    public static void main(String args[]){
       try{
            System.out.println("length : "+str.length());
       }catch(NullPointerException e){
        System.out.println("Exception : "+e.getMessage());
       }
    }   
}