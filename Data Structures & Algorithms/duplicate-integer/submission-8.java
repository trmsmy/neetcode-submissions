class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums == null || nums.length == 0) return false;
        Map<Integer, Integer> map = new HashMap<>(nums.length);

        for(Integer i=0;i<nums.length;i++) {
            Integer found = map.put(Integer.valueOf(nums[i]), i);
            //System.out.println("Status: i=" + i + ", nums[i]=" + nums[i] + ", map="+map+", Found: " + found);
            
            if(found != null) {
                return true;
            }
            else continue;
        }

        return false;
    }
}