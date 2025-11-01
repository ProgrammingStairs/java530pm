// example showing the concept of if else statement 

import java.util.Scanner;
class Demo4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter salary : ");
        int salary = sc.nextInt();
        System.out.println("Enter experience : ");
        int experience = sc.nextInt();
        
        if(salary>=20000 && experience>=5)
            System.out.println("gets hike");
        else
            System.out.println("not eligible to get hike");
    }
}

