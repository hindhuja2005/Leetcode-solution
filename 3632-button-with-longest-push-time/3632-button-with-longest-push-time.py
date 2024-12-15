class Solution:
    def buttonWithLongestTime(self, events: List[List[int]]) -> int:
        max_time=events[0][1]
        max_index=events[0][0]
        for i in range(1,len(events)):
            diff=events[i][1]-events[i-1][1]
            if diff>max_time:
                max_index=events[i][0]
                max_time=diff
            elif diff==max_time:
                if events[i][0]<max_index:
                    max_index=events[i][0]
        return max_index