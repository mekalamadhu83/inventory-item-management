package com.inventory.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="item_stock_level")

public class ItemStockLevel {
	@Id
	private String stockTakingId;
	private String quantityInStock;
	
	public ItemStockLevel() {}
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="item_id")
	private InventoryItem inventoryItem;

	public ItemStockLevel(String stockTakingId, String quantityInStock) {
		super();
		this.stockTakingId = stockTakingId;
		this.quantityInStock = quantityInStock;
	}

	public String getStockTakingId() {
		return stockTakingId;
	}

	public void setStockTakingId(String stockTakingId) {
		this.stockTakingId = stockTakingId;
	}

	public String getQuantityInStock() {
		return quantityInStock;
	}

	public void setQuantityInStock(String quantityInStock) {
		this.quantityInStock = quantityInStock;
	}
	
	
	
	
	

}
