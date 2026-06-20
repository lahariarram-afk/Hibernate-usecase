package com.example.onlinefooddemo;

public class Order {
	private int order_id;
	private String customer_name;
	private String food_item;
	private int quantity;
	private int total_amount;
	private String order_date;
	private String order_status;
	
	public Order(String customer_name,String food_item,int quantity,int total_amount,String order_date,String order_status){
		this.customer_name=customer_name;
		this.food_item=food_item;
		this.quantity=quantity;
		this.total_amount=total_amount;
		this.order_date=order_date;
		this.order_status=order_status;
	}
	public String toString() {
		return 
	}
	public void setId(int order_id ){
		this.order_id=order_id;
	}
	public void setName(String customer_name) {
		this.customer_name=customer_name;
	}
	public void setFoodItem(String food_item) {
		this.food_item=food_item;
	}
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	public void setTotalAmount(int total_amount) {
		this.total_amount=total_amount;
	}
	public void setOrderDate(String order_date) {
		this.order_date=order_date;
	}
	public void setOrderStatus(String order_status) {
		this.order_status=order_status;
	}
	public int getId() {
		return order_id;
	}
	public String getFoodItem() {
		return food_item;
	}
	public String getName() {
		return customer_name;
	}
	public int getQuantity() {
		return quantity;
	}
	public int getTotalAamount() {
		return total_amount;
	}
	public String getOrderDate() {
		return order_date;
	}
	public String getOrderStatus() {
		return order_status;
	}
}
