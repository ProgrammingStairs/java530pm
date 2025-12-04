// example showing the concept of array of object

class Product{
    int pid;
    String productName;
    double price;
    Product(int pid,String productName,double price){
        this.pid=pid;
        this.productName = productName;
        this.price=price;
    }
    void display(){
        System.out.println("\nProductName : "+productName+"\nPrice : "+price+"\nId : "+pid);
    }
}
class Demo1{
    public static void main(String args[]){
        Product pobj[] = new Product[2];
        System.out.println("pobj[0] : "+pobj[0]);
        System.out.println("pobj[1] : "+pobj[1]);
        
        pobj[0] = new Product(121,"Soap",90.87);
        pobj[1] = new Product(131,"Fairness Cream",904.87);

        System.out.println("pobj[0] : "+pobj[0]);
        System.out.println("pobj[1] : "+pobj[1]);

        for(Product p : pobj){
            p.display();
        }
    }
}