package com.andi;

public class Main {

    public static void main(String[] args) {

        TaxVisitor taxVisitor = new TaxVisitor();

        Jacket  jacket = new Jacket(45.99);
        TShirt tShirt = new TShirt(24.99);
        Shirt shirt = new Shirt(19.99);

        // use tax calculations
        System.out.println(jacket.accept(taxVisitor));
        System.out.println(tShirt.accept(taxVisitor));
        System.out.println(shirt.accept(taxVisitor));
    }
}
