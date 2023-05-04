package com.pranchiseeeee.sales.service;

import java.util.List;

import com.pranchiseeeee.sales.domain.Sales;
import com.pranchiseeeee.sales.repository.SalesRepository;
import com.pranchiseeeee.shop.domain.Shop;
import com.pranchiseeeee.shop.repository.ShopRepository;
import com.pranchiseeeee.common.AppService;

import com.pranchiseeeee.view.AppUI;
import static com.pranchiseeeee.view.AppUI.inputInteger;
import static com.pranchiseeeee.view.AppUI.inputString;


public class SalesService implements AppService{

	private final SalesRepository salesRepository = new SalesRepository();
	private final ShopRepository shopRepository = new ShopRepository();

	public void start() {

		while(true) {

			AppUI.salesManagementScreen();
			int selection = inputInteger();

			switch (selection) {
			case 1:
				joinSales();
				break;
			case 2:

				showSearchResult();
				break;
			case 3:
				showMonthly();
				break;
			case 4:

				return; //메인 화면으로 돌아가기

			default:
				System.out.println("(੭•̀ᴗ•̀)੭ 메뉴를 다시 입력하세요.");
			}
			System.out.println("\n====== 계속 진행하시려면 ENTER 를 누르세요 ======");
			inputString();
		}

	}

	//월 평균 구하기
	private void showMonthly() {
		System.out.println("\n==================== 매장 월매출 평균 ====================");
		List<Shop> shop = shopRepository.findByOpenDate();
		searchMonthly();
	}


	private int searchMonthly() {
		System.out.println("\nᕦ( ᐛ )ᕡ 조회할 매장의 번호를 입력하세요.");
		System.out.print(">>> ");
		int shopId = inputInteger();
		return salesRepository.findByMonthly(shopId);
	}






	//수정및 추가
	private int joinSales() {

		System.out.println("\n==================== 매장 추가/수정 ====================");
		System.out.println("\n(੭•̀ᴗ•̀)੭ 추가/수정은 저번달 값만 가능합니다.");
		String a = (String) serchShopSale();

		return 0;
	}



	private Object serchShopSale() {
		System.out.println("\nᕦ( ᐛ )ᕡ 조회할 매장의 번호를 입력하세요.");
		System.out.print(">>> ");
		int shopId = inputInteger();
		return salesRepository.findBySales(shopId);

	}






	private List<Sales> searchShopId() {
		System.out.println("\nᕦ( ᐛ )ᕡ 조회할 매장의 번호를 입력하세요.");
		System.out.print(">>> ");
		int shopId = inputInteger();
		return salesRepository.findByShopId(shopId);
	}




	//검색
	private int showSearchResult() {
		System.out.println("\n=============== 검색 방법 ==============");
		System.out.println("\n[ 1.매장 아이디로 | 검색 2.전체검색 ]");
		System.out.print(">>> ");
		int name = inputInteger();


		if(name == 1) {
			List<Sales> shop = searchShopId();
			if(!shop.isEmpty()) {
				System.out.println("\n==================== 매장 조회 결과 ====================");
				for(Sales sa : shop) {
					System.out.println(sa);
				}
			} else {
				System.out.println("\n(੭•̀ᴗ•̀)੭ 조회 결과가 없습니다.");
			}
			return shop.size();
		} else if(name == 2) {
			List<Sales> shop = salesRepository.findByAll();
			if(!shop.isEmpty()) {
				System.out.println("\n==================== 매장 조회 결과 ====================");
				for(Sales sa : shop) {
					System.out.println(sa);
				}
			} else{
				System.out.println("\n(੭•̀ᴗ•̀)੭ 조회 결과가 없습니다.");
			}
			return shop.size();
		} else {
			System.out.println("(੭•̀ᴗ•̀)੭ 잘못입력하셨습니다.");
			return -1;
		}
	}

}