package com.andi;

public class Jacket implements Visitable {

    private double price;

    @Override
    public double accept(Visitor visitor) {
        return visitor.visitor(this);    }

    public Jacket(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
