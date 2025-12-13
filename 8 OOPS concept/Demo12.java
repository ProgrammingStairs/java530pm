// example showing the concept of method overriding

class RBI{
    double rate(){
        return 1.0;
    }
}
class BOI extends RBI{
    double rate(){
        return 1.45;
    }
}
class SBI extends RBI{
    double rate(){
        return 2.34;
    }
}
class PNB extends RBI{}

class Demo12{
    public static void main(String args[]){
        BOI bobj = new BOI();
        System.out.println("rate provided by BOI : "+bobj.rate());
        SBI sobj = new SBI();
        System.out.println("rate provided by SBI : "+sobj.rate());
        PNB pobj = new PNB();
        System.out.println("rate provided by PNB : "+pobj.rate());
    }
}

