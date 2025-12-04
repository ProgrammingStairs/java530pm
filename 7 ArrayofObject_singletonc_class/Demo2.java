// example showing the concept of array of object

import java.util.Scanner;
class Product{
    int pid;
    String productName;
    double price;
    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product Id : ");
        pid = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Product name : ");
        productName = sc.nextLine();
        System.out.println("Enter Product price : ");
        price = sc.nextDouble();
    }
    void display(){
        System.out.println("\nProductName : "+productName+"\nPrice : "+price+"\nId : "+pid);
    }
}
class Demo2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of products : ");
        int num = sc.nextInt();

        Product pobj[] = new Product[num];
        // System.out.println("pobj[0] : "+pobj[0]);
        // System.out.println("pobj[1] : "+pobj[1]);

        for(int i=0;i<pobj.length;i++){
            pobj[i] = new Product();
            pobj[i].getData();
        }
        // pobj[0] = new Product(121,"Soap",90.87);
        // pobj[1] = new Product(131,"Fairness Cream",904.87);

        // System.out.println("pobj[0] : "+pobj[0]);
        // System.out.println("pobj[1] : "+pobj[1]);

        for(Product p : pobj){
            p.display();
        }
    }
}