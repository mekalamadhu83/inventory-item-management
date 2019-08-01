package com.inventory.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name="brand")

//Testing..,

public class Brand {
	@Id
	private String brandId;
	private String brandShortName;
	private String brandFullName;
	
	public Brand() {}
	
	@JsonManagedReference("inventory_itemmm")
	@OneToMany(mappedBy = "brand",cascade = CascadeType.ALL)
	private List<InventoryItem> inventoryItemList;

	public Brand(String brandId, String brandShortName, String brandFullName, List<InventoryItem> inventoryItemList) {
		super();
		this.brandId = brandId;
		this.brandShortName = brandShortName;
		this.brandFullName = brandFullName;
		this.inventoryItemList = inventoryItemList;
	}

	public String getBrandId() {
		return brandId;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getBrandShortName() {
		return brandShortName;
	}

	public void setBrandShortName(String brandShortName) {
		this.brandShortName = brandShortName;
	}

	public String getBrandFullName() {
		return brandFullName;
	}

	public void setBrandFullName(String brandFullName) {
		this.brandFullName = brandFullName;
	}

	public List<InventoryItem> getInventoryItemList() {
		return inventoryItemList;
	}

	public void setInventoryItemList(List<InventoryItem> inventoryItemList) {
		this.inventoryItemList = inventoryItemList;
	}
	
	
	
}


