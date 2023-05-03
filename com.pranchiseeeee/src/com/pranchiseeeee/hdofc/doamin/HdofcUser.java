package com.pranchiseeeee.hdofc.doamin;

public class HdofcUser {

	private int hdofcId;
	private String hdofcName;
	private String hdofcRrnum;
	private String hdofcAddress;
	private int hdofcHiredate;
	private String hdofcTeam;
	private String hdofcPosition;
	private int hdofcSalary;
	private double hdofcBonus;
	
	public HdofcUser() {}

	public HdofcUser(int hdofcId, String hdofcName, String hdofcRrnum, String hdofcAddress, int hdofcHiredate,
			String hdofcTeam, String hdofcPosition, int hdofcSalary, double hdofcBonus) {
		super();
		this.hdofcId = hdofcId;
		this.hdofcName = hdofcName;
		this.hdofcRrnum = hdofcRrnum;
		this.hdofcAddress = hdofcAddress;
		this.hdofcHiredate = hdofcHiredate;
		this.hdofcTeam = hdofcTeam;
		this.hdofcPosition = hdofcPosition;
		this.hdofcSalary = hdofcSalary;
		this.hdofcBonus = hdofcBonus;
	}

	public int getHdofcId() {
		return hdofcId;
	}

	public void setHdofcId(int hdofcId) {
		this.hdofcId = hdofcId;
	}

	public String getHdofcName() {
		return hdofcName;
	}

	public void setHdofcName(String hdofcName) {
		this.hdofcName = hdofcName;
	}

	public String getHdofcRrnum() {
		return hdofcRrnum;
	}

	public void setHdofcRrnum(String hdofcRrnum) {
		this.hdofcRrnum = hdofcRrnum;
	}

	public String getHdofcAddress() {
		return hdofcAddress;
	}

	public void setHdofcAddress(String hdofcAddress) {
		this.hdofcAddress = hdofcAddress;
	}

	public int getHdofcHiredate() {
		return hdofcHiredate;
	}

	public void setHdofcHiredate(int hdofcHiredate) {
		this.hdofcHiredate = hdofcHiredate;
	}

	public String getHdofcTeam() {
		return hdofcTeam;
	}

	public void setHdofcTeam(String hdofcTeam) {
		this.hdofcTeam = hdofcTeam;
	}

	public String getHdofcPosition() {
		return hdofcPosition;
	}

	public void setHdofcPosition(String hdofcPosition) {
		this.hdofcPosition = hdofcPosition;
	}

	public int getHdofcSalary() {
		return hdofcSalary;
	}

	public void setHdofcSalary(int hdofcSalary) {
		this.hdofcSalary = hdofcSalary;
	}

	public double getHdofcBonus() {
		return hdofcBonus;
	}

	public void setHdofcBonus(double hdofcBonus) {
		this.hdofcBonus = hdofcBonus;
	}
	
	public String toString() {
        return  "#-# 직원ID: " + hdofcId +
                ", 직원이름: " + hdofcName +
                ", 주민번호: " + hdofcRrnum  +
                ", 주소: " + hdofcAddress +
                ", 입사일 : " + hdofcHiredate +
                ", 부서: " + hdofcTeam +
                ", 직급: " + hdofcPosition +
                ", 월급: " +  hdofcSalary+
                ", 보너스: " + hdofcBonus;
    }
	
	
		
}
	