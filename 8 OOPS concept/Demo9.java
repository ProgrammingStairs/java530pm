// example showing the concept of method overloading

class Demo9{
    void greater(int a,double b){
        double res = a>b ? a : b;
        System.out.println("Greater Number : "+res);
    }
    void greater(double a,int b){
        double res = a>b ? a : b;
        System.out.println("Greater Number : "+res);
    }
    public static void main(String args[]){
        Demo9 obj = new Demo9();
        obj.greater(45,5.6);
        obj.greater(45.56,7);
    }
}