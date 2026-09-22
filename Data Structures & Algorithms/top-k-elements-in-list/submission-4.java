class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // nums = [1,2,3,3,3,3], k = 2
        Map<Integer, Integer> digitToCounts = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            digitToCounts.compute(nums[i], (key, value) -> value == null? 1 : value + 1);
        }
        //System.out.println("digitToCounts: %s".formatted(digitToCounts));

        //1: 1, 2: 1, 3: 4 
        List<List<Integer>> countToDigits = new ArrayList<>(nums.length + 1);
        for(int i=0; i<=nums.length; i++) {
            countToDigits.add(i, new ArrayList<>());    
        }
       
        //System.out.println("countToDigits: %s".formatted(countToDigits));

        //o: [], 1: [1,2] ; 2: [], 3: [], 4: [3]..
        for(Integer digit: digitToCounts.keySet()) {
            Integer count = digitToCounts.get(digit);
            countToDigits.get(count).add(digit);
        }

        //System.out.println("countToDigits: %s".formatted(countToDigits));

        List<Integer> ans = new ArrayList<>();
        for(int i= countToDigits.size() - 1; i>=0; i--) {
            ans.addAll(countToDigits.get(i));
            if(ans.size() >= k) break;         

        }

        return ans.subList(0, k).stream().mapToInt(Integer::intValue).toArray();
    }
}
