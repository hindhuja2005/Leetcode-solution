class Solution:
    def countMaxOrSubsets(self, nums: List[int]) -> int:
        max_or = 0
        subset_or_count = Counter()
        for i in range(1, len(nums) + 1):
            for subset in combinations(nums, i):
                subset_or = reduce(lambda x, y: x | y, subset)
                subset_or_count[subset_or] += 1
                max_or = max(max_or, subset_or)
        
        return subset_or_count[max_or]