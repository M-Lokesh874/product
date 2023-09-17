package com.product.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "product")
public class Product extends BaseEntity {

    private String name;
    private String description;
    private String discountPrice;
    private String actualPrice;

}
