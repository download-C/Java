package chapter13_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Customer {
    String name;
    int num;

    Customer(String name, int num) {
        this.name = name;
        this.num = num;
    }

    @Override
    public String toString() {
        return name+", "+num;
    }
}

public class CustomerTest {
    public static void main(String[] args) {

        ArrayList<Customer> cl = new ArrayList<>();
        cl.add(new Customer("홍길동", 1));
        cl.add(new Customer("김길동", 2));
        cl.add(new Customer("최길동", 3));

        Stream<Customer> stream = cl.stream();
        stream.forEach(s -> System.out.println(s+" "));
        System.out.println();

        cl.stream().sorted().forEach(s -> System.out.println(s));
    }


}
