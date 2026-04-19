function moveZeroes(nums) {
    nums.sort((a, b) => a - b)
    let j = 0
    for (let i = 0; i < nums.length; i++) {
        if (nums[i] != 0) {
            swap(nums, i, j)
            j++
        }

    }
    return nums
};

function swap(nums, i, j) {
    let temp = nums[i]
    nums[i] = nums[j]
    nums[j] = temp
}

console.log( moveZeroes([0, 1, 0, 3, 12,33,2,3,2,323,23]))