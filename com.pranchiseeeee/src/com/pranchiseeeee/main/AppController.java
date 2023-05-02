package com.pranchiseeeee.main;

import com.pranchiseeeee.common.AppService;
import com.pranchiseeeee.sales.service.SalesService;
import com.pranchiseeeee.shop.service.ShopService;

import com.pranchiseeeee.hdofc.service.hdofcUserService;
import com.pranchiseeeee.sales.service.SalesService;
import com.pranchiseeeee.shop.service.ShopService;


import com.pranchiseeeee.sales.service.SalesService;
import com.pranchiseeeee.shop.service.ShopService;


public class AppController {
	
	private AppService service;

	//시스템을 정해주는 기능
		public void chooseSystem(int selectNumber) {
			switch (selectNumber) {
			case 1: 
				service = new hdofcUserService();
				break;
			case 2: 
				service = new ShopService();
				break;
			case 3: 
				
				break;
			case 4: 
				service = new SalesService();
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
