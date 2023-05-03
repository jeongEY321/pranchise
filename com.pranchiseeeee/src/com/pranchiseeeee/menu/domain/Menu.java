package com.pranchiseeeee.menu.domain;

/*
 #
 */

public class Menu {

	private String menuName;
	private int menuPrice;
	private String menuExplanation;
	private String menuReleseDate;	
	private String menuImpst;

	
	public Menu() {}
	
	
	
	
	public Menu(String menuName, int menuPrice, String menuExplanation, String menuReleseDate, String menuImpst) {
		super();
		this.menuName = menuName;
		this.menuPrice = menuPrice;
		this.menuExplanation = menuExplanation;
		this.menuReleseDate = menuReleseDate;
		this.menuImpst = menuImpst;
	}




	public String getMenuName() {
		return menuName;
	}




	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}




	public int getMenuPrice() {
		return menuPrice;
	}




	public void setMenuPrice(int menuPrice) {
		this.menuPrice = menuPrice;
	}




	public String getMenuExplanation() {
		return menuExplanation;
	}




	public void setMenuExplanation(String menuExplanation) {
		this.menuExplanation = menuExplanation;
	}




	public String getMenuReleseDate() {
		return menuReleseDate;
	}




	public void setMenuReleseDate(String menuReleseDate) {
		this.menuReleseDate = menuReleseDate;
	}




	public String getMenuImpst() {
		return menuImpst;
	}




	public void setMenuImpst(String impst) {
		this.menuImpst = impst;
	}




	@Override
    public String toString() {
        return
                "## 메뉴 이름: " + menuName +
                ", 메뉴 가격: " + menuPrice +
                ", 메뉴 설명: " + menuExplanation +
                ", 메뉴 출시일: " + menuReleseDate + "년" +
                ", 판매여부: " + menuImpst;
               
    }
	
	
	
}
