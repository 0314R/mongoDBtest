public class Address {
    private String street;
    private String city;
    private String phone;

    public Address() {
        street = "123 Fake Street";
        city = "Faketon";
        phone = "12 3456 7890";
    }

    public Address(String street, String city, String phone) {
        this.street = street;
        this.city = city;
        this.phone = phone;
    }


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
