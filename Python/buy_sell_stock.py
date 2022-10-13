def maxProfit(prices):
    max_profit = 0
    for i in range(len(prices)-1):
        for j in range(i + 1,len(prices)):
            if prices[j] - prices[i] > max_profit:
                max_profit = prices[j] - prices[i]
    return max_profit

if __name__ == "__main__":
    prices = [7,1,5,3,6,4]
    print(maxProfit(prices))
