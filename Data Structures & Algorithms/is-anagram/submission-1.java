class Solution {
    public boolean isAnagram(String s, String t) {
        
         if (s == null || t == null || s.length() != t.length() ) {
            return false;
        }
        s = s.toLowerCase();
        t = t.toLowerCase();
        
        int[] charPos = new int[26];

        for(int i=0; i<s.length(); i++) {
            charPos[ s.charAt(i) - 'a' ]++;
            charPos[ t.charAt(i) - 'a' ]--;
        }

        for(int pos : charPos) {
            if(pos != 0) {
                return false;
            }
        }

        return true;

    }
}
