class Solution:
    def buyChoco(self, prices: List[int], money: int) -> int:
        a=money
        money=money-prices.pop(prices.index(min(prices)))
        money=money-prices.pop(prices.index(min(prices)))
        if money>=0:
            return money
        else:
            return a
