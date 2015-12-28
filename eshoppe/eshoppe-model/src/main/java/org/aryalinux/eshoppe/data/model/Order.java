package org.aryalinux.eshoppe.data.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "orders")
public class Order extends BaseEntity {
	@Temporal(TemporalType.TIMESTAMP)
	private Date placedOn;
	@OneToMany
	private List<OrderItem> orderItems;
	@Column
	private String specialInstructions;
	@OneToOne
	private OrderStatusUpdate currentStatusUpdate;

	public Date getPlacedOn() {
		return placedOn;
	}

	public void setPlacedOn(Date placedOn) {
		this.placedOn = placedOn;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public String getSpecialInstructions() {
		return specialInstructions;
	}

	public void setSpecialInstructions(String specialInstructions) {
		this.specialInstructions = specialInstructions;
	}

	public OrderStatusUpdate getCurrentStatusUpdate() {
		return currentStatusUpdate;
	}

	public void setCurrentStatusUpdate(OrderStatusUpdate currentStatusUpdate) {
		this.currentStatusUpdate = currentStatusUpdate;
	}

}