// example showing the concept of switch control statement
class Demo9{
    public static void main(String args[]){
       int i=1,num=10;
       switch(i++){
        case 3 : num++; 
        case -4: num--; 
                 break;
        case 1:  --num; // 9
        case 0 : --num; // 8
        case -2: num++; // 8
        default : System.out.println("Result : "+num++); // 9
                    break;
       }   
    }
}

