// example showing the concept of Exception handling

class Demo5{
    public static void main(String args[]){
        String str = "Andrew";
        int arr[] = {1,2,3,4,5};

        // try with multiple catch
        /*
            try{
                System.out.println("arr[2] : "+arr[2]);
                System.out.println("str.charAt(2) : "+str.charAt(27));
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Exception : "+e);
            }catch(StringIndexOutOfBoundsException e){
                System.out.println("Exception : "+e);
            }
        */
       // try with generalized catch
       try{
            System.out.println("arr[2] : "+arr[2]);
            System.out.println("str.charAt(2) : "+str.charAt(27));
        }catch(ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e){
            System.out.println("Exception : "+e);
        }
    }   
}