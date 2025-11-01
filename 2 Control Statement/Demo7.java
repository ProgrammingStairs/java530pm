// example showing the concept of switch control statement
/*
    Switch control statement :
        Switch control statement is mainly used for menu based programming
        It works on the concept of cases.
        Duplicate cases not allowed

        switch(constant | variable | expression){
            case 1 : ...
                    break;
            case 'a' : ...
                    break;
            case 'A' : ...
                    break;
            case '+' : ...
                    break;
            default : ...
                    break;
        }
*/
class Demo7{
    public static void main(String args[]){
       switch(0){
        case 0 : System.out.println("statement 1");
                    break;
        case 1 : System.out.println("statement 2");
                    break;
        case 2 : System.out.println("statement 3");
                    break;
        default : System.out.println("Invalid selection");
                    break;
       }   
    }
}

