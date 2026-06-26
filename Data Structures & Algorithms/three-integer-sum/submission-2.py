class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        ans = []
        nums.sort()
        size = len(nums)
        
        for i in range(0, size - 2):
            # Skip duplicate values for the first element
            if i > 0 and nums[i] == nums[i - 1]:
                continue
                
            low = i + 1
            high = size - 1
            
            while low < high:
                # Calculate the fresh sum for the current triplet
                currsum = nums[i] + nums[low] + nums[high]
                
                if currsum > 0:
                    high -= 1
                elif currsum < 0:
                    low += 1
                else:
                    ans.append([nums[i], nums[low], nums[high]])
                    
                    # Move both pointers after finding a valid triplet
                    low += 1
                    high -= 1
                    
                    # Skip duplicate values for the second and third elements
                    while low < high and nums[low] == nums[low - 1]:
                        low += 1
                    while low < high and nums[high] == nums[high + 1]:
                        high -= 1
                        
        return ans