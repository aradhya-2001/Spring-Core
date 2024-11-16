package BeanViaXML;

public class Address {

    private int sNum;

    private String city;

    public Address(){
        System.out.println("default constructor of Address");
    }

    public int getsNum() {
        return sNum;
    }

    public void setsNum(int sNum) {
        this.sNum = sNum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void beanInit(){
        System.out.println("Address Bean is created");
    }

    public void beanDestroy(){
        System.out.println("Address Bean is destroyed");
    }
}
