package com.andi;

public interface Visitor {

    double visitor(Shirt shirtItem);
    double visitor(TShirt tShirt);
    double visitor(Jacket jacket);
}
