package com.pranchiseeeee.menu.service;

import static com.pranchiseeeee.view.AppUI.inputInteger;
import static com.pranchiseeeee.view.AppUI.inputString;
import static com.pranchiseeeee.view.AppUI.menuManagementScreen3;

import com.pranchiseeeee.common.AppService;

public class ChooseMenu implements AppService{

	
	private final MenuService menuService = new MenuService();
	private final SideMenuService sideMenuService = new SideMenuService();
	
	@Override
	public void start() {
		while(true) {
			menuManagementScreen3();
			int selection = inputInteger();
			
			switch (selection) {
			case 1:
				menuService.start();
				break;
			case 2:
				sideMenuService.start();
				break;
			case 3:
				
				return;
			
			default:
				System.out.println("메뉴를 다시 입력하세요.");
			}
			System.out.println("\n====== 계속 진행하시려면 ENTER를 누르세요 ======");
			inputString();
		}
		
	}





	
	
	
}
