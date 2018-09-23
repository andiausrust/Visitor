package com.andi;

import java.text.DecimalFormat;

public class TaxVisitor implements Visitor {

    @Override
    public double visitor(Shirt shirtItem) {
        System.out.println("Shirt final price with tax: ");
        return (shirtItem.getPrice()* .10 +
                shirtItem.getPrice());
    }

    @Override
    public double visitor(TShirt tShirt) {
        System.out.println("TShirt final price with tax: ");
        return (tShirt.getPrice()* .18 +
                tShirt.getPrice());    }

    @Override
    public double visitor(Jacket jacket) {
        System.out.println("Jacket final price with tax: ");
        return (jacket.getPrice()* .25 +
                jacket.getPrice() );    }
}
