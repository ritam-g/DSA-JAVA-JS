/**
 * @param {number[]} nums
 * @return {number}
 */
var longestConsecutive = function (arr) {
    if (arr.length == 0) return 0
    arr.sort((a, b) => a - b)
    let curr = 1
    let max = 1

    for (let i = 0; i < arr.length - 1; i++) {
        if (arr[i] === arr[i + 1] - 1) curr++
        else if (arr[i] === arr[i + 1]) continue
        else {
            max = Math.max(curr, max)
            curr = 1
        }

    }

    return Math.max(curr, max)
};

module.exports = longestConsecutive