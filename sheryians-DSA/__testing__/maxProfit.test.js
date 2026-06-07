const maxProfit = require("../main/maxProfit")

describe("Best Time to Buy and Sell Stock", () => {
    test("Example 1", () => {
        expect(maxProfit([7, 1, 5, 3, 6, 4])).toBe(5);
    });

    test("Example 2", () => {
        expect(maxProfit([7, 6, 4, 3, 1])).toBe(0);
    });

    test("Single day", () => {
        expect(maxProfit([5])).toBe(0);
    });

    test("Increasing prices", () => {
        expect(maxProfit([1, 2, 3, 4, 5])).toBe(4);
    });

    test("Profit at end", () => {
        expect(maxProfit([3, 2, 6, 1, 8])).toBe(7);
    });
});