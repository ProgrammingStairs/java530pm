// example showing the concept of constructor overloading

class Demo10{
    Demo10(int a,double b){
        double res = a>b ? a : b;
        System.out.println("Greater Number : "+res);
    }
    Demo10(double a,int b){
        double res = a>b ? a : b;
        System.out.println("Greater Number : "+res);
    }
    public static void main(String args[]){
        new Demo10(45,5.6);
        new Demo10(45.56,7);
    }
}

