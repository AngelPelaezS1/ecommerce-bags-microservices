package com.bags.ecommerce.catalog.entity;

import com.bags.ecommerce.catalog.enums.Category;
import com.bags.ecommerce.catalog.enums.Condition;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "bags")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Bag {

    @Id @GeneratedValue
    private UUID id;

    @NotBlank
    private String brand;

    @NotBlank
    private String model;

    @NotBlank
    private String description;

    @NotBlank
    private String dimensions;

    @NotBlank
    private String mainImageUrl;

    @NotNull
    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    @NotNull
    private Category category;

    @Enumerated(EnumType.STRING)
    @NotNull
    private Condition condition;

    private UUID ownerId;

}
