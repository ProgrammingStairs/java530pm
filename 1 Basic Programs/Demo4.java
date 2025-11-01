// program to find out sum and average of three numbers

class Demo4{
    public static void main(String args[]){
        int a = 1, b = 3, c = 7;
        System.out.println("value of a : "+a);
        System.out.println("value of b : "+b);
        System.out.println("value of c : "+c);
        
        int sum = a+b+c;
        System.out.println("Sum : "+sum);
        
        double avg = sum/3.0;
        System.out.println("Avg : "+avg);
        System.out.printf("Avg : %.2f",avg);
    }
}