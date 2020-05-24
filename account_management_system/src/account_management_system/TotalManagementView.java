package account_management_system;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TotalManagementView {
	private Scanner sc;
	private List<Account> accountList = new ArrayList<>();
	
	public TotalManagementView() {
		sc = new Scanner(System.in);
	}

	public void execute() {
		
		boolean service = true;		
		while(service) {
			System.out.println("[ 통합 계좌 관리시스템 ]");
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.print("서비스 번호를 입력해주세요 : ");			
			
			int serviceNum = Integer.parseInt(sc.nextLine());
			
			switch(serviceNum){
			case 1:
				login();
				service = false;
				break;
			case 2:
				join();
				service = false;
				break;
			default:
				System.out.println("번호를 잘못 입력하셨습니다.");
				System.out.println();
			}
		}
	}
	
	public void login() {
		
		boolean service = true;
		while(service) {
			System.out.println("[ 통합 계좌 관리 서비스 ]");
			System.out.println("1. 계좌 조회");
			System.out.println("2. 계좌 등록");
			System.out.println("3. 계좌 수정");
			System.out.println("4. 계좌 삭제");
			System.out.print("원하시는 서비스 번호를 입력해주세요 : ");
			
			int serviceNum = Integer.parseInt(sc.nextLine());
			
			switch(serviceNum) {
			case 1:
				accountInfo();
				service = false;
				break;
			case 2:
				accountAdd();
				service = false;
				break;
			case 3:
				accountUpdate();
				service = false;
				break;
			case 4:
				accountDelete();
				service = false;
				break;
			default:
				System.out.println("번호를 잘못 입력하셨습니다.");
				System.out.println();
			}
			
		}
	}
	
	public void accountInfo() {
		boolean info = true;
		while(info) {
			System.out.println("[ 계좌 정보 조회 서비스 ]");
			System.out.println("1. 전체 계좌 정보 조회");
			System.out.println("2. 계좌번호로 정보 조회");
			System.out.println("3. 은행별 계좌 정보 조회");
			System.out.print("원하시는 서비스 번호를 입력해주세요 : ");
			
			int serviceNum = Integer.parseInt(sc.nextLine());
			
			switch(serviceNum) {
			case 1:
				accountInfoAll();
				info = false;
				break;
			case 2:
				accountInfoNo();
				info = false;
				break;
			case 3:
				accountInfoBank();
				info = false;
				break;
			default:
				System.out.println("번호를 잘못 입력하셨습니다.");
				System.out.println();
			}
		}
	}
	
	public void accountInfoAll() {
		System.out.println("==============================");
		System.out.println("\t\t계좌 조회");
		System.out.println("==============================");
		System.out.println("은행명\t계좌번호\t계좌주명\t잔액\t별칭\t");
		System.out.println("==============================");
		
		
		/*
		 * ArrayList print 하기
		 * 
		Iterator<Account> ite = account.iterator();
		for(Account ite : account) {
			System.out.print(ite.getBankName + "\t");
		}
		 */
		
		
		Iterator<Account> ite = accountList.iterator();
		if(!ite.hasNext()) {
			System.out.println("조회 할 계좌가 없습니다.");
		}
		
		while(ite.hasNext()) {
			Account a = ite.next();
			String bankName = a.getBankName();
			long accountNo = a.getAccountNo();
			String accountHolder = a.getAccountHolder();
			long balance = a.getBalance();
			String alias = a.getAlias();
			System.out.println(bankName + "\t" + accountNo + "\t" + accountHolder + "\t" + balance + "\t" + alias);
		
		}
		
	}
	
	public void accountInfoNo() {
		
	}
	
	public void accountInfoBank() {
		
	}
	
	public void accountAdd() {
		System.out.println("계좌 등록 서비스입니다.");
		System.out.print("은행명을 입력해주세요 : ");
		String bankName = sc.nextLine();
		
		System.out.print("계좌번호를 입력해주세요 : ");
		long accountNo = sc.nextLong();
		sc.nextLine();
		
		System.out.print("계좌주명을 입력해주세요 : ");
		String accountHolder = sc.nextLine();
		
		System.out.print("잔액을 입력해주세요 : ");
		long balance = sc.nextLong();
		sc.nextLine();
		
		System.out.print("별칭을 입력해주세요 : ");
		String alias = sc.nextLine();
	
		
		Account a = new Account(bankName, accountNo, accountHolder, balance, alias);
		accountList.add(a);
		System.out.println("계좌 등록을 완료했습니다.");
		
	}
	
	public void accountUpdate() {
		
	}
	
	public void accountDelete() {
		
	}
	
	public void join() {
		
	}
}
