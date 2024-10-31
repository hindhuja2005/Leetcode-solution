class Solution:
    def timeRequiredToBuy(self, tickets: List[int], k: int) -> int:
        sum=0
        for i in range(len(tickets)):
            if i<=k:
                if tickets[i]>=tickets[k]:
                    sum=sum+tickets[k]
                else:
                    sum=sum+tickets[i]
            else:
                if tickets[i]>=tickets[k]:
                    sum=sum+(tickets[k]-1)
                else:
                    sum=sum+tickets[i]
        return sum