// program showing the concept of Deep copy
class Address{
    String state,city;
    Address(String city,String state){
        this.state=state;
        this.city=city;
    }
    Address(Address address){
        this.state = address.state;
        this.city = address.city;
    }
}
class Student{
    int sid;
    String name;
    Address address;
    Student(int sid,String name,Address address){
        this.sid=sid;
        this.name=name;
        this.address=address;
    }
    Student(Student s1){
        sid = s1.sid;
        name = s1.name;
        address = new Address(s1.address);
    }
}
class Demo16{
    public static void main(String args[]){
        Address address = new Address("Indore","Madhya Pradesh");
        Student s1 = new Student(101,"Andrew Anderon",address);
        Student s2 = new Student(s1);
        s2.address.city = "Agra";
        s2.address.state = "UP";

        System.out.println("\n Student details : \n");
        System.out.println("Roll Number : "+s1.sid);
        System.out.println("Name : "+s1.name);
        System.out.println("Address : "+s1.address.city+" "+s1.address.state);

        System.out.println("\nStudent details(copy) : \n");
        System.out.println("Roll Number : "+s2.sid);
        System.out.println("Name : "+s2.name);
        System.out.println("Address : "+s2.address.city+" "+s2.address.state);

    }
}


















