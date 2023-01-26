package at.xxx.examples.cars;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String color;
    private int basePrice;
    private int basicUse;
    private List<Producer>producer;
    private Engine engine;

    public Car(String color, int basePrice, int basicUse, Engine engine) {
        this.color = color;
        this.basePrice = basePrice;
        this.basicUse = basicUse;
        this.producer = new ArrayList<>();
        this.engine=engine;

    }


    public List<Producer> getProducer() {
        return producer;
    }

    public void setProducer(List<Producer> producer) {
        this.producer = producer;
    }

    public void addProducer(Producer producer){
        this.producer.add(producer);
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public int getBasicUse() {
        return basicUse;
    }

    public void setBasicUse(int basicUse) {
        this.basicUse = basicUse;
    }



}
