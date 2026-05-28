/**
 Do not return anything, modify nums in-place instead.
 */

class Move{


    moveZeroes(nums) {
        let first = 0
        nums.forEach((ele, i) => {
            if (ele != 0) {
                this.swap(nums, first, i)
                first++
            }
        })
        return nums
    };

    swap(nums, left, right) {
        [nums[left], nums[right]] = [nums[right], nums[left]]

    }

}

const test=new Move()
console.log(test.moveZeroes([1,2,0,4]))

module.exports=Move






