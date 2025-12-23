// example showing the concept of Exception handling

import java.util.Scanner;
class Demo2{
    void divide(int a,int b){
        int c = a/b;
        System.out.println("Result : "+c);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Demo2 obj = new Demo2();
        try{
            obj.divide(a,b);
        }catch(ArithmeticException e){
            e.printStackTrace();
        }    
    }   
}