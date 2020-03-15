import com.mongodb.DBObject;

import java.util.Arrays;
import java.util.List;

public class Person {

    private String id;
    private String name;
    private Address address;
    private List<Integer> books;

    public Person() {
        id = "jojo";
        name = "Jotaro Joestar";
        address = new Address("Joestreet", "Joecity", "12 3456 7JOE");
    }

    public Person(String id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.books = Arrays.asList(27464, 747854);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Integer> getBooks() {
        return books;
    }

    public void setBooks(List<Integer> books) {
        this.books = books;
    }
}
