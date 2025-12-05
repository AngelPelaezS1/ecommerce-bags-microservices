package com.bags.ecommerce.catalog.controller;

import com.bags.ecommerce.catalog.dtos.BagResponse;
import com.bags.ecommerce.catalog.dtos.CreateBagRequest;
import com.bags.ecommerce.catalog.service.BagService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/bags")
public class BagController {

    private final BagService bagService;

    public BagController(BagService bagService) {
        this.bagService = bagService;
    }

    @PostMapping
    public BagResponse createBag(@RequestBody CreateBagRequest dto){

        // TEMPORAL: ownerId fijo, luego lo sacarás del JWT
        UUID ownerId = UUID.randomUUID(); // solo para probar
        return bagService.createBag(dto,ownerId);
    }

    @GetMapping("/{id}")
    public BagResponse findById(@PathVariable UUID id){
        return bagService.findById(id);
    }

    @GetMapping
    public List<BagResponse> findAll(){
        return bagService.findAll();
    }
}
