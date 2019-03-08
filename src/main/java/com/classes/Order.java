package com.classes;

public class Order {
	
	private String provider;
	private String id;
	private String customer;
	private String country;
	private String total;
	private String accepted;
	private String itemquantity;
	private String comments;
	private Items items;
	
	public Order(String provider, String id, String customer, String country, String total, String accepted, String itemsquantity, String comments, Items items) {
		this.provider = provider;
		this.id = id;
		this.customer = customer;
		this.country = country;
		this.total = total;
		this.accepted = accepted;
		this.itemquantity = itemsquantity;
		this.comments = comments;
		this.items = items;
	}

	/**
	 * @return the provider
	 */
	public String getProvider() {
		return provider;
	}

	/**
	 * @param provider the provider to set
	 */
	public void setProvider(String provider) {
		this.provider = provider;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the customer
	 */
	public String getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(String customer) {
		this.customer = customer;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the total
	 */
	public String getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(String total) {
		this.total = total;
	}

	/**
	 * @return the accepted
	 */
	public String getAccepted() {
		return accepted;
	}

	/**
	 * @param accepted the accepted to set
	 */
	public void setAccepted(String accepted) {
		this.accepted = accepted;
	}

	/**
	 * @return the itemquantity
	 */
	public String getItemquantity() {
		return itemquantity;
	}

	/**
	 * @param itemquantity the itemquantity to set
	 */
	public void setItemquantity(String itemquantity) {
		this.itemquantity = itemquantity;
	}

	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}

	/**
	 * @return the items
	 */
	public Items getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(Items items) {
		this.items = items;
	}
	
	@Override
	public String toString() {
		return this.provider + "|" + this.id + "|" + this.customer + "|" + this.country + "|" + this.total + "|" + this.accepted + "|" + this.itemquantity + "|" + this.comments + "|" + this.items.toString();
	}
}
