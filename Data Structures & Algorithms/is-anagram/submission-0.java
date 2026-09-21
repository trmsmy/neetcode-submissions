class Solution {
    public boolean isAnagram(String s, String t) {
        
        if (s == null || t == null || s.length() != t.length() ) {
            return false;
        }

        //"racecar" "carrace"
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for(Integer i=0; i<s.length();i++) {
            Character schar = Character.valueOf(s.charAt(i));
             //System.out.println("schar=%s, sMap.containsKey(schar)=%s, sMap.get(schar)=%s".formatted(schar, sMap.containsKey(schar), sMap.get(schar)));
            if(sMap.containsKey(schar)) {
                Integer count = sMap.get(schar);
                sMap.put(schar, ++count);
            } else {
                sMap.put(schar, 1);
            }

        }

        for(Integer i=0; i<s.length();i++) {
            Character schar = Character.valueOf(t.charAt(i));
             //System.out.println("schar=%s, tMap.containsKey(schar)=%s, tMap.get(schar)=%s".formatted(schar, tMap.containsKey(schar), tMap.get(schar)));
            if(tMap.containsKey(schar)) {
                Integer count = tMap.get(schar);
                tMap.put(schar, ++count);
            } else {
                tMap.put(schar, 1);
            }

        }

        //System.out.println("sMap=%s \n tMap=%s".formatted(sMap, tMap));

        return sMap.equals(tMap);

    }
}
