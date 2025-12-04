package com.bags.ecommerce.catalog.repository;

import com.bags.ecommerce.catalog.entity.Bag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BagRepository extends JpaRepository<Bag, UUID> {
}
