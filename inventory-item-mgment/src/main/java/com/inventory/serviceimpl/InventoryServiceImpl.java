package com.inventory.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.entity.Brand;
import com.inventory.repository.InventoryRepository;
import com.inventory.service.InventoryService;


@Service
public class InventoryServiceImpl implements InventoryService{
	
	
	@Autowired
	private InventoryRepository inventoryRepository;

	@Override
	public void createBrand(Brand brand) {
		this.inventoryRepository.saveAndFlush(brand);
		
	}

	@Override
	public void updateBrand(Brand brand) {
		this.inventoryRepository.saveAndFlush(brand);	
		
	}

	@Override
	public void deleteBrand(String brandId) {
		this.inventoryRepository.deleteById(brandId);
		
	}

	@Override
	public Brand findById(String brandId) {
		Brand tmpObj = new Brand();
		tmpObj = this.inventoryRepository.getOne(brandId);
		return tmpObj;
	}

}
