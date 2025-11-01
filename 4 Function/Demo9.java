// example showing the concept of function
// with argument with return type

import java.util.Scanner;
class Demo9{
    int addition(int x,int y){ // with return type
        return  x+y;
    }
    public static void main(String args[]){
        Demo9 obj = new Demo9();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Addition : "+obj.addition(a,b));
    }
}