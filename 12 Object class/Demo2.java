// example showing the concept of object class methods

class Student{
    @Override
    public boolean equals(Object o){
        if(this==o)
            return true;
        else
            return false;
    }
}
class Demo2{
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student();
        if(s1.equals(s2))
            System.out.println("Both are equal");
        else 
            System.out.println("Both are not equals");
    }
}