package project3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Lotto {
	public static void main(String[] args) {
		// 로또 1 ~ 45까지 숫자가 있다
		// 6개의 숫자를 뽑는다.
		// 당첨 번호는 중복되서 뽑힐 수 없다.
	
		// 1 ~ 45 사이의 6개 숫자를 뽑을 때 중복되지 않게 뽑는다.
		// List컬렉션 프레임웤을 사용해서 구현하세요.
		
		
		
//		Set<Integer> lotto = new HashSet<Integer>();
		
		Random random = new Random();
		List<Integer> lotto = new ArrayList<>();
		
		for(int i=0; i<6; i++) {
			// n번째 숫자를 저장
			lotto.add(random.nextInt(45) + 1); 
		
			// 0 ~ n-1 번째까지 현재 저장한 숫자가 들어있는지 체크
			
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
//		System.out.println("당첨 번호는 ~~~~");
//		System.out.println(lotto);
	}
}
