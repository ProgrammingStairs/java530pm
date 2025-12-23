// example showing the concept of Exception handling

class Demo8{
    public static void main(String args[]){
        int valid = 0, invalid = 0;
        for(String str : args){
            try{
                Integer.parseInt(str);
                valid++;
            }catch(NumberFormatException e){
                invalid++;
            }
        }
        System.out.println("Invalid : "+invalid);
        System.out.println("Valid : "+valid);
    }   
}