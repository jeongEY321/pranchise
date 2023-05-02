package com.pranchiseeeee.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppUI {

	private static Scanner sc = new Scanner(System.in);

	public static String inputString() {
		return sc.nextLine();
	}

	public static int inputInteger() {
		int num = 0;
		
		try {
			num = sc.nextInt();
			
		} catch (InputMismatchException e) {
			System.out.println("정수로 입력해 주세요.");
		} finally {
			sc.nextLine();
		}

		return num;
	}

	public static double inputDouble() {
		return sc.nextDouble();
	}
	
	
	
	//시작 화면 출력
	public static void startScreen() {
		System.out.println("\n========== 프렌차이즈 관리 ==========");
		System.out.println("### 1. 본사 직원 관리 시스템");
		System.out.println("### 2. 매장 관리 시스템");
		System.out.println("### 3. 메뉴 관리 시스템");
		System.out.println("### 4. 매출 관리 시스템");
		System.out.println("### 5. 시스템 종료");
		System.out.println("--------------------------------------");
		System.out.print(">>> ");
	}

	//직원 관리 시스템
	public static void staffManagementScreen() {

		System.out.println("\n========== 본사 직원 관리 시스템==========");
		System.out.println("### 1. 직원 검색");
		System.out.println("### 2. 직원 정보 추가");
		System.out.println("### 3. 직원 정보 삭제");
		System.out.println("### 4. 월급 계산");
		System.out.println("### 5. 돌아가기");
		System.out.println("=======================================");
		System.out.print(">>> ");
	}
	
	
	//매장 관리 시스템
	public static void shopManagementScreen() {
		System.out.println("\n========== 매장 관리 시스템 ==========");
		System.out.println("### 1. 매장 추가");
		System.out.println("### 2. 매장 삭제");
		System.out.println("### 3. 매장 검색");
		System.out.println("### 4. 첫 화면으로 돌아가기");
		System.out.println("-------------------------------------");
		System.out.print(">>> ");
	}
	
	//메뉴관리 시스템
	public static void menuManagementScreen() {
		
	}
	
	//매출 관리 시스템
	public static void salesManagementScreen() {
		System.out.println("\n========== 매출 관리 시스템 ==========");
		System.out.println("### 1. 매출 작성/수정");
		System.out.println("### 2. 매출 검색");
		System.out.println("### 3. 월평균 검색");
		System.out.println("### 4. 첫 화면으로 돌아가기");
		System.out.println("-------------------------------------");
		System.out.print(">>> ");
	}
	
	
	
	
	
	
	
}
