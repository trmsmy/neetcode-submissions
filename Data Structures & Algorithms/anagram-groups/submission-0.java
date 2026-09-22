class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> strMap = new HashMap<>();
        for(int i=0; i<strs.length; i++) {
            String s = strs[i];
            String charInts = toCharInts(s);
            //System.out.println("s = %s , charInts = %s".formatted(s, charInts));
            
            if(strMap.containsKey(charInts)){
                List<String> list = strMap.get(charInts);
                list.add(s);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                strMap.put(charInts, list);
            }
        }

        //System.out.println("Values: " + strMap.values());
        return strMap.values().stream().toList();
    }

    private String toCharInts(String s) {
        String str = null;
        int[] arr = new int[26];
        for(int i=0; i<s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            arr[idx]++;
            str = Arrays.toString(arr);
        }

        return str;
    }
}
