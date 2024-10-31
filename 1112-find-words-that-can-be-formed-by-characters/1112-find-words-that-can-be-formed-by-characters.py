class Solution:
    def countCharacters(self, words: List[str], chars: str) -> int:
        count=0
        for word in words:
            flag=False
            for c in word:
                if chars.count(c)<word.count(c):
                    flag=True
            if flag==False:
                count+=len(word)
        return count