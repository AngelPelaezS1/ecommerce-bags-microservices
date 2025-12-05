package com.bags.ecommerce.catalog.mappers;

import com.bags.ecommerce.catalog.dtos.BagResponse;
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

    public BagResponse toResponse(Bag bag) {
        BagResponse response = new BagResponse();
        response.setId(bag.getId());
        response.setBrand(bag.getBrand());
        response.setModel(bag.getModel());
        response.setDescription(bag.getDescription());
        response.setDimensions(bag.getDimensions());
        response.setMainImageUrl(bag.getMainImageUrl());
        response.setPrice(bag.getPrice());
        response.setCategory(bag.getCategory());
        response.setCondition(bag.getCondition());
        return response;
    }
}
