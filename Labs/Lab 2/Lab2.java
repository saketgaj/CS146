public static void main(String[] args) {
		String s = "listen";
		String t  = "silent";
		String s2 = "fried";
		String t2 = "fresh";
		
		System.out.println(anagram(s, t));
		System.out.println(anagram(s2, t2));
	}
	
	public static boolean anagram(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
		
		HashMap<Character, Integer> sMap = new HashMap<Character, Integer>();
		HashMap<Character, Integer> tMap = new HashMap<Character, Integer>();
		
		for(int i = 0; i < s.length(); i++) {
			sMap.put(s.charAt(i), 1);
			tMap.put(t.charAt(i), 1);
		}
		
		return (sMap.equals(tMap));
	}
