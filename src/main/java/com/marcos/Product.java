package com.marcos;

import java.util.ArrayList;

public record Product (String name, Double price, ArrayList<Tag> tags){

    public Product {
        if(price < 0.0 ){
            throw new IllegalArgumentException("Price must be grater than 0!");
        }

    }
}
