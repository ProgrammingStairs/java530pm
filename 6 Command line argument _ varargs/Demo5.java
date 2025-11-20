/*
    Final keyword : 
        a. variable : final variable cannot be modified
        b. class : final class cannot be extended
        c. method : final method cannot be overridden
*/ 
class Demo5{
    public static void main(String args[]){
        final int arr[] = {1,2,3,4,5};
        int arr1[] = {11,22,33,44,55};
        arr = arr1; // gives error
        System.out.println("Array elements are : ");
        for(int element : arr){
            System.out.print(element+"\t");
        }
    }
}