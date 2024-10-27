class MyQueue:

    def __init__(self):
        self.myqueue=[]
        self.a=[]
    def push(self, x: int) -> None:
        self.myqueue.append(x)
        
    def pop(self) -> int:
        return self.myqueue.pop(0)
    def peek(self) -> int:
        return self.myqueue[0]
    def empty(self) -> bool:
        if len(self.myqueue)==0:
            return True
        return False
# Your MyQueue object will be instantiated and called as such:
# obj = MyQueue()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.peek()
# param_4 = obj.empty()