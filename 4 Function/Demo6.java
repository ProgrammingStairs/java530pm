// example showing the concept of function
// no argument no return type

import java.util.Scanner;
class Demo6{
    void addition(){ // no return type
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Addition : "+(a+b));
    }
    public static void main(String args[]){
        Demo6 obj = new Demo6();
        obj.addition(); // no argument
    }
}