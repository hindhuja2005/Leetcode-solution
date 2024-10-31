class Solution:
    def lemonadeChange(self, bills: List[int]) -> bool:
        if bills[0]!=5:
            return False
        a=b=c=0
        for i in bills:
            if i==5:
                a=a+1
            else:
                if i==10:
                    if a>0:
                        a=a-1
                    else:
                        return False
                    b=b+1
                elif i==20:
                    if a>0 and b>0:
                        a=a-1
                        b=b-1
                        c=c+1
                    elif a>=3:
                        a=a-3
                        c=c+1
                    else:
                        return False
        return True