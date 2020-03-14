import com.mongodb.DBObject;

public class Person {

    private String id;
    private String name;
    private Address address;

    public Person() {
        id = "jojo";
        name = "Jotaro Joestar";
        address = new Address("Joestreet", "Joecity", "12 3456 7JOE");
    }

    public Person(String id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
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
}
