package BeanViaXML;

public class Student {

    private String name;

    private Address address;

    public Student() {
        System.out.println("default constructor of Student");
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
