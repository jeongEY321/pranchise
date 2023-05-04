package com.pranchiseeeee.menu.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pranchiseeeee.common.Condition;
import com.pranchiseeeee.common.DataBaseConnection;
import com.pranchiseeeee.menu.domain.Menu;

public class MenuRepository {

	private DataBaseConnection connection 
	= DataBaseConnection.getInstance();

	public void addMenu(Menu menu) {
		String sql = "INSERT INTO menu "
				+ "(menu_name, menu_price,menu_explanation,menu_release_date,menu_impst) "
				+ "VALUES(?,?,?,?,?)";
		try(Connection conn = connection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, menu.getMenuName());
			pstmt.setInt(2, menu.getMenuPrice());
			pstmt.setString(3, menu.getMenuExplanation());
			pstmt.setString(4, menu.getMenuReleseDate());
			pstmt.setString(5, menu.getMenuImpst());
			
			
			if(pstmt.executeUpdate() == 1) {
				System.out.printf("\n(੭•̀ᴗ•̀)੭ [%s] 메뉴 신규 등록되었습니다.\n", menu.getMenuName());
			} else {
				System.out.println("(੭•̀ᴗ•̀)੭ 신규 메뉴 등 록 실패!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	

	public List<Menu> searchMenuList(Condition condition, String keyword) {
		String sql = "";
		List<Menu> menuList = new ArrayList<>();

		switch (condition) {
		case MENU_NAME: case MENU_PRICE: case MENU_EXPLANATION: case MENU_RELEASE_DATE:
			sql = "SELECT * FROM menu WHERE " + condition.toString() + " LIKE " + keyword;	
			break;		
		case ALL:
			sql = "SELECT * FROM menu";
		}

		try(Connection conn = connection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();) {
			while(rs.next()) {
				Menu menu = new Menu(
						rs.getString("menu_name"),
						rs.getInt("menu_price"),
						rs.getString("menu_explanation"),
						rs.getString("menu_release_date"),
						rs.getString("menu_impst")
						);
				menuList.add(menu);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return menuList;
	}

	public List<Menu> searchByimpst(String impst) {
		List<Menu> menuList = new ArrayList<>();
		String sql = "";
		if(impst.equals("판매 중")) {
			sql = "SELECT * FROM menu WHERE impst = '판매 중'";
		} else {
			sql = "SELECT * FROM menu WHERE impst = '판매 종료'";
		}
		
		try(Connection conn = connection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()) {
			while(rs.next()) {
				Menu menu = new Menu(
						rs.getString("menu_name"),
						rs.getInt("menu_price"),
						rs.getString("menu_explanation"),
						rs.getString("menu_release_date"),
						rs.getString("menu_impst")
						);
				menuList.add(menu);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return menuList;
	}
	
	
	public void deleteMenu(String menuName) {
	    String sql = "DELETE FROM menu WHERE menu_name = ?";
	    try (Connection conn = connection.getConnection();
	         PreparedStatement pstmt = conn.prepareStatement(sql)) {
	        pstmt.setString(1, menuName);
	        int rowsDeleted = pstmt.executeUpdate(); 
	        if (rowsDeleted == 1) {
	            System.out.println("\n### 메뉴정보가 정상 삭제되었습니다.");
	        } else {
	            System.out.println("\n### 검색한 메뉴의 메뉴이름으로만 삭제가 가능합니다.");
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } catch (NullPointerException e) {
	        e.printStackTrace();
	    }
	}
	
	
	
	

}
















