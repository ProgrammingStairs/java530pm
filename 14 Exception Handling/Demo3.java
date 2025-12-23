// example showing the concept of Exception handling

import java.util.Scanner;
class Demo3{
    static void divide(int a,int b){
        try{
            int c = a/b;
            System.out.println("Result : "+c);
        }catch(ArithmeticException e){
            e.printStackTrace();
        }finally{
            System.out.println("finally block executes");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        divide(a,b);    
    }   
}