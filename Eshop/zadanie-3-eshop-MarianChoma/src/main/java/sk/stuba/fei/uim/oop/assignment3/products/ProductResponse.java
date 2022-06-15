package sk.stuba.fei.uim.oop.assignment3.products;

import lombok.Getter;

@Getter
public class ProductResponse {
    private final Long id;
    private final String name;
    private final String description;
    private final int amount;
    private final String unit;
    private final Double price;

    public ProductResponse(Product product) {
        this.id= product.getProductId();
        this.amount= product.getAmount();
        this.description=product.getDescription();
        this.name=product.getName();
        this.unit=product.getUnit();
        this.price=product.getPrice();
    }
}
