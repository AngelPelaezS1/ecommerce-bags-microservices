package com.bags.ecommerce.catalog.controller;

import com.bags.ecommerce.catalog.dtos.CreateBagRequest;
import com.bags.ecommerce.catalog.entity.Bag;
import com.bags.ecommerce.catalog.service.BagService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/bags")
public class BagController {

    private final BagService bagService;

    public BagController(BagService bagService) {
        this.bagService = bagService;
    }

    @PostMapping
    public Bag createBag(@RequestBody CreateBagRequest dto){

        // TEMPORAL: ownerId fijo, luego lo sacarás del JWT
        UUID ownerId = UUID.randomUUID(); // solo para probar
        return bagService.createBag(dto,ownerId);
    }
}
