package com.pranchiseeeee.main;

import com.pranchiseeeee.common.AppService;
import com.pranchiseeeee.menu.service.ChooseMenu;
import com.pranchiseeeee.menu.service.MenuService;
import com.pranchiseeeee.menu.service.SideMenuService;

public class AppController {
	
	private AppService service;

	//시스템을 정해주는 기능
		public void chooseSystem(int selectNumber) {
			switch (selectNumber) {
			case 1: 
				
				break;
			case 2: 
				
				break;
			case 3: 
				service = new ChooseMenu();
				break;
			case 4: 
				service = new SideMenuService();
				break;
			case 5: 
				System.out.println("# 프로그램을 종료합니다.");
				System.exit(0);

			default:

				System.out.println("# 메뉴를 다시 입력하세요.");
			}
			
			service.start();
		}
	
	
	
}