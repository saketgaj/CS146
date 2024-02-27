public int longestPalindrome(String s) {
    HashSet<Character> hash = new HashSet();
    int max = 0;
    for(int i = 0; i < s.length(); i++){
        if(hash.contains(s.charAt(i))){
            max += 2;
            hash.remove(s.charAt(i));
        } else{
            hash.add(s.charAt(i));
        }
    }

    if(hash.size() > 0) {
        return max+1;
    } else{
        return max;
    }
}
