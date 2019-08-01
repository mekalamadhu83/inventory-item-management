package com.inventory.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "inventory_item")
public class InventoryItem {
	
	@Id
	private String itemId;
	
	@JsonBackReference("inventory_itemmm")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "brand_id")
	private Brand brand;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "item_category_code")
	private RefItemCategory refItemCategory;

	private String itemDescription;
	private int reorderQuantity;
	
	public InventoryItem() {}
	
	

	public InventoryItem(String itemId, String itemDescription,
			int reorderQuantity) {
		super();
		this.itemId = itemId;
		this.itemDescription = itemDescription;
		this.reorderQuantity = reorderQuantity;
	}



	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}


	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public int getReorderQuantity() {
		return reorderQuantity;
	}

	public void setReorderQuantity(int reorderQuantity) {
		this.reorderQuantity = reorderQuantity;
	}
	

}
