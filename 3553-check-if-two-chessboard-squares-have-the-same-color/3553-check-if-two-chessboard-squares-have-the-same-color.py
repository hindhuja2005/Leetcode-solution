class Solution:
    def checkTwoChessboards(self, coordinate1: str, coordinate2: str) -> bool:
        a={'a':1,'b':2,'c':3,'d':4,'e':5,'f':6,'g':7,'h':8}
        b,c=0,0
        for i in coordinate1:
            if i in a.keys():
                b+=a[i]
            else:
                b+=int(i)
        for i in coordinate2:
            if i in a.keys():
                c+=a[i]
            else:
                c+=int(i)
        if b%2 == c%2:
            return True
        else:
            return False