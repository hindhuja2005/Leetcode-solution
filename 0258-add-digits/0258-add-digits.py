class Solution:
    def addDigits(self, num: int) -> int:
        if num<10:
            return num
        while num>=10:
            sum=0
            for i in str(num):
                sum=sum+int(i)
            num=sum
        return sum