package com.pranchiseeeee.sales.service;

import java.util.List;
import com.pranchiseeeee.sales.repository.SalesRepository;
import com.pranchiseeeee.common.AppService;
import com.pranchiseeeee.sales.domain.Sales;
import com.pranchiseeeee.view.AppUI;
import static com.pranchiseeeee.view.AppUI.inputInteger;
import static com.pranchiseeeee.view.AppUI.inputString;


public class SalesService implements AppService{

	private final SalesRepository salesRepository = new SalesRepository();
	
	public void start() {
		
		while(true) {

			AppUI.salesManagementScreen();
			int selection = inputInteger();

			switch (selection) {
			case 1:
				
				break;
			case 2:
				
				showSearchResult();
				break;
			case 3:

				return; //메인 화면으로 돌아가기

			default:
				System.out.println("메뉴를 다시 입력하세요.");
			}
			System.out.println("\n====== 계속 진행하시려면 ENTER 를 누르세요 ======");
			inputString();
		}
		
	}

	
	





	private List<Sales> searchShopId() {
		System.out.println("\n### 조회할 매장의 번호를 입력하세요.");
		System.out.print(">>> ");
		int shopId = inputInteger();
		return salesRepository.findByShopId(shopId);
	}
	
	
	
	
	//검색
	private int showSearchResult() {
		List<Sales> shop = searchShopId();
		if(!shop.isEmpty()) {
			System.out.println("\n==================== 매장 조회 결과 ====================");
			for(Sales sa : shop) {
				System.out.println(sa);
			}
		} else {
			System.out.println("\n### 조회 결과가 없습니다.");
		}
		return shop.size();
	}

}
