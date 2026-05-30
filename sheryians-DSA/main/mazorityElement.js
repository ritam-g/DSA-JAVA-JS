/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function (nums) {
    // effectient way

    let count = 0
    let ans = null

    for (let val of nums) {
        if (count == 0) {
            ans = val
        }
        //easy but effective
        if (val == ans){
            count++
        }
        else{
            count--
        }
    }
    return ans 
};


module.exports = majorityElement