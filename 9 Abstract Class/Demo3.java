// example showing the concept of abstract class

import java.util.Scanner;
abstract class RBI{
   RBI(){
    System.out.println("Welcome to Bank");
   } 
   abstract double rate();
   double finalSum(int bal,double rate){
        return bal + rate/100*bal;
   }
}
class BOI extends RBI{
    @Override
    double rate(){
        return 1.45;
    }
}
class SBI extends RBI{
    @Override
    double rate(){
        return 2.34;
    }
}
class PNB extends RBI{
    @Override
    double rate(){
        return 2.02;
    }
}

class Demo3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Balance : ");
        int bal = sc.nextInt();
        RBI obj;
        obj = new BOI();
        System.out.println("final sum provided by BOI : "+obj.finalSum(bal,obj.rate()));
        obj = new SBI();
        System.out.println("final sum provided by SBI : "+obj.finalSum(bal,obj.rate()));
        obj = new PNB();
        System.out.println("final sum provided by PNB : "+obj.finalSum(bal,obj.rate()));
    }
}

