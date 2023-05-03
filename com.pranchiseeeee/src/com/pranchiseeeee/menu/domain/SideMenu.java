package com.pranchiseeeee.menu.domain;

/*
 #
 */

public class SideMenu {

	private String sidemenuName;
	private int sidemenuPrice;
	private String sidemenuExplanation;
	private String sidemenuReleseDate;	
	private String sidemenuImpst;


	public SideMenu() {}







	public SideMenu(String sidemenuName, int sidemenuPrice, String sidemenuExplanation, String sidemenuReleseDate,
			String sidemenuImpst) {
		super();
		this.sidemenuName = sidemenuName;
		this.sidemenuPrice = sidemenuPrice;
		this.sidemenuExplanation = sidemenuExplanation;
		this.sidemenuReleseDate = sidemenuReleseDate;
		this.sidemenuImpst = sidemenuImpst;
	}










	public String getSidemenuName() {
		return sidemenuName;
	}







	public void setSidemenuName(String sidemenuName) {
		this.sidemenuName = sidemenuName;
	}







	public int getSidemenuPrice() {
		return sidemenuPrice;
	}







	public void setSidemenuPrice(int sidemenuPrice) {
		this.sidemenuPrice = sidemenuPrice;
	}







	public String getSidemenuExplanation() {
		return sidemenuExplanation;
	}







	public void setSidemenuExplanation(String sidemenuExplanation) {
		this.sidemenuExplanation = sidemenuExplanation;
	}







	public String getSidemenuReleseDate() {
		return sidemenuReleseDate;
	}







	public void setSidemenuReleseDate(String sidemenuReleseDate) {
		this.sidemenuReleseDate = sidemenuReleseDate;
	}







	public String getSidemenuImpst() {
		return sidemenuImpst;
	}







	public void setSidemenuImpst(String sidemenuImpst) {
		this.sidemenuImpst = sidemenuImpst;
	}







	@Override
	public String toString() {
		return
				"## 사이드메뉴 이름: " + sidemenuName +
				", 사이드메뉴 가격: " + sidemenuPrice +
				", 사이드메뉴 설명: " + sidemenuExplanation +
				", 사이드메뉴 출시일: " + sidemenuReleseDate + "년" +
				", 판매여부: " + sidemenuImpst;

	}







}



