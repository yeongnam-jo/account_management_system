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
			System.out.println("[ ���� ���� �����ý��� ]");
			System.out.println("1. �α���");
			System.out.println("2. ȸ������");
			System.out.print("���� ��ȣ�� �Է����ּ��� : ");			
			
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
				System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�.");
				System.out.println();
			}
		}
	}
	
	public void login() {
		
		boolean service = true;
		while(service) {
			System.out.println("[ ���� ���� ���� ���� ]");
			System.out.println("1. ���� ��ȸ");
			System.out.println("2. ���� ���");
			System.out.println("3. ���� ����");
			System.out.println("4. ���� ����");
			System.out.print("���Ͻô� ���� ��ȣ�� �Է����ּ��� : ");
			
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
				System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�.");
				System.out.println();
			}
			
		}
	}
	
	public void accountInfo() {
		boolean info = true;
		while(info) {
			System.out.println("[ ���� ���� ��ȸ ���� ]");
			System.out.println("1. ��ü ���� ���� ��ȸ");
			System.out.println("2. ���¹�ȣ�� ���� ��ȸ");
			System.out.println("3. ���ະ ���� ���� ��ȸ");
			System.out.print("���Ͻô� ���� ��ȣ�� �Է����ּ��� : ");
			
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
				System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�.");
				System.out.println();
			}
		}
	}
	
	public void accountInfoAll() {
		System.out.println("==============================");
		System.out.println("\t\t���� ��ȸ");
		System.out.println("==============================");
		System.out.println("�����\t���¹�ȣ\t�����ָ�\t�ܾ�\t��Ī\t");
		System.out.println("==============================");
		
		
		/*
		 * ArrayList print �ϱ�
		 * 
		Iterator<Account> ite = account.iterator();
		for(Account ite : account) {
			System.out.print(ite.getBankName + "\t");
		}
		 */
		
		
		Iterator<Account> ite = accountList.iterator();
		if(!ite.hasNext()) {
			System.out.println("��ȸ �� ���°� �����ϴ�.");
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
		System.out.println("���� ��� �����Դϴ�.");
		System.out.print("������� �Է����ּ��� : ");
		String bankName = sc.nextLine();
		
		System.out.print("���¹�ȣ�� �Է����ּ��� : ");
		long accountNo = sc.nextLong();
		sc.nextLine();
		
		System.out.print("�����ָ��� �Է����ּ��� : ");
		String accountHolder = sc.nextLine();
		
		System.out.print("�ܾ��� �Է����ּ��� : ");
		long balance = sc.nextLong();
		sc.nextLine();
		
		System.out.print("��Ī�� �Է����ּ��� : ");
		String alias = sc.nextLine();
	
		
		Account a = new Account(bankName, accountNo, accountHolder, balance, alias);
		accountList.add(a);
		System.out.println("���� ����� �Ϸ��߽��ϴ�.");
		
	}
	
	public void accountUpdate() {
		
	}
	
	public void accountDelete() {
		
	}
	
	public void join() {
		
	}
}
