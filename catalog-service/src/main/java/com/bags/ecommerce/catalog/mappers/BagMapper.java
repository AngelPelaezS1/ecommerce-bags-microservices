package com.bags.ecommerce.catalog.mappers;

import com.bags.ecommerce.catalog.dtos.CreateBagRequest;
import com.bags.ecommerce.catalog.entity.Bag;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class BagMapper {

    public Bag toEntity(CreateBagRequest dto, UUID ownerId) {
        Bag bag = new Bag();
        bag.setBrand(dto.getBrand());
        bag.setModel(dto.getModel());
        bag.setDescription(dto.getDescription());
        bag.setDimensions(dto.getDimensions());
        bag.setMainImageUrl(dto.getMainImageUrl());
        bag.setPrice(dto.getPrice());
        bag.setCategory(dto.getCategory());
        bag.setCondition(dto.getCondition());
        bag.setOwnerId(ownerId);
        return bag;
    }

}
