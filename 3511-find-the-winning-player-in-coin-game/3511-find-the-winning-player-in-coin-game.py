class Solution:
    def losingPlayer(self, x: int, y: int) -> str:
        win="Bob"
        while x>=1 and y>=4:
            x=x-1
            y=y-4
            if win=="Bob":
                win="Alice"
            else:
                win="Bob"
        return win