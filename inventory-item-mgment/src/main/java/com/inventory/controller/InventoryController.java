package com.inventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.entity.Brand;
import com.inventory.service.InventoryService;

@RestController
@RequestMapping("/brand")
public class InventoryController {
	
	@Autowired
	private InventoryService inventoryService;
	
	@PostMapping("/create")
	public void createBrand(@RequestBody Brand brand) {
		this.inventoryService.createBrand(brand);
	}
	
	
	@PutMapping("/update")
	public void updateBrand(@RequestBody Brand brand) {
	this.inventoryService.updateBrand(brand);	
	}
	
	@DeleteMapping("/delete")
	public void deleteBrand(@PathVariable String brandId) {
		this.inventoryService.deleteBrand(brandId);
	}
	
	@GetMapping("/get/{brandId}")
	public Brand getByBrandId(@PathVariable String brandId) {
		return this.inventoryService.findById(brandId);
	}
	
	

}
