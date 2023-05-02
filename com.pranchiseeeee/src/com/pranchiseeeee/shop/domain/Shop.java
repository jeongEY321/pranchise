package com.pranchiseeeee.shop.domain;

public class Shop {

	private int shopId;
	private String ownerName;
	private String shopNumber;
	private String ownerNumber;
	private String shopAddress;
	private String shopOpenDate;
	
	
	public Shop(int shopId, String ownerName, String shopNumber, String ownerNumber, String shopAddress,
			String shopOpenDate) {
		super();
		this.shopId = shopId;
		this.ownerName = ownerName;
		this.shopNumber = shopNumber;
		this.ownerNumber = ownerNumber;
		this.shopAddress = shopAddress;
		this.shopOpenDate = shopOpenDate;
	}

	
	//기본 생성자
	public int getShopId() {
		return shopId;
	}


	public void setShopId(int shopId) {
		this.shopId = shopId;
	}


	public String getOwnerName() {
		return ownerName;
	}


	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}


	public String getShopNumber() {
		return shopNumber;
	}


	public void setShopNumber(String shopNumber) {
		this.shopNumber = shopNumber;
	}


	public String getOwnerNumber() {
		return ownerNumber;
	}


	public void setOwnerNumber(String ownerNumber) {
		this.ownerNumber = ownerNumber;
	}


	public String getShopAddress() {
		return shopAddress;
	}


	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}


	public String getShopOpenDate() {
		return shopOpenDate;
	}


	public void setShopOpenDate(String shopOpenDate) {
		this.shopOpenDate = shopOpenDate;
	}

	public String toString() {
		return  "## 매장번호: " + shopId +
				", 점주: " + ownerName +
				", 매장 전화번호: " + shopNumber  +
				", 점주 전화번호: " + ownerNumber +
				", 매장 주소: " + shopAddress +
				", 매장 오픈일: " + shopOpenDate;
	}
	
	
	
	
}
