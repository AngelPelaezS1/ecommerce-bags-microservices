package com.bags.ecommerce.catalog.service;

import com.bags.ecommerce.catalog.dtos.CreateBagRequest;
import com.bags.ecommerce.catalog.entity.Bag;
import com.bags.ecommerce.catalog.mappers.BagMapper;
import com.bags.ecommerce.catalog.repository.BagRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BagService {

    private final BagRepository bagRepository;
    private final BagMapper bagMapper;

    public BagService(BagRepository bagRepository, BagMapper bagMapper) {
        this.bagRepository = bagRepository;
        this.bagMapper = bagMapper;
    }

    public Bag createBag(CreateBagRequest dto, UUID ownerId){
        Bag bag = bagMapper.toEntity(dto, ownerId);
        return bagRepository.save(bag);
    }
}
