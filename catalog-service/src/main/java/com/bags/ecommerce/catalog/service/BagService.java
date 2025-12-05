package com.bags.ecommerce.catalog.service;

import com.bags.ecommerce.catalog.dtos.BagResponse;
import com.bags.ecommerce.catalog.dtos.CreateBagRequest;
import com.bags.ecommerce.catalog.entity.Bag;
import com.bags.ecommerce.catalog.exceptions.BagNotFoundException;
import com.bags.ecommerce.catalog.mappers.BagMapper;
import com.bags.ecommerce.catalog.repository.BagRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class BagService {

    private final BagRepository bagRepository;
    private final BagMapper bagMapper;

    public BagService(BagRepository bagRepository, BagMapper bagMapper) {
        this.bagRepository = bagRepository;
        this.bagMapper = bagMapper;
    }

    public BagResponse createBag(CreateBagRequest dto, UUID ownerId){
        Bag bag = bagMapper.toEntity(dto, ownerId);
        Bag saved = bagRepository.save(bag);
        return bagMapper.toResponse(saved);
    }

    public BagResponse findById(UUID id){
        Bag bag = bagRepository.findById(id)
                .orElseThrow(() -> new BagNotFoundException("Bag with id " + id + " does not exist"));

        return bagMapper.toResponse(bag);
    }

    public List<BagResponse> findAll() {
        return bagRepository.findAll()
                .stream()
                .map(bagMapper::toResponse)
                .toList();
    }
}
