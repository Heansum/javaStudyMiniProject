package project1;

import java.util.Random;
import java.util.Scanner;

public class UpAndDown {
	public static void main(String[] args) {
		// ��ǻ�Ͱ� 1~ 100 ������ �� �� �ϳ��� ���� �����Ѵ�. (Random)
		Random random = new Random();
		// 0 ~ 99������ ������ ���� �������
		int pick = random.nextInt(100) + 1;
		
		System.out.println("���ڸ� ������!");
		System.out.println("���纸����");
		
		
		boolean correct = false;
		// ����ڴ� ��ǻ�Ͱ� ������ ���� ������Ѵ�.
		// ��ȸ�� 5��
		Scanner scanf = new Scanner(System.in);
		for(int i=1; i<=5; i++) {
			System.out.println("����: ");
			
			int user = scanf.nextInt();
			int diff = pick - user;
			
			int near = pick - user;
			if(near <= 5 && near >=-5) {
				System.out.println("���� ������ ���ڿ� ����ؿ�!");
			}
			
			if(1 <= diff && diff <= 5) {
				System.out.println("���� ������ ���ڿ� ����ؿ�!");
				System.out.println("���� ���ڸ� �Է����ּ���!");
			} else if(-5 <= diff && diff<= -1) {
				System.out.println("���� ������ ���ڿ� ����ؿ�!");
				System.out.println("ū ���ڸ� �Է����ּ���!");
			}
			
			
			if(user > pick) {
				// ����ڰ� �Է��� ���� ��ǻ�Ͱ� ������ �� ���� ũ�ٸ�
				// ��ǻ�ʹ� "���� ���ڸ� �Է����ּ���!" ��� ����ϰ�
				System.out.println("���� ���ڸ� �Է����ּ���!");
			} else if(user < pick) {
				// ����ڰ� �Է��� ���� ��ǻ�Ͱ� ������ �� ���� �۴ٸ�
				// ��ǻ�ʹ� "ū ���ڸ� �Է����ּ���!" ��� ����ϰ�
				System.out.println("ū ���ڸ� �Է����ּ���!");
			} else {
				// ����ڰ� �Է��� ���� ��ǻ�Ͱ� ������ �����
				// ��ǻ�ʹ� "�����Դϴ�!" ��� ����ϼ���.
				System.out.println("�����Դϴ�!");
			} // end if
		} // end for
		
		if(!correct) {
			System.out.println("���� ������ ���ڴ� ~~ " + pick + "�Դϴ�.");
			System.out.println("������ �ٽ� �������ּ���!");
		} // end if
	}
}
