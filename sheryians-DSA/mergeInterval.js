let intervals = [[1, 3], [4, 6], [8, 10], [1, 18]]

/*************  ✨ Windsurf Command ⭐  *************/
/**
 * This function takes an array of intervals and merges overlapping intervals.
 * It does this by sorting the array based on the first element of each interval.
 * Then it iterates over the sorted array and merges any overlapping intervals.
 * The function returns an array of merged intervals.
 * @param {Array} arr - an array of intervals
 * @returns {Array} - an array of merged intervals
 */
/*******   ✨ Windsurf Command ⭐  *******/
function merge(arr) {
    // the sorting pupose is if the last number of one array is greater than the first number of next array
    // then we have to merge them
    // by sorting we can achieve this becuse the highest number will come first if the array is sorted and we are sroting with 
    // the first number arr[0][0] in sorted part of array 
    arr.sort((a, b) => a[0] - b[0])
    let ans = []
    let curr = arr[0]
    for (let i = 1; i < arr.length; i++) {
        let next = arr[i]
        if (curr[1] >= next[0]) {
            curr[0] = Math.min(curr[0], next[0])
            curr[1] = Math.max(curr[1], next[1])
        } else {
            ans.push([...curr])
            curr = next

        }
    }
    ans.push([...curr])
    return ans


}
console.log(merge(intervals));