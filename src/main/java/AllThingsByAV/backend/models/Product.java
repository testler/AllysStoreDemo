package AllThingsByAV.backend.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Product implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final Long id;

    private final String name;

    private final String image;

    private final Long description;

    private final Double price;

    private final Boolean inStock;
//    @ManyToOne
//    @JoinColumn(name="category_id")
//    private Category category;

    public Product(Long id, String name, String picture, Long description, Double price, Boolean inStock) {
        this.id = id;
        this.name = name;
        this.image = picture;
        this.description = description;
        this.price = price;
        this.inStock = inStock;
    }
    public Product() {
        this.id = null;
        this.name = "";
        this.image = "";
        this.description = null;
        this.price = 0.00;
        this.inStock = false;
    }

    public Long getId() {
        return id;
    }
}
