package org.aryalinux.eshoppe.data.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product extends BaseEntity {
	@Column
	private String productCode;
	@Column
	private String name;
	@Column
	private String description;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "product")
	private Price price;
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "product")
	private List<Property> properties;
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "productImages", joinColumns = @JoinColumn(name = "productId") )
	private List<String> images;
	@Column
	private String currentImageUrl;
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private ProductCategory category;

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public List<Property> getProperties() {
		return properties;
	}

	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}

	public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}

	public String getCurrentImageUrl() {
		return currentImageUrl;
	}

	public void setCurrentImageUrl(String currentImageUrl) {
		this.currentImageUrl = currentImageUrl;
	}

	public ProductCategory getCategory() {
		return category;
	}

	public void setCategory(ProductCategory category) {
		this.category = category;
	}

}
