package project2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ThirtyOne {
	public static void main(String[] args) {
		// ����ڿ� ��ǻ�Ͱ� ���� ���ڸ� �θ���.
//		Random random = new Random();
//		int num;
//		
//		while(true) {
//			System.out.println("1,2,3 �߿��� �����ϼ���");
//			
//			Scanner scanf = new Scanner(System.in);
//			int manPick = scanf.nextInt();
//			int comPick = random.nextInt(3) + 1;
//			
//			if(comPick == 1) {
//				// ��ǻ�Ͱ� 1�����ؼ� �θ���
//			} else if (comPick == 2) {
//				// ��ǻ�Ͱ� 2�����ؼ� �θ���
//			} else if (comPick == 3) {
//				// ��ǻ�Ͱ� 3�����ؼ� �θ���
//			}
////			if(num = 31) {
//				break;
//			}
		
		// ���ڴ� �ѹ��� �ּ�1������ �ִ� 3������ �θ� �� �ִ�.
		
		
		
		// ���ڴ� 1 ~ 31 ���� �����ϸ鼭 �ҷ����Ѵ�.
		// ������ 31�� �θ� ����� ���ӿ��� ����.
		
		// 1. ����ڰ� ���� �� �� ��ǻ�Ͱ� ���� �� �� ����
		Scanner scanf = new Scanner(System.in);
		// turn -> true : ������� ���� / false : ��ǻ���� ����
		boolean turn = false;
		while(true) {
			
			System.out.println("���� ���� �ұ��?");
			System.out.println("1. �����");
			System.out.println("2. ��ǻ��");
			
			int select = scanf.nextInt();
			if(select == 1) {
				System.out.println("����ڰ� ���� �����մϴ�.");
				// ����ڰ� ���� �����ϵ��� ����
				break;
			} else if (select ==2) {
				System.out.println("��ǻ�Ͱ� ���� �����մϴ�.");
				// ��ǻ�Ͱ� ���� �����ϵ��� ����
				break;
			} else {
				System.out.println("�������� �ΰ������Դϴ�.");
			}
		}
		
		System.out.println("Game Start!");
		
		scanf.nextLine();
		int lastNumber = 0;
		
		// 2. ���� �����ϴ� ���� ���ڸ� �θ���.
		while(true) {
			if(turn) {
				// ����� ����
				// 3. ���ڴ� �ѹ��� �Է��ؾ��Ѵ�.
				while(true) {
					
					System.out.println("������� �����Դϴ�.");
					System.out.println("�ִ� 3���� ���ڸ� ���� �ּ���!");
					
					String user = scanf.nextLine();
					String[] users = user.split(" ");
					
					System.out.println("user = " + Arrays.toString(users));
					
					if(users.length == 0 || users.length > 3) {
						System.out.println("���ڴ� �ִ� 3�������� ��ĥ �� �ֽ��ϴ�!");
					} else {
						lastNumber = Integer.parseInt(users[users.length-1]);
						
						break;
					}
					
					turn = !turn;
				}
			} else {
				// ��ǻ�� ����
				System.out.println("��ǻ���� �����Դϴ�.");
				
				Random random = new Random();
				int roof = random.nextInt(3) + 1;
				
				for(int i=1; i<=roof; i++) {
					lastNumber = lastNumber + 1;
					
					if(lastNumber <= 31) {
						System.out.print(lastNumber + " ");
					}
				}
				
				System.out.println();
				
			}
			
			if(lastNumber == 31) {
				if(turn) {
					System.out.println("����ڰ� �����ϴ�!");
				} else {
					System.out.println("����ڰ� �̰���ϴ�!");
				}
				
				break;
			}
			
			
			
			
			
			
			turn = !turn;
			
				
				
//			System.out.println("1,2,3 �߿��� �����ϼ���");
//			
//			Scanner scanf = new Scanner(System.in);
//			int manPick = scanf.nextInt();
//			int comPick = random.nextInt(3) + 1;
//			
//			if(comPick == 1) {
//				// ��ǻ�Ͱ� 1�����ؼ� �θ���
//			} else if (comPick == 2) {
//				// ��ǻ�Ͱ� 2�����ؼ� �θ���
//			} else if (comPick == 3) {
//				// ��ǻ�Ͱ� 3�����ؼ� �θ���
//			}
//			if(num = 31) {
//				break;
			} // end while
	}// end main
} // end class
		// 3. ���ڴ� �ѹ��� �Է��ؾ��Ѵ�.
		


