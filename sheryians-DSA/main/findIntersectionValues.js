/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var findIntersectionValues = function (nums1, nums2) {
    let first = 0
    let last = 0
    for (let i of nums1) {
        if (nums2.includes(i)) first++
    }
    for (let i of nums2) {
        if (nums1.includes(i)) last++
    }

    return [first, last]
};


module.exports = findIntersectionValues