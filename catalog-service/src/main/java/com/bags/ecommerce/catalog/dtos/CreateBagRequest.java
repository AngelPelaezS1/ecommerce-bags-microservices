package com.bags.ecommerce.catalog.dtos;

import com.bags.ecommerce.catalog.enums.Category;
import com.bags.ecommerce.catalog.enums.Condition;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateBagRequest {

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

    @NotNull
    private Category category;

    @NotNull
    private Condition condition;
}
