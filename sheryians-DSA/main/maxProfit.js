function maxProfit(prices) {
    let minPrice = prices[0];
    let maxProfitValue = 0;

    for (const price of prices) {
        minPrice = Math.min(minPrice, price);
        maxProfitValue = Math.max(maxProfitValue, price - minPrice);
    }

    return maxProfitValue;
}

module.exports = maxProfit;