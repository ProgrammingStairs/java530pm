/*
    Final keyword : 
        a. variable : final variable cannot be modified
        b. class : final class cannot be extended
        c. method : final method cannot be overridden
*/ 
import java.util.Scanner;
class Demo3{
    final int MIN;
    int NORM; 
    {
        Scanner sc = new Scanner(System.in);
        MIN = sc.nextInt();
    }
    public static void main(String args[]){
        final int MAX = 100;
        System.out.println("MAX : "+MAX);
        Demo3 obj = new Demo3();
        System.out.println("NORM : "+obj.NORM);
        System.out.println("MIN : "+obj.MIN);
    }
}