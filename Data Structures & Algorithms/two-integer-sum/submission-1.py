class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        ans=[]
        size=len(nums)
        for i in range(0,size-1):
            for j in range(i+1,size):
                if(nums[i]+nums[j]==target):
                    ans.append(i)
                    ans.append(j)
                    break
        return ans
