// example showing the concept of interface

interface Showable{
    int age=100;
}
// class Demo6 implements Showable{
//     public static void main(String args[]){
//         System.out.println("Age : "+age);
//     }
// }

class Demo6{
    public static void main(String args[]){
        System.out.println("Age : "+Showable.age);
    }
}