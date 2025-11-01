// example showing the concept of function
// no argument with return type

import java.util.Scanner;
class Demo7{
    int addition(){ // with return type
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        return a+b;
    }
    public static void main(String args[]){
        Demo7 obj = new Demo7();
        int res = obj.addition(); // no argument
        System.out.println("Addition : "+res);

        System.out.println("Addition : "+obj.addition());
    }
}