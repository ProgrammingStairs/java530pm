// example showing the concept of function
// with argument no return type

import java.util.Scanner;
class Demo8{
    void addition(int x,int y){ // no return type
        System.out.println("Addition : "+(x+y));
    }
    public static void main(String args[]){
        Demo8 obj = new Demo8();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        obj.addition(a,b);
    }
}