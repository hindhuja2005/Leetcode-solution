class Solution:
    def doesValidArrayExist(self, derived: List[int]) -> bool:
        res=0
        for i in derived:
            res=res^i
        if res==0:
            return True
        return False