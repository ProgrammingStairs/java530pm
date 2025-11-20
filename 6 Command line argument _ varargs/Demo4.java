/*
    Final keyword : 
        a. variable : final variable cannot be modified
        b. class : final class cannot be extended
        c. method : final method cannot be overridden
*/ 
class Demo4{
    public static void main(String args[]){
        final int arr[] = {1,2,3,4,5};
        arr[2] = 567;
        System.out.println("Array elements are : ");
        for(final int element : arr){
            System.out.print(element+"\t");
        }
    }
}