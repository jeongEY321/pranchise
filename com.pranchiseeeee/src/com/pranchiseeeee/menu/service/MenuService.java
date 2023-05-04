package com.pranchiseeeee.menu.service;

import static com.pranchiseeeee.common.Condition.ALL;
import static com.pranchiseeeee.common.Condition.MENU_NAME;
import static com.pranchiseeeee.common.Condition.MENU_PRICE;
import static com.pranchiseeeee.view.AppUI.inputInteger;
import static com.pranchiseeeee.view.AppUI.inputString;
import static com.pranchiseeeee.view.AppUI.menuManagementScreen;

import java.util.List;

import com.pranchiseeeee.common.AppService;
import com.pranchiseeeee.common.Condition;
import com.pranchiseeeee.menu.domain.Menu;
import com.pranchiseeeee.menu.repository.MenuRepository;

public class MenuService implements AppService {
	
	

	private final MenuRepository menuRepository = new MenuRepository();
	
	@Override
	public void start() {
		while(true) {
			menuManagementScreen();
			int selection = inputInteger();
			
			switch (selection) {
			case 1:
				showSearchResult();
				break;
			case 2:
				insertMenuData();
				break;
			case 3:
				deleteMenu();
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
	
	//영화 정보 추가 비즈니스 로직
	private void insertMenuData() {
		System.out.println("\n======= 메뉴 정보를 추가합니다. =======");
		System.out.print("ᕦ( ᐛ )ᕡ 메뉴 이름: ");
		String menuName = inputString();
		
		System.out.print("ᕦ( ᐛ )ᕡ 메뉴 가격: ");
		int menuPrice = inputInteger();
		
		System.out.print("ᕦ( ᐛ )ᕡ 메뉴 설명: ");
		String menuExplanation = inputString();
		
		System.out.print("ᕦ( ᐛ )ᕡ 메뉴 출시일: ");
		String menuReleseDate = inputString();

		System.out.print("ᕦ( ᐛ )ᕡ 메뉴 판매여부: ");
		String menuImpst2 = inputString();
		
		String menuImpst = "";
		
		if(menuImpst2.equals("")) {
			 menuImpst = "출시 중";
		} else {
			 menuImpst = menuImpst2;
		}
		
		Menu newMenu = new Menu();
		newMenu.setMenuName(menuName);
		newMenu.setMenuPrice(menuPrice);
		newMenu.setMenuExplanation(menuExplanation);
		newMenu.setMenuReleseDate(menuReleseDate);
		newMenu.setMenuImpst(menuImpst);
		
		menuRepository.addMenu(newMenu);
	}
	
	//영화 정보 검색 비즈니스 로직 
	private List<Menu> searchMenuData() {
		System.out.println("\n=============== 메뉴 검색 조건을 선택하세요. ===============");
		System.out.println("[ 1. 메뉴 이름 | 2. 메뉴 가격 |  3. 전체 메뉴 ]");
		System.out.print(">>> ");
		int selection = inputInteger();
		
		Condition condition = ALL;
		switch (selection) {
		case 1:
			System.out.println("\n(੭•̀ᴗ•̀)੭ 이름으로 검색합니다.");
			condition = MENU_NAME;
			break;
		case 2:
			System.out.println("\n(੭•̀ᴗ•̀)੭ 가격으로 검색합니다.");
			condition = MENU_PRICE;
			break;
		case 3:
			System.out.println("\n(੭•̀ᴗ•̀)੭ 전체 정보를 검색합니다.");
			break;

		default:
			System.out.println("\n(੭•̀ᴗ•̀)੭ 잘못 입력했습니다.");
		}
		
		String keyword = "";
		if(condition != ALL) {
			System.out.print("ᕦ( ᐛ )ᕡ 검색어: ");
			keyword = "'%" + inputString() + "%'";
		}
		
		return menuRepository.searchMenuList(condition, keyword);	
	}
	
	//영화 검색 정보 출력
	private int showSearchResult() {
		List<Menu> menus = searchMenuData();
		
		if(menus.size() > 0) {
			for(Menu m : menus) {
				System.out.println(m);
			}
			System.out.printf("\n============================ 검색 결과 (총 %d건) ============================\n", menus.size());
		} else {
			System.out.println("\n(੭•̀ᴗ•̀)੭ 검색 결과가 없습니다.");
		}
		return menus.size();
		
	}
	
	private void deleteMenu() {
		
		//삭제할 회원의 이름을 입력받아서 삭제 대상 회원만 가지고 오자.	
		if(showSearchResult() > 0 ) {
			System.out.println("\nᕦ( ᐛ )ᕡ 삭제할 메뉴 이름을 입력해주세요:");
			System.out.println(">>> ");
			String delMenuName = inputString();
			menuRepository.deleteMenu(delMenuName);
		}
		
		
	}
	

	
	
	
	
	
	
	
}














