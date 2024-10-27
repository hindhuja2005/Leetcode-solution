import collections
class Solution:
    def isValid(self, s: str) -> bool:
        stack=[]
        for a in s:
            if a in '([{':
                stack.append(a)
            else:
                if not stack or \
                    (a==')' and stack[-1]!='(') or \
                    (a==']' and stack[-1]!='[') or \
                    (a=='}' and stack[-1]!='{'):
                    return False
                stack.pop()
        return not stack