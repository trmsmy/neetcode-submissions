class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        
        if not nums: return False
        map = {}
        for i, num in enumerate(nums):
            prevIndex = map.setdefault(num, i)
            #print(f'i={i}, num={num} , found={prevIndex}')
            if prevIndex != i:
                return True;
        
        print(f' end of method ')
        return False