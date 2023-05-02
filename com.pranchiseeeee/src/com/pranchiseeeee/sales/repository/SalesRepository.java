package com.pranchiseeeee.sales.repository;

import static com.pranchiseeeee.view.AppUI.inputInteger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.pranchiseeeee.common.DataBaseConnection;
import com.pranchiseeeee.sales.domain.Sales;

public class SalesRepository {

	DataBaseConnection connection =
			DataBaseConnection.getInstance();


	//매장 아이디으로 정보 검색
	public List<Sales> findByShopId(int shopId) {
		List<Sales> salesList = new ArrayList<>();
		System.out.print("년도: 20");
		int year = inputInteger();

		String sql = "SELECT * FROM sales"+ year +" WHERE shop_id = "+shopId;

		try(Connection conn = connection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			ResultSet rs = pstmt.executeQuery();

			while(rs.next()) {

				Sales sales = new Sales(
						rs.getInt("shop_id"),
						rs.getInt("january"),
						rs.getInt("february"),
						rs.getInt("march"),
						rs.getInt("april"),
						rs.getInt("may"),
						rs.getInt("june"),
						rs.getInt("july"),
						rs.getInt("august"),
						rs.getInt("september"),
						rs.getInt("october"),
						rs.getInt("november"),
						rs.getInt("december")

						);
				salesList.add(sales);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return salesList;
	}

	//추가 수정
	public Object findBySales(int shopId) {
		LocalDate now = LocalDate.now();

		int year = (now.getYear()-2000);
		String mon = now.getMonth().toString();

		String mont = "";
		System.out.print("값: ");
		int money = inputInteger();

		switch (mon) {
		case "JANUARY":
			year--;
			mont = "december";
			break;
		case "FEBRUARY":
			mont = "january";
			break;
		case "MARCH":
			mont = "february";
			break;
		case "APRIL":
			mont = "march";
			break;
		case "MAY":
			mont = "april";
			break;
		case "JUNE":
			mont = "may";
			break;
		case "JULY":
			mont = "june";
			break;
		case "AUGUST":
			mont = "july";
			break;
		case "SEPTEMBER":
			mont = "august";
			break;
		case "OCTOBER":
			mont = "september";
			break;
		case "NOVEMBER":
			mont = "october";
			break;
		case "DECEMBER":
			mont = "november";
			break;
		}

		String sql = "UPDATE sales"+ year + " SET " + mont + " = ? WHERE shop_id = "+shopId;


		try(Connection conn = connection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {

			pstmt.setInt(1, money);
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return sql;
	}

	//매출 월평균
	public int findByMonthly(int shopId) {
		System.out.print("년도: 20");
		int year = inputInteger();



		String sql = "SELECT * FROM sales"+ year +" WHERE shop_id = "+shopId;

		try(Connection conn = connection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {


			ResultSet rs = pstmt.executeQuery();

			int count = 0;
			int sum = 0;

			while(rs.next()) {
				int[] abc = {
						rs.getInt("january"),
						rs.getInt("february"),
						rs.getInt("march"),
						rs.getInt("april"),
						rs.getInt("may"),
						rs.getInt("june"),
						rs.getInt("july"),
						rs.getInt("august"),
						rs.getInt("september"),
						rs.getInt("october"),
						rs.getInt("november"),
						rs.getInt("december")
				};

				for(int i : abc) {
					sum += i;
					if(i == 0) {
						count++;
					}
				}

				if(sum == 0) {
					System.out.println("매출작성을 안하셨습니다.");
					break;
				}
				
				if(abc.length == 0) {
					System.out.println("매장 오픈하기 전 년도 입니다.");
				}

				System.out.println("월평균: " + (sum/(12-count)));


			}
		} catch (Exception e) {
			if(year > 23) {
				System.out.println("미래의 매출자료는 없습니다.");
			} else {
				System.out.println("작성하신 년도에는 아직 매장 오픈을 하지 않았습니다.");
			}
		}

		return 0;
	}

}



