const mergeIntervals = require("../main/mergeIntervals");



describe("Merge Intervals", () => {
    test("Example 1", () => {
        expect(
            mergeIntervals([
                [1, 3],
                [2, 6],
                [8, 10],
                [15, 18],
            ])
        ).toEqual([
            [1, 6],
            [8, 10],
            [15, 18],
        ]);
    });

    test("Example 2", () => {
        expect(
            mergeIntervals([
                [1, 4],
                [4, 5],
            ])
        ).toEqual([[1, 5]]);
    });

    test("Single interval", () => {
        expect(mergeIntervals([[1, 5]])).toEqual([[1, 5]]);
    });

    test("Empty array", () => {
        expect(mergeIntervals([])).toEqual([]);
    });

    test("Unsorted intervals", () => {
        expect(
            mergeIntervals([
                [8, 10],
                [1, 3],
                [2, 6],
            ])
        ).toEqual([
            [1, 6],
            [8, 10],
        ]);
    });
});