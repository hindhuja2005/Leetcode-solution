class Solution:
    def nthUglyNumber(self, n: int) -> int:
        ugly_set=set()
        ugly_set.add(1)
        cur_ugly=1
        for i in range(n):
            cur_ugly=min(ugly_set)
            ugly_set.remove(cur_ugly)
            ugly_set.add(cur_ugly*2)
            ugly_set.add(cur_ugly*3)
            ugly_set.add(cur_ugly*5)
        return cur_ugly