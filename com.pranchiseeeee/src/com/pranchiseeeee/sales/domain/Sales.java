package com.pranchiseeeee.sales.domain;

public class Sales {

	private int shopId;
	private int january;
	private int february;
	private int march;
	private int april;
	private int may;
	private int june;
	private int july;
	private int august;
	private int september;
	private int october;
	private int november;
	private int december;
	public Sales(int shopId, int january, int february, int march, int april, int may, int june, int july, int august,
			int september, int october, int november, int december) {
		super();
		this.shopId = shopId;
		this.january = january;
		this.february = february;
		this.march = march;
		this.april = april;
		this.may = may;
		this.june = june;
		this.july = july;
		this.august = august;
		this.september = september;
		this.october = october;
		this.november = november;
		this.december = december;
	}
	public int getShopId() {
		return shopId;
	}
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	public int getJanuary() {
		return january;
	}
	public void setJanuary(int january) {
		this.january = january;
	}
	public int getFebruary() {
		return february;
	}
	public void setFebruary(int february) {
		this.february = february;
	}
	public int getMarch() {
		return march;
	}
	public void setMarch(int march) {
		this.march = march;
	}
	public int getApril() {
		return april;
	}
	public void setApril(int april) {
		this.april = april;
	}
	public int getMay() {
		return may;
	}
	public void setMay(int may) {
		this.may = may;
	}
	public int getJune() {
		return june;
	}
	public void setJune(int june) {
		this.june = june;
	}
	public int getJuly() {
		return july;
	}
	public void setJuly(int july) {
		this.july = july;
	}
	public int getAugust() {
		return august;
	}
	public void setAugust(int august) {
		this.august = august;
	}
	public int getSeptember() {
		return september;
	}
	public void setSeptember(int september) {
		this.september = september;
	}
	public int getOctober() {
		return october;
	}
	public void setOctober(int october) {
		this.october = october;
	}
	public int getNovember() {
		return november;
	}
	public void setNovember(int november) {
		this.november = november;
	}
	public int getDecember() {
		return december;
	}
	public void setDecember(int december) {
		this.december = december;
	}
	
	public String toString() {
		return  "## 매장번호: " + shopId + 
				", 1월: " + january + "만"+
				", 2월: " + february + "만"+
				", 3월: " + march + "만"+
				", 4월: " + april + "만"+
				", 5월: " + may + "만"+
				", 6월: " + june + "만"+
				", 7월: " + july + "만"+
				", 8월: " + august + "만"+
				", 9월: " + september + "만"+
				", 10월: " + october + "만"+
				", 11월: " + november + "만"+
				", 12월: " + december + "만";
	}
	
	
	
	
}
