package pratice3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null;
		int maxScore = 0;
		int totalScore = 0;

		Set<String> keySet = map.keySet();		
		for (String key : keySet) { //확장for문 알아두기. 타입 변수명 : 배열/컬렉션명 - 0번부터 순서대로돌아감.
			totalScore += map.get(key);
		}

		for (String key : keySet) {
			if (maxScore < map.get(key)) {
				maxScore = map.get(key);
				name = key;
			}

		}

		System.out.println();

		System.out.println("평균점수:" + totalScore / map.size());
		System.out.println("최고점수:" + maxScore);
		System.out.println("최고점수를 받은 아이디:" + name);
	}

}
