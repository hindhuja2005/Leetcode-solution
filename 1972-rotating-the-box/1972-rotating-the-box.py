class Solution:
    def rotateTheBox(self, box: List[List[str]]) -> List[List[str]]:
        box1 = [row[:] for row in box]
        for i in range(len(box1)):
            empty = len(box1[0]) - 1
            for j in range(len(box1[0]) - 1, -1, -1): 
                if box1[i][j] == "#":  
                    box1[i][j], box1[i][empty] = ".", "#"  
                    empty -= 1 
                elif box1[i][j] == "*": 
                    empty = j - 1  
        rotated = [[box1[j][i] for j in range(len(box1) - 1, -1, -1)] for i in range(len(box1[0]))]

        return rotated