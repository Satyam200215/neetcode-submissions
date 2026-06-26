class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        ans=[]
        size=len(numbers)
        for i in range(0,size-1):
            for j in range(i+1,size):
                if numbers[i]+numbers[j]==target:
                    ans.append(i+1)
                    ans.append(j+1)
                    break
        return ans
