class Solution {
    public int[] twoSum(int[] nums, int target) {
        Integer diffPos = -1; 
        Integer nPos = -1 ;
        Map<Integer, Integer> pos = new HashMap<>();
        for(nPos=0; nPos< nums.length; nPos++) {
            
            int n = nums[nPos];
            int diff = target - n;
            Integer nObj = Integer.valueOf(n);
            
            if(!pos.containsKey(nObj)) {
                pos.put(nObj, nPos);
            }

            diffPos = pos.get(Integer.valueOf(diff));
            // System.out.println("nPos=%s, n=%s, diff=%s, diffPos=%s".formatted(
            //     nPos,
            //     nObj,
            //     diff, 
            //     diffPos
            // ));

            if(diffPos != null && diffPos != nPos) {
                break;
            }
        }

        //System.out.println("pos=%s".formatted(pos));

        return (nPos <= diffPos) ? new int[]{nPos, diffPos} : new int[]{diffPos, nPos} ;
    }
    
}
