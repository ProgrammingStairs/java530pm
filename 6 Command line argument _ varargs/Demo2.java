// example showing the concept of command line argument

class Demo2{
    public static void main(String args[]){
        int sum=0;
        System.out.println("Elements are : ");
        for(String element :  args){
            sum  = sum + Integer.parseInt(element);
        }
        System.out.println("\nLength : "+args.length);
        System.out.println("\nSum : "+sum);
    }
}