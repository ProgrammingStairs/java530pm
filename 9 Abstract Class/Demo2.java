// example showing the concept of abstract class

abstract class RBI{
   abstract double rate();
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
        return 2.34;
    }
}

class Demo2{
    public static void main(String args[]){
        RBI obj;
        obj = new BOI();
        System.out.println("rate provided by BOI : "+obj.rate());
        obj = new SBI();
        System.out.println("rate provided by SBI : "+obj.rate());
        obj = new PNB();
        System.out.println("rate provided by PNB : "+obj.rate());
    }
}

