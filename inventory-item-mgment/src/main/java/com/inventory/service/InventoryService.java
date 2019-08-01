package com.inventory.service;

import com.inventory.entity.Brand;

public interface InventoryService {
	
	public void createBrand(Brand brand);

	public void updateBrand(Brand brand);

	public void deleteBrand(String brandId);

	public Brand findById(String brandId);

	
	

}
