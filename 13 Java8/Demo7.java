// example showing the concept of Predicate
import java.util.function.Predicate;
class Demo7{
    public static void main(String args[]){
        Predicate<Integer> lessThan = i -> i<100;
        System.out.println("Result : "+lessThan.test(34)); 
        System.out.println("Result : "+lessThan.test(346)); 
        System.out.println("Result : "+lessThan.negate().test(346)); 

        Predicate<Integer> greaterThan = i -> i>100;
        System.out.println("Result : "+lessThan.and(greaterThan).test(34)); 
        System.out.println("Result : "+lessThan.or(greaterThan).test(34)); 

        Predicate<String> str = Predicate.isEqual("Andrew");
        System.out.println("Result : "+str.test("Andrew"));
        System.out.println("Result : "+str.test("AndreW"));
    }
}

