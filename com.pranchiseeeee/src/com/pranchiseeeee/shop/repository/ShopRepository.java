package com.pranchiseeeee.shop.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pranchiseeeee.common.DataBaseConnection;
import com.pranchiseeeee.sales.domain.Sales;
import com.pranchiseeeee.shop.domain.Shop;

public class ShopRepository {

	DataBaseConnection connection =
			DataBaseConnection.getInstance();


	public void addShop(Shop shop) {
		String sql = "INSERT INTO shop "
				+ "(shop_id, owner_name, shop_number, owner_number, shop_address, shop_open_date) "
				+ "VALUES(shop_seq.NEXTVAL,?,?,?,?,?)";

		try(Connection conn = connection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, shop.getOwnerName());
			pstmt.setString(2, shop.getShopNumber());
			pstmt.setString(3, shop.getOwnerNumber());
			pstmt.setString(4, shop.getShopAddress());
			pstmt.setString(5, shop.getShopOpenDate());

			if(pstmt.executeUpdate() == 1) {
				System.out.println("매장 추가가 정상 처리되었습니다.");
			} else {
				System.out.println("매장 추가에 실패했습니다. 관리자에게 문의하세요.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		addSales();

	}






	// 매장 추가 시 매출관리표에 추가
	private void addSales() {
		String sql = "INSERT INTO sales23 "
				+ "(shop_id, january) "
				+ "VALUES(sales23_seq.NEXTVAL,?)";

		try(Connection conn = connection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, 0);
			
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}







	//매장 아이디으로 정보 검색
	public List<Shop> findByShopId(int shopId) {
		List<Shop> shopList = new ArrayList<>();
		String sql = "SELECT * FROM shop WHERE shop_id = ?";

		try(Connection conn = connection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, shopId);
			ResultSet rs = pstmt.executeQuery();	

			while(rs.next()) {

				Shop shop = new Shop(
						rs.getInt("shop_id"),
						rs.getString("owner_name"),
						rs.getString("shop_number"),
						rs.getString("owner_number"),
						rs.getString("shop_address"),
						rs.getString("shop_open_date")
						);
				shopList.add(shop);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return shopList;
	}

	//매장 주소로 정보 검색
	public List<Shop> findByShopAddress(String shopAddress) {
		List<Shop> shopList = new ArrayList<>();
		String sql = "SELECT * FROM shop WHERE shop_address LIKE "+shopAddress;

		try(Connection conn = connection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			ResultSet rs = pstmt.executeQuery();	


			while(rs.next()) {
				Shop shop = new Shop(
						rs.getInt("shop_id"),
						rs.getString("owner_name"),
						rs.getString("shop_number"),
						rs.getString("owner_number"),
						rs.getString("shop_address"),
						rs.getString("shop_open_date")
						);
				shopList.add(shop);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return shopList;
	}

	//매장 번호로 삭제	
	public void deleteShop(int delShopId) {
		String sql = "DELETE FROM shop WHERE shop_id=?";
		try(Connection conn = connection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, delShopId);
			if(pstmt.executeUpdate() == 1) {
				System.out.println("\n### 매장정보가 정상 삭제되었습니다.");
			} else {
				System.out.println("\n### 검색한 매장의 매장 아이디로만 삭제가 가능합니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
