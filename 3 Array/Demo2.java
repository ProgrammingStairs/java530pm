// example showing the concept of array

class Demo2{
    public static void main(String args[]){        
        int arr[] = new int[]{1,2,3,4,5};
        System.out.println("Array elements are : ");
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+"\t");
        // }

        for(int element : arr){
            System.out.print(element+"\t");
        }
    }
}