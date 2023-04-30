package com.pranchiseeeee.shop.service;

import com.pranchiseeeee.common.AppService;
import com.pranchiseeeee.shop.domain.Shop;
import com.pranchiseeeee.shop.repository.ShopRepository;
import com.pranchiseeeee.view.AppUI;
import static com.pranchiseeeee.view.AppUI.inputInteger;
import static com.pranchiseeeee.view.AppUI.inputString;

import java.util.List;

public class ShopService implements AppService{


	private final ShopRepository shopRepository = new ShopRepository();

	public void start() {

		while(true) {

			AppUI.shopManagementScreen();
			int selection = inputInteger();

			switch (selection) {
			case 1:
				joinShop();
				break;
			case 2:
				deleteShop();
				break;
			case 3:
				if(showSearchResult() == -1) {
					System.out.println("번호를 잘못 입력하셨습니다.");
				}
				break;
			case 4:

				return; //메인 화면으로 돌아가기

			default:
				System.out.println("메뉴를 다시 입력하세요.");
			}
			System.out.println("\n====== 계속 진행하시려면 ENTER 를 누르세요 ======");
			inputString();
		}

	}

	//매장 추가
	private void joinShop() {

		System.out.println("\n====== 매장 추가를 진행합니다. ======");
		System.out.print("# 점주명: ");
		String ownerName = inputString();

		System.out.print("# 매장 전화번호: ");
		String shopNum = inputString();

		System.out.print("# 점주 전화번호: ");
		String ownerNum = inputString();

		System.out.print("# 매장 주소: ");
		String shopAddress = inputString();

		System.out.print("# 매장 오픈일: ");
		String shopOpenDate = inputString();

		Shop shop = new Shop(0, ownerName, shopNum, ownerNum, shopAddress, shopOpenDate);
		shop.setOwnerName(ownerName);
		shop.setShopNumber(shopNum);
		shop.setOwnerNumber(ownerNum);
		shop.setShopAddress(shopAddress);
		shop.setShopOpenDate(shopOpenDate);



		shopRepository.addShop(shop);

	}

	//매장 삭제
	private void deleteShop() {

		if(showSearchResult() > 0) {
			System.out.println("\n### 탈퇴할 매장의 번호를 입력하세요.");
			System.out.print(">>> ");
			int delShop = inputInteger();
			shopRepository.deleteShop(delShop);

		}

	}

	int name = 0;

	private List<Shop> searchShopId() {
		System.out.println("\n### 조회할 매장의 번호를 입력하세요.");
		System.out.print(">>> ");
		int shopId = inputInteger();
		return shopRepository.findByShopId(shopId);
	}

	private List<Shop> searchShopAddress() {
		System.out.println("\n### 조회할 매장의 주소를 입력하세요.");
		System.out.print(">>> ");
		String shopAddress = inputString();
		return shopRepository.findByShopAddress("'%"+shopAddress+"%'");
	}



	//검색
	private int showSearchResult() {
		System.out.println("\n=============== 검색 방법 ==============");
		System.out.println("\n### 1. 매장 아이디로 검색");
		System.out.println("\n### 2. 매장 주소로 검색");
		System.out.print(">>> ");
		name = inputInteger();
		if(name == 1) {
			List<Shop> shop = searchShopId();
			if(!shop.isEmpty()) {
				System.out.println("\n==================== 매장 조회 결과 ====================");
				for(Shop sh : shop) {
					System.out.println(sh);
				}
			} else {
				System.out.println("\n### 조회 결과가 없습니다.");
			}
			return shop.size();
		} else if(name > 2 || name < 1) {
			return -1;
		} else {
			List<Shop> shop = searchShopAddress();
			if(!shop.isEmpty()) {
				System.out.println("\n==================== 매장 조회 결과 ====================");
				for(Shop sh : shop) {
					System.out.println(sh);
				}
			} else {
				System.out.println("\n### 조회 결과가 없습니다.");
			}
			return shop.size();
		}


	}

}
