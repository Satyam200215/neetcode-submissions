class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        ans=[]
        r=0
        l=len(numbers)-1

        while r<l:
            currsum=numbers[r] + numbers[l]

            if currsum>target:
                l=l-1
            elif currsum<target:
                r=r+1
            else:
                ans.append(r+1)
                ans.append(l+1)
                break
        return ans