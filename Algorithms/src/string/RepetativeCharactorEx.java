package string;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RepetativeCharactorEx {

	public static void main(String[] args) {
		String[] words =new String[]{"cool","lock","cook"};			
		
		String fWord = words[0];									//First word
		Map<Character, Integer> ans = new HashMap<>();

		for(int i = 0; i < fWord.length(); i++) {
			ans.put(Character.valueOf(fWord.charAt(i)), 1);
		}

		for (int i = 1; i < words.length; i++) {
			String word = words[1];
			char[] c = word.toCharArray();
			
			for (int j = 0; j < word.length(); j++) {
				System.out.println(ans.get(Character.valueOf(c[j])));
				if (ans.get(Character.valueOf(c[j])) != null) {
					
					ans.put(Character.valueOf(c[j]), ans.get(c[j]) + 1);
				}
			}
		}
		int num = words.length;
		System.out.println(ans);
		List<String> collect = ans.entrySet().stream().filter(e -> e.getValue().equals(num))
				.map(java.util.Map.Entry::getKey).map(ch -> ch.toString()).collect(Collectors.toList());
		
		System.out.println(collect);
	}

}
