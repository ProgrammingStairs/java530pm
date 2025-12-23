// example showing the concept of method reference
import java.util.Scanner;
@FunctionalInterface
interface Showable{
    int calculate(int a,int b);
}
class Demo4{
    static int result(int a,int b){
        return a+b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a and b : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            
        Showable obj;
        obj = Demo4 :: result;
        System.out.println("Sum : "+obj.calculate(a,b));
    }
}