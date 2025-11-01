// example showing the concept of 2d array

import java.util.Scanner;
class Demo4{
    public static void main(String args[]){        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        int arr[][] = new int[size][];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter no. of columns for "+(i+1)+" row : ");
            int col = sc.nextInt();
            arr[i] = new int[col];
            System.out.println("Enter elements for "+(i+1)+" row : ");
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array elements are : ");
        for(int ar[] : arr){
            for(int element : ar)
                System.out.print(element+"\t");
            System.out.println();
        }
    }
}

