package com.pranchiseeeee.hdofc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pranchiseeeee.common.DataBaseConnection;
import com.pranchiseeeee.hdofc.doamin.HdofcUser;

public class hdofcUserRepositiry {



	private DataBaseConnection connection = 
			DataBaseConnection.getInstance();
	
//	private List<HdofcUser> showUserName(String Uname) {
//		List<HdofcUser> hdofcUL = new ArrayList<>();
//		String 
//	}

	//   유저 이름 검색
	public List<HdofcUser> findUserName(String userName) {
		List<HdofcUser> hdofcUserList = new ArrayList<>();
		String sql = "SELECT * FROM hdofc WHERE hdofc_name=?";

		try(Connection conn = connection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, userName);
			ResultSet rs = pstmt.executeQuery();


			while(rs.next()) {
				HdofcUser hdofcUser = new HdofcUser(
						rs.getInt("hdofc_id"),
						rs.getString("hdofc_name"),
						rs.getString("hdofc_rrnum"),
						rs.getString("hdofc_address"),
						rs.getInt("hdofc_hire_date"),
						rs.getString("hdofc_team"),
						rs.getString("hdofc_position"),
						rs.getInt("hdofc_salary"),
						rs.getDouble("hdofc_bonus")

						);

				hdofcUserList.add(hdofcUser);

			}

		} catch (Exception e) {

			e.printStackTrace();
		}
		return hdofcUserList;


	}

	// 유저 정보 ID 검색
	public List<HdofcUser> findUserNum(int userNum) {
		List<HdofcUser> hdofcUserList = new ArrayList<>();
		String sql = "SELECT * FROM hdofc WHERE hdofc_id=?";

		try(Connection conn = connection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, userNum);
			ResultSet rs = pstmt.executeQuery();


			while(rs.next()) {
				HdofcUser hdofcUser = new HdofcUser(
						rs.getInt("hdofc_id"),
						rs.getString("hdofc_name"),
						rs.getString("hdofc_rrnum"),
						rs.getString("hdofc_address"),
						rs.getInt("hdofc_hire_date"),
						rs.getString("hdofc_team"),
						rs.getString("hdofc_position"),
						rs.getInt("hdofc_salary"),
						rs.getDouble("hdofc_bonus")

						);
				
				hdofcUserList.add(hdofcUser);
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
		return hdofcUserList;

	}

	///////////////////////////////
	
	
	
	public List<HdofcUser> findAllUser() {
		List<HdofcUser> hdofcUsersList = new ArrayList<>();
		String sql = "SELECT * FROM hdofc";
		
		try(Connection conn = connection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				HdofcUser hdofcUser = new HdofcUser(
						rs.getInt("hdofc_id"),
						rs.getString("hdofc_name"),
						rs.getString("hdofc_rrnum"),
						rs.getString("hdofc_address"),
						rs.getInt("hdofc_hire_date"),
						rs.getString("hdofc_team"),
						rs.getString("hdofc_position"),
						rs.getInt("hdofc_salary"),
						rs.getDouble("hdofc_bonus")
						);
				hdofcUsersList.add(hdofcUser);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return hdofcUsersList;
	}
	
	
	
	
	
	//////////////////////////////
	
	
	

	// 직원 추가
	public void addUser(HdofcUser user) {
		
		String sql =  "INSERT INTO hdofc "
				+ "(hdofc_id, hdofc_name, hdofc_rrnum, hdofc_address, hdofc_hire_date, hdofc_team, hdofc_position, hdofc_salary, hdofc_bonus) "
				+ "VALUES(hdofc_seq.NEXTVAL,?,?,?,?,?,?,?,?)";
		
		try(Connection conn = connection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {

			pstmt.setString(1,user.getHdofcName());
			pstmt.setString(2, user.getHdofcRrnum());
			pstmt.setString(3, user.getHdofcAddress());
			pstmt.setInt(4, user.getHdofcHiredate());
			pstmt.setString(5, user.getHdofcTeam());
			pstmt.setString(6, user.getHdofcPosition());
			pstmt.setInt(7, user.getHdofcSalary());
			pstmt.setDouble(8, user.getHdofcBonus());
			
			if(pstmt.executeUpdate() == 1.0) {
				System.out.println("회원가입이 정상 처리되었습니다.");
			} else {
				System.out.println("회원 가입에 실패했습니다. 관리자에게 문의하세요.");
			}			
			
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		
		
	}



	// 직원 해고 
	
		public void fireUser(int fireNum) {
			String sql = "DELETE FROM hdofc WHERE hdofc_id=?";
			try(Connection conn = connection.getConnection();
					PreparedStatement pstmt = conn.prepareStatement(sql)) {
				pstmt.setInt(1, fireNum);
				if(pstmt.executeUpdate() == 1) {
					System.out.println("해고처리 되었습니다.");
				} else {
					System.out.println("제대로 입력해주세요.");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		// 월급 계산(보너스 포함 금액)
		
		public int calcSalary(int calNum) {
			System.out.println("선택하신 직원 ID: " + calNum);
			String sql = "SELECT hdofc_salary, hdofc_bonus, hdofc_id, hdofc_name FROM hdofc WHERE hdofc_id=?";			
			try(Connection conn = connection.getConnection();					
					PreparedStatement pstmt = conn.prepareStatement(sql)) {
				pstmt.setInt(1, calNum);
				ResultSet rs = pstmt.executeQuery(); // select시 필요	
				
			while(rs.next()) {			
			int a =	rs.getInt("hdofc_salary");
			double b =	rs.getDouble("hdofc_bonus");
			int c = rs.getInt("hdofc_id");
			String d = rs.getString("hdofc_name");
			
			System.out.println(" ");
			System.out.println("================== 보너스 포함 월급 ==========\n");
			System.out.println("직원ID: " + c + " 이름: "  + d + " 보너스 포함 월급: " + (a + (a*b)) + "만원 입니다.\n");
			System.out.println("=========================================");
			
			}		
			} catch (SQLException e) {
				e.printStackTrace();
			}
		

			return 0;


	}


	// 전체 월급 계산(보너스 포함 금액)
		
		public int calcSalaryAll() {
			String sql = "SELECT hdofc_salary, hdofc_bonus, hdofc_id, hdofc_name FROM hdofc";			
			try(Connection conn = connection.getConnection();					
					PreparedStatement pstmt = conn.prepareStatement(sql)) {
				ResultSet rs = pstmt.executeQuery(); // select시 필요	
				
				System.out.println("================== 보너스 포함 월급 ==========\n");
			while(rs.next()) {			
			int a =	rs.getInt("hdofc_salary");
			double b =	rs.getDouble("hdofc_bonus");
			int c = rs.getInt("hdofc_id");
			String d = rs.getString("hdofc_name");
			
			System.out.println(" ");
			System.out.println("직원ID: " + c + " 이름: "  + d + " 보너스 포함 월급: " + (a + (a*b)) + "만원 입니다.\n");
			System.out.println("==========================================");
			
			}		
			} catch (SQLException e) {
				e.printStackTrace();
			}
		

			return 0;


	}


}
