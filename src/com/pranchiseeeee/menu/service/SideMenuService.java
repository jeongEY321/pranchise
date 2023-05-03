package com.pranchiseeeee.menu.service;

import static com.pranchiseeeee.common.Side.ALL;
import static com.pranchiseeeee.common.Side.SIDEMENU_NAME;
import static com.pranchiseeeee.common.Side.SIDEMENU_PRICE;
import static com.pranchiseeeee.view.AppUI.inputInteger;
import static com.pranchiseeeee.view.AppUI.inputString;
import static com.pranchiseeeee.view.AppUI.menuManagementScreen1;

import java.util.List;

import com.pranchiseeeee.common.AppService;
import com.pranchiseeeee.common.Side;
import com.pranchiseeeee.menu.domain.SideMenu;
import com.pranchiseeeee.menu.repository.SideMenuRepository;

public class SideMenuService implements AppService {
	
	

	private final SideMenuRepository sidemenuRepository = new SideMenuRepository();
	
	@Override
	public void start() {
		while(true) {
			menuManagementScreen1();
			int selection = inputInteger();
			
			switch (selection) {
			case 1:
				searchSideMenuData();
				break;
			case 2:
				insertSideMenuData();
				break;
			case 3:
				deleteSideMenu();
				break;
			case 4:
				return;
			default:
				System.out.println("메뉴를 다시 입력하세요.");
			}
			System.out.println("\n====== 계속 진행하시려면 ENTER를 누르세요 ======");
			inputString();
		}
	}
	

	private void insertSideMenuData() {
		System.out.println("\n======= 사이드메뉴 정보를 추가합니다. =======");
		System.out.print("# 사이드메뉴 이름: ");
		String sidemenuName = inputString();
		
		System.out.print("# 사이드메뉴 가격: ");
		int sidemenuPrice = inputInteger();
		
		System.out.print("# 사이드메뉴 설명: ");
		String sidemenuExplanation = inputString();
		
		System.out.print("# 사이드메뉴 출시일: ");
		String sidemenuReleseDate = inputString();

		System.out.print("# 사이드메뉴 판매여부: ");
		String sidemenuImpst2 = inputString();
		
		String menuImpst = "";
		
		if(sidemenuImpst2.equals("")) {
			 menuImpst = "출시 중";
		} else {
			 menuImpst = sidemenuImpst2;
		}
		
		SideMenu newSideMenu = new SideMenu();
		newSideMenu.setSidemenuName(sidemenuName);
		newSideMenu.setSidemenuPrice(sidemenuPrice);
		newSideMenu.setSidemenuExplanation(sidemenuExplanation);
		newSideMenu.setSidemenuReleseDate(sidemenuReleseDate);
		newSideMenu.setSidemenuImpst(menuImpst);
		
		sidemenuRepository.addSideMenu(newSideMenu);
	}
	

	private List<SideMenu> searchSideMenuData() {
		System.out.println("\n=============== 메뉴 검색 조건을 선택하세요. ===============");
		System.out.println("[ 1. 사이드메뉴 이름 | 2. 사이드메뉴 가격 |  3. 전체 메뉴 ]");
		System.out.print(">>> ");
		int selection = inputInteger();
		
		Side side = ALL;
		switch (selection) {
		case 1:
			System.out.println("\n### 이름으로 검색합니다.");
				side = SIDEMENU_NAME;
			break;
		case 2:
			System.out.println("\n### 가격으로 검색합니다.");
			side = SIDEMENU_PRICE;
			break;
		case 3:
			System.out.println("\n### 전체 정보를 검색합니다.");
			break;

		default:
			System.out.println("\n### 잘못 입력했습니다.");
		}
		
		String keyword = "";
		if(side != ALL) {
			System.out.print("# 검색어: ");
			keyword = inputString();
		}
		
		return sidemenuRepository.searchSideMenuList(side, keyword);	
	}
	

	private int showSearchResult() {
		List<SideMenu> sidemenus = searchSideMenuData();
		
		
		return sidemenus.size();
		
	}
	
	private void deleteSideMenu() {
		
		//삭제할 회원의 이름을 입력받아서 삭제 대상 회원만 가지고 오자.	
		if(showSearchResult() > 0 ) {
			System.out.println("\n### 삭제할 사이드메뉴 이름을 입력해주세요:");
			System.out.println(">>> ");
			String delSideMenuName = inputString();
			sidemenuRepository.deleteSideMenu(delSideMenuName);
		}
		
		
	}
	

	
	
}














