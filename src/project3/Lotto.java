package project3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Lotto {
	public static void main(String[] args) {
		// �ζ� 1 ~ 45���� ���ڰ� �ִ�
		// 6���� ���ڸ� �̴´�.
		// ��÷ ��ȣ�� �ߺ��Ǽ� ���� �� ����.
	
		// 1 ~ 45 ������ 6�� ���ڸ� ���� �� �ߺ����� �ʰ� �̴´�.
		// List�÷��� �����ӟp�� ����ؼ� �����ϼ���.
		
		
		
//		Set<Integer> lotto = new HashSet<Integer>();
		
		Random random = new Random();
		List<Integer> lotto = new ArrayList<>();
		
		for(int i=0; i<6; i++) {
			// n��° ���ڸ� ����
			lotto.add(random.nextInt(45) + 1); 
		
			// 0 ~ n-1 ��°���� ���� ������ ���ڰ� ����ִ��� üũ
			
			for(int j=0; j<lotto.size(); j++) {
				if(i == j) break;
				
				if(lotto.get(j) == lotto.get(i)) {
					lotto.remove(i-1);
					i = i - 1;
					break;
				} // end if
			} // end for j
		} // end for i
		
		System.out.println(lotto.get(1).toString());
		System.out.println(lotto.get(2).toString());
		System.out.println(lotto.get(3).toString());
		System.out.println(lotto.get(4).toString());
		System.out.println(lotto.get(5).toString());
		System.out.println(lotto.get(0).toString());
		
		
//		while(true) {
//			lotto.add(random.nextInt(45) + 1);
//			
//			if(lotto.size() == 6) {
//				break;
//			}
//		}
//		
//		System.out.println("��÷ ��ȣ�� ~~~~");
//		System.out.println(lotto);
	}
}
