package com.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inventory.entity.Brand;

@Repository
public interface InventoryRepository extends JpaRepository<Brand, String>{

}
