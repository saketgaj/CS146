def coinChange(self, coins: List[int], amount: int) -> int:
        arr = [amount+1] * (amount+1)
        arr[0] = 0

        for i in range(len(coins)):
            for j in range(coins[i], amount+1):
                arr[j] = min(arr[j], arr[j-coins[i]] + 1);
        
        if arr[amount] > amount:
            return -1
        else:
            return arr[amount]
