package at.xxx.examples.cars;

public class Producer {
    private double discount;
    private String name;
    private String country;

    public Producer(int discount, String name, String country) {
        this.discount = discount;
        this.name = name;
        this.country = country;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
