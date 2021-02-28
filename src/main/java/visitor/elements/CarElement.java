package visitor.elements;

import visitor.visitors.Visitor;

public class CarElement implements Element {
    private String brand;
    private String name;

    public CarElement(String brand, String name) {
        this.brand = brand;
        this.name = name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
