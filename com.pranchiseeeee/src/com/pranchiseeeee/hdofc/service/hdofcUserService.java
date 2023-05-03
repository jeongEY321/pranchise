package com.pranchiseeeee.hdofc.service;

import java.util.List;

import com.pranchiseeeee.common.AppService;
import com.pranchiseeeee.hdofc.doamin.HdofcUser;
import com.pranchiseeeee.hdofc.repository.hdofcUserRepositiry;
import com.pranchiseeeee.view.AppUI;

import static com.pranchiseeeee.view.AppUI.inputInteger;
import static com.pranchiseeeee.view.AppUI.inputString;
import static com.pranchiseeeee.view.AppUI.inputDouble;
public class hdofcUserService implements AppService {


	private final hdofcUserRepositiry hdofcUserRps = new hdofcUserRepositiry();

	public void start() {
		while(true) {
			AppUI.staffManagementScreen();
			int selection = inputInteger();

			switch (selection) {
			case 1:
				if(showHdofcUser() == -1) {
					System.out.println("번호를 잘못 입려하셨습니다.");
				}
				break;
			case 2:
				joinUser();
				break;
			case 3:
				fireUser();
				break;
			case 4:
				calcSalary();
				break;
			case 5:
				return;


			default:
				System.out.println("메뉴를 다시 입력하세요.");
			}
			System.out.println("\n====== 계속 진행하시려면 ENTER 를 누르세요 ======");
			inputString();

		}
	}



	// 이름 검색
	private List<HdofcUser> searchHdofcUSerName() {
		System.out.println("\n ##### 조회 하실 이름: ####");
		System.out.print(">>> ");
		String name = inputString();
		return hdofcUserRps.findUserName(name);


	}
	// ID 검색
	private  List<HdofcUser> searchHdofcUserNum() {
		System.out.println("\n ##### 조회 하실 번호: ####");
		System.out.print(">>> ");
		int num = inputInteger();
		return hdofcUserRps.findUserNum(num);
	}
	// 전체 검색
	private List<HdofcUser> searchHdofcAllUser() {
		System.out.println("======== enter를 눌러서 진행해주세요 ======== ");
		inputString();
		return hdofcUserRps.findAllUser();
	}
	// 이름으로 조회하기 질문 창

	private int showHdofcUser() {

		System.out.println("\n ##### 조회 하실 이름: ####");
		System.out.println("\n 1. ID로 검색");
		System.out.println("\n 2. 이름으로 검색");
		System.out.println("\n 3. 전체 검색");
		System.out.print(">>> ");
		int number = inputInteger();


		if(number == 1) {
			List<HdofcUser>	showNum = searchHdofcUserNum();
			if(!showNum.isEmpty()) {
				System.out.println("조회 결과 입니다.");
				for(HdofcUser  user : showNum) {
					System.out.println(user);
				}
			} else {
				System.out.println("조회 결과가 없습니다.");
			}
			return showNum.size();
		} else if (number > 3 || number < 1) {
			return -1;
		} else if(number == 3) {
			List<HdofcUser>	showNum = searchHdofcAllUser();
			if(!showNum.isEmpty()) {
				System.out.println("조회 결과 입니다.");
				for(HdofcUser  user : showNum) {
					System.out.println(user);
				}
			} else {
				System.out.println("조회 결과가 없습니다.");
			}
			return showNum.size();
		} else {
			List<HdofcUser> showName = searchHdofcUSerName();
			if(!showName.isEmpty()) {
				System.out.println("조회 결과 입니다.");
				for(HdofcUser users : showName) {
					System.out.println(users);
				}
			} else {
				System.out.println("조회 결과가 없습니다.");
			}
			return showName.size();
		}
		

	}

	// 회원 추가 로직ㅣ
	
	private void joinUser() {
		
		System.out.println("### 직원을 추가합니다 ###");
		System.out.println("# - 이름: ");
		String name = inputString();
		
		System.out.println("# - 주민등록번호: ");
		String rrNum = inputString();
		
		System.out.println("# - 주소: ");
		String address = inputString();
		
		System.out.println("# - 입사일: ");
		int hireDate = inputInteger();
		
		System.out.println("# - 부서: ");
		String team = inputString();
		
		System.out.println("# - 직급: ");
		String position = inputString();
		
		System.out.println("# - 월급: ");
		int salary = inputInteger();
		
		System.out.println("# - 보너스: ");
		double bonus = inputDouble();
		
		HdofcUser user = new HdofcUser();
		
		user.setHdofcName(name);
		user.setHdofcRrnum(rrNum);
		user.setHdofcAddress(address);
		user.setHdofcHiredate(hireDate);
		user.setHdofcTeam(team);
		user.setHdofcPosition(position);
		user.setHdofcSalary(salary);
		user.setHdofcBonus(bonus);
		
		hdofcUserRps.addUser(user);
		
		
	}
	
	
	// 직원 해고
	
		
		private void fireUser() {
			if(showHdofcUser() > 0) {
				System.out.println("해고할 직원의 번호를 입력해주세요.");
				System.out.print(">>> ");
				int fireNum = inputInteger();
				hdofcUserRps.fireUser(fireNum);
			}
		}
	
	// 월급계산
		private int calcSalary() {
			List<HdofcUser>	showNum = searchHdofcAllUser();
			for(HdofcUser  user : showNum) {
				System.out.println(user);
			}
			System.out.println("조회하실 ID를 입력해주세요: ");
			System.out.println(">>>");
				int calNum = inputInteger();
				
					return hdofcUserRps.calcSalary(calNum);
			
			
		}
		
		
		
		
		

}

















