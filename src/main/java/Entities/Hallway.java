package Entities;

import java.util.List;

public class Hallway {
    private final String name;
    private final List<Product> productList;

    public Hallway(String name, List<Product> productList) {
        this.name = name;
        this.productList = productList;
    }

    public String getName() {
        return name;
    }

    public List<Product> getProductList() {
        return productList;
    }
}
