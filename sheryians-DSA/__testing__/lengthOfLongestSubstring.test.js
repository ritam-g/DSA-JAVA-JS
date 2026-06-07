const { lengthOfLongestSubstring } = require("../main/lengthOfLongestSubstring");
describe("Length Of Longest Substring Without Repeating Characters", () => {

    test("Example 1", () => {
        expect(
            lengthOfLongestSubstring("abcabcbb")
        ).toBe(3);
    });

    test("Example 2", () => {
        expect(
            lengthOfLongestSubstring("bbbbb")
        ).toBe(1);
    });

    test("Example 3", () => {
        expect(
            lengthOfLongestSubstring("pwwkew")
        ).toBe(3);
    });

    test("Empty String", () => {
        expect(
            lengthOfLongestSubstring("")
        ).toBe(0);
    });

    test("Single Character", () => {
        expect(
            lengthOfLongestSubstring("a")
        ).toBe(1);
    });

    test("Duplicate Characters", () => {
        expect(
            lengthOfLongestSubstring("abba")
        ).toBe(2);
    });

    test("Long Unique String", () => {
        expect(
            lengthOfLongestSubstring("abcdef")
        ).toBe(6);
    });

});