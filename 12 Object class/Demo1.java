// example showing the concept of object class methods

class Student{
    int sid;
    String name;
    Student(int sid,String name){
        this.sid=sid;
        this.name=name;
    }
    @Override
    public String toString(){
        return "{ "+sid+" , "+name+" }";
    }
    public static void main(String args[]){
        Student s1 = new Student(101,"Andrew Anderson");
        Student s2 = new Student(102,"Peter Parker");

        System.out.println("s1 : "+s1.toString()+" hashCode : "+s1.hashCode());
        System.out.println("s2 : "+s2.toString()+" hashCode : "+s2.hashCode());        
    }
}