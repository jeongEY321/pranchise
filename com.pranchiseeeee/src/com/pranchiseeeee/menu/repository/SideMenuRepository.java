package com.pranchiseeeee.menu.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pranchiseeeee.common.DataBaseConnection;
import com.pranchiseeeee.common.Side;
import com.pranchiseeeee.menu.domain.SideMenu;




public class SideMenuRepository {

	private DataBaseConnection connection 
	= DataBaseConnection.getInstance();

	public void addSideMenu(SideMenu sidemenu) {
		String sql = "INSERT INTO side_menu "
				+ "(sidemenu_name, sidemenu_price,sidemenu_explanation,sidemenu_release_date,sidemenu_impst) "
				+ "VALUES(?,?,?,?,?)";
		try(Connection conn = connection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, sidemenu.getSidemenuName());
			pstmt.setInt(2, sidemenu.getSidemenuPrice());
			pstmt.setString(3, sidemenu.getSidemenuExplanation());
			pstmt.setString(4, sidemenu.getSidemenuReleseDate());
			pstmt.setString(5, sidemenu.getSidemenuImpst());
			
			
			if(pstmt.executeUpdate() == 1) {
				System.out.printf("\n(੭•̀ᴗ•̀)੭ [%s] 사이드메뉴 신규 등록이 완료되었습니다.\n", sidemenu.getSidemenuName());
			} else {
				System.out.println("(੭•̀ᴗ•̀)੭ 신규 사이드메뉴 등 록 실패!");
			}

		} catch (Exception e) {
			System.out.println("(੭•̀ᴗ•̀)੭ 중복 사이드메뉴는 등록이 불가능합니다.");
		}

	}
	
	
	

	public List<SideMenu> searchSideMenuList(Side side, String keyword) {
		String sql = "";
		List<SideMenu> sidemenuList = new ArrayList<>();

		switch (side) {
		case SIDEMENU_NAME:  case SIDEMENU_EXPLANATION: case SIDEMENU_RELEASE_DATE:
			sql = "SELECT * FROM side_menu WHERE " + side.toString() + " LIKE '" + keyword + "'";	
			break;		
		case SIDEMENU_PRICE:
			sql = "SELECT * FROM side_menu WHERE " + side.toString() + " LIKE " + keyword;	
			break;
		case ALL:
			sql = "SELECT * FROM side_menu";
		}

		try(Connection conn = connection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				) {
			ResultSet rs = pstmt.executeQuery();
			System.out.println(sql);
			while(rs.next()) {
				SideMenu sidemenu = new SideMenu(
						rs.getString("sidemenu_name"),
						rs.getInt("sidemenu_price"),
						rs.getString("sidemenu_explanation"),
						rs.getString("sidemenu_release_date"),
						rs.getString("sidemenu_impst")
						);
				sidemenuList.add(sidemenu);
			}
			
			if(sidemenuList.size() > 0) {
				for(SideMenu s : sidemenuList) {
					System.out.println(s);
				}
				System.out.printf("\n============================ 검색 결과 (총 %d건) ============================\n", sidemenuList.size());
			} else {
				System.out.println("\n(੭•̀ᴗ•̀)੭ 검색 결과가 없습니다.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return sidemenuList;
	}

	public List<SideMenu> searchByimpst(String impst) {
		List<SideMenu> sidemenuList = new ArrayList<>();
		String sql = "";
		if(impst.equals("판매 중")) {
			sql = "SELECT * FROM sidemenu WHERE impst = '판매 중'";
		} else {
			sql = "SELECT * FROM sidemenu WHERE impst = '판매 종료'";
		}
		
		try(Connection conn = connection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()) {
			while(rs.next()) {
				SideMenu sidemenu = new SideMenu(
						rs.getString("sidemenu_name"),
						rs.getInt("sidemenu_price"),
						rs.getString("sidemenu_explanation"),
						rs.getString("sidemenu_release_date"),
						rs.getString("sidemenu_impst")
						);
				sidemenuList.add(sidemenu);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return sidemenuList;
	}
	
	
	public void deleteSideMenu(String sidemenuName) {
	    String sql = "DELETE FROM side_menu WHERE sidemenu_name = ?";
	    try (Connection conn = connection.getConnection();
	         PreparedStatement pstmt = conn.prepareStatement(sql)) {
	        pstmt.setString(1, sidemenuName);
	        int rowsDeleted = pstmt.executeUpdate(); // 쿼리 실행 메서드 호출
	        if (rowsDeleted == 1) {
	            System.out.println("\n(੭•̀ᴗ•̀)੭ 메뉴정보가 정상 삭제되었습니다.");
	        } else {
	            System.out.println("\n(੭•̀ᴗ•̀)੭ 검색한 메뉴의 메뉴이름으로만 삭제가 가능합니다.");
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } catch (NullPointerException e) {
	        e.printStackTrace();
	    }
	}
	
	
	
	

}
















