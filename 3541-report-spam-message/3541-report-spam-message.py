class Solution:
    def reportSpam(self, message: List[str], bannedWords: List[str]) -> bool:
        count=0
        bannedWords=list(set(bannedWords))
        m=Counter(message)
        for i in bannedWords:
            if i in m.keys():
                count=count+m[i]
            if count>=2:
                return True
        return False