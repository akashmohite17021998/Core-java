package com.easy;

import java.util.HashMap;
import java.util.Map;

public class FindTheDifference2 {

	public static char findTheDifference(String s, String t) {
        
		char[] g = t.toCharArray();
		
		if(s.length()==0)
			return g[0];
		
		Map<Character, Integer> m1 = new HashMap<Character, Integer>(26);
		
		Map<Character, Integer> m2 = new HashMap<Character, Integer>(26);
		
		int j = s.length();
		
		for(int i = 0; i<(s.length()+t.length()); i++) {
			
			if(i<s.length()) {
			
				if(m1.containsKey(s.charAt(i))) {
				
					Integer z = m1.get(s.charAt(i))+1;
				
					m1.put(s.charAt(i), z);
				
				}else {
					m1.put(s.charAt(i), 1);
				}
			}else {
				if(m2.containsKey(t.charAt(i-j))) {
					
					Integer z = m2.get(t.charAt(i-j))+1;
					
					m2.put(t.charAt(i-j), z);
					
				}else {
					m2.put(t.charAt(i-j), 1);
				}
			}
			
		}
		
//		for(int i = 0; i<t.length(); i++) {
//			
//			if(m2.containsKey(t.charAt(i))) {
//				
//				Integer z = m2.get(t.charAt(i))+1;
//				
//				m2.put(t.charAt(i), z);
//				
//			}else {
//				m2.put(t.charAt(i), 1);
//			}
//			
//		}
		
		for(int i = 0; i<m2.size(); i++) {
			
			char c = (char) (i+97);
			
			Character c1 = Character.valueOf(c);
			
			if(m1.get(c1)!=m2.get(c1)){
				return c;
			}
			
		}
		
		return 'a';
		
    }
	
	public static void main(String[] args) {
		
		String s = "ymbgaraibkfmvocpizdydugvalagaivdbfsfbepeyccqfepzvtpyxtbadkhmwmoswrcxnargtlswqemafandgkmydtimuzvjwxvlfwlhvkrgcsithaqlcvrihrwqkpjdhgfgreqoxzfvhjzojhghfwbvpfzectwwhexthbsndovxejsntmjihchaotbgcysfdaojkjldprwyrnischrgmtvjcorypvopfmegizfkvudubnejzfqffvgdoxohuinkyygbdzmshvyqyhsozwvlhevfepdvafgkqpkmcsikfyxczcovrmwqxxbnhfzcjjcpgzjjfateajnnvlbwhyppdleahgaypxidkpwmfqwqyofwdqgxhjaxvyrzupfwesmxbjszolgwqvfiozofncbohduqgiswuiyddmwlwubetyaummenkdfptjczxemryuotrrymrfdxtrebpbjtpnuhsbnovhectpjhfhahbqrfbyxggobsweefcwxpqsspyssrmdhuelkkvyjxswjwofngpwfxvknkjviiavorwyfzlnktmfwxkvwkrwdcxjfzikdyswsuxegmhtnxjraqrdchaauazfhtklxsksbhwgjphgbasfnlwqwukprgvihntsyymdrfovaszjywuqygpvjtvlsvvqbvzsmgweiayhlubnbsitvfxawhfmfiatxvqrcwjshvovxknnxnyyfexqycrlyksderlqarqhkxyaqwlwoqcribumrqjtelhwdvaiysgjlvksrfvjlcaiwrirtkkxbwgicyhvakxgdjwnwmubkiazdjkfmotglclqndqjxethoutvjchjbkoasnnfbgrnycucfpeovruguzumgmgddqwjgdvaujhyqsqtoexmnfuluaqbxoofvotvfoiexbnprrxptchmlctzgqtkivsilwgwgvpidpvasurraqfkcmxhdapjrlrnkbklwkrvoaziznlpor";
		
		String s1 = "qhxepbshlrhoecdaodgpousbzfcqjxulatciapuftffahhlmxbufgjuxstfjvljybfxnenlacmjqoymvamphpxnolwijwcecgwbcjhgdybfffwoygikvoecdggplfohemfypxfsvdrseyhmvkoovxhdvoavsqqbrsqrkqhbtmgwaurgisloqjixfwfvwtszcxwktkwesaxsmhsvlitegrlzkvfqoiiwxbzskzoewbkxtphapavbyvhzvgrrfriddnsrftfowhdanvhjvurhljmpxvpddxmzfgwwpkjrfgqptrmumoemhfpojnxzwlrxkcafvbhlwrapubhveattfifsmiounhqusvhywnxhwrgamgnesxmzliyzisqrwvkiyderyotxhwspqrrkeczjysfujvovsfcfouykcqyjoobfdgnlswfzjmyucaxuaslzwfnetekymrwbvponiaojdqnbmboldvvitamntwnyaeppjaohwkrisrlrgwcjqqgxeqerjrbapfzurcwxhcwzugcgnirkkrxdthtbmdqgvqxilllrsbwjhwqszrjtzyetwubdrlyakzxcveufvhqugyawvkivwonvmrgnchkzdysngqdibhkyboyftxcvvjoggecjsajbuqkjjxfvynrjsnvtfvgpgveycxidhhfauvjovmnbqgoxsafknluyimkczykwdgvqwlvvgdmufxdypwnajkncoynqticfetcdafvtqszuwfmrdggifokwmkgzuxnhncmnsstffqpqbplypapctctfhqpihavligbrutxmmygiyaklqtakdidvnvrjfteazeqmbgklrgrorudayokxptswwkcircwuhcavhdparjfkjypkyxhbgwxbkvpvrtzjaetahmxevmkhdfyidhrdeejapfbafwmdqjqszwnwzgclitdhlnkaiyldwkwwzvhyorgbysyjbxsspnjdewjxbhpsvj";
		
		System.out.println(findTheDifference(s, s1));
		
	}
	
}
