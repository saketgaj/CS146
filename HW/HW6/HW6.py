def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = []
        nums.sort()
        for i in range(len(nums)-2):
            x = nums[i]
            l = i+1
            r = len(nums)-1
            sum = 0 - x
            while l < r:
                if nums[l] + nums[r] == sum:
                    triplet = [x, nums[l], nums[r]]
                    if triplet not in result:
                        result.append(triplet)
                    while l < r and nums[l] == nums[l+1]:
                        l += 1
                    while l < r and nums[r] == nums[r-1]:
                        r -= 1
                    l += 1
                    r -= 1
                elif nums[l] + nums[r] > sum:
                    r -= 1
                else:
                    l += 1
        return result
